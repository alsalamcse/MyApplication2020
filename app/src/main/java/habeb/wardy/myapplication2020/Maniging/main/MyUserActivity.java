package habeb.wardy.myapplication2020.Maniging.main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import habeb.wardy.myapplication2020.Data.MyTask;
import habeb.wardy.myapplication2020.Maniging.MyUserAdapter;
import habeb.wardy.myapplication2020.R;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MyUserActivity extends AppCompatActivity {

    private ListView listView;
    private MyUserAdapter myUserAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_user);

        listView=findViewById(R.id.listview);
       myUserAdapter=new MyUserAdapter(getBaseContext(),R.layout.taskitem);

       listView.setAdapter(myUserAdapter);
    }



    public void readFromFirebase(){
        FirebaseDatabase database=FirebaseDatabase.getInstance();
        FirebaseAuth auth=FirebaseAuth.getInstance();
        String uid=auth.getUid();
        DatabaseReference reference=database.getReference();

        reference.child("Tasks").child(uid).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                myUserAdapter.clear();
                for (DataSnapshot d:dataSnapshot.getChildren())
                {
                    MyTask task=d.getValue(MyTask.class);
                    Log.d("MyTask",task.toString());
                   myUserAdapter.add(task);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

}

    @Override
    protected void onResume() {
        super.onResume();
        readFromFirebase();
    }}
