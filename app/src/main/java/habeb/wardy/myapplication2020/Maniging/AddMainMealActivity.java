package habeb.wardy.myapplication2020.Maniging;

import habeb.wardy.myapplication2020.Data.MyTask;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import habeb.wardy.myapplication2020.R;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddMainMealActivity extends AppCompatActivity
{
    private EditText edt1, edt2;
    private SeekBar sbpriority;
    private Button bb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_main_meal);

        edt1=findViewById(R.id.edt1);
        edt2=findViewById(R.id.edt2);
        sbpriority=findViewById(R.id.sbpriority);
        bb=findViewById(R.id.bb);


        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataHandler();
            }
        });
    }

    private void dataHandler()
    {
        boolean isok=true;
        String Name=edt1.getText().toString();
       String Much=edt2.getText().toString();


        if (Name.length()==0)
        {
           edt1.setError("Enter Title");
            isok=false;

        }

        if (Much.length()==0)
        {
           edt2.setError("Enter Subject");
            isok=false;
        }

        if (isok)
        {
            MyTask task=new MyTask();
            task.setName(Name);
            task.setMuch(Much);
            createMyTask(task);


        }


    }

    private void createMyTask(MyTask task)
    {
        //.1
        FirebaseDatabase firebaseDatabase=FirebaseDatabase.getInstance();
        //.2-save in database
        DatabaseReference reference = firebaseDatabase.getReference();//make a barameter ( with var)
        FirebaseAuth auth =FirebaseAuth.getInstance();//to get the user uid or details like email
        String uid = auth.getCurrentUser().getUid();
        task.setOwner(uid);

        String key = reference.child("Tasks").push().getKey();
        task.setKey(key);
        reference.child("Tasks").child(uid).child(key).setValue(task).addOnCompleteListener(AddMainMealActivity.this, new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful())
                {
                    Toast.makeText(AddMainMealActivity.this, "Add Successful", Toast.LENGTH_SHORT).show();
                    finish();
                }
                else {
                    Toast.makeText(AddMainMealActivity.this, "Add Failed"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    task.getException().printStackTrace();
                }
            }
        });


    }
}
