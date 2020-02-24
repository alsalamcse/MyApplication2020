package habeb.wardy.myapplication2020;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends AppCompatActivity
{
    private EditText edtFname;
    private EditText edtLname;
    private EditText edtPhone;
    private EditText edtEmail;
    private EditText edtPassword1, edtPassword2;
    private EditText edtReEnter;
    private Button btnS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        edtFname=findViewById(R.id.edtFname);
        edtLname=findViewById(R.id.edtLname);
        edtPhone=findViewById(R.id.edtPhone);
        edtEmail=findViewById(R.id.edtEmail);
        edtPassword1=findViewById(R.id.edtPassword);
        edtPassword2=findViewById(R.id.edtPassword);
        edtReEnter=findViewById(R.id.edtReEnter);
        btnS=findViewById(R.id.btnS);

        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                dataHandler();


            }
            private void dataHandler()
            {
                boolean isok=true;
                String email= edtEmail.getText().toString();
                String passw1=edtPassword1.getText().toString();
                String passw2=edtPassword2.getText().toString();
                String fname=edtFname.getText().toString();
                String lname=edtLname.getText().toString();
                String phone=edtPhone.getText().toString();
                if (email.length()<4 || email.indexOf('@')<0 || email.indexOf('.')<0){
                    edtEmail.setError("Wrong Email");
                    isok=false;
                }
                if (passw1.length()<8 || passw2.equals(passw2)== false)
                {
                    edtPassword1.setError("Have to be at least 8 char and the same password");
                    edtPassword2.setError("Have to be at least 8 char and the same password");
                    isok=false;
                }
                if (fname.length()==0)
                {
                    edtFname.setError("enter name");
                    isok=false;
                }
                if (isok)
                {

                }
            }
        });

    }
    private void createAcount(String email, String passw1, String fname, String lname, String phone)
    {
        FirebaseAuth auth=FirebaseAuth.getInstance();
        auth.createUserWithEmailAndPassword(email,passw1).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful())
                {
                    Toast.makeText(SignUp.this, "Sign up Successful", Toast.LENGTH_SHORT).show();
                    finish();
                }
                else
                    {
                        edtEmail.setError("Sign  up field");

                }

            }
        });
    }





}
