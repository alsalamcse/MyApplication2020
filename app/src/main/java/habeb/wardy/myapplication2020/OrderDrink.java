package habeb.wardy.myapplication2020;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class OrderDrink extends AppCompatActivity
{
    private TextView ljTX, ojTX, ajTX;
    private Button b2;
    private FloatingActionButton lemon, orange, apple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_drink);

        ljTX=(TextView)findViewById(R.id.ljTX);
        ojTX=(TextView)findViewById(R.id.ojTX);
        ajTX=(TextView)findViewById(R.id.ajTX);
        b2=(Button)findViewById(R.id.b2);
        lemon=(FloatingActionButton)findViewById(R.id.lemon);
        orange=(FloatingActionButton)findViewById(R.id.orange);
        apple=(FloatingActionButton)findViewById(R.id.apple);

        lemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataHandler1();
            }
        });

        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataHandler2();
            }
        });

        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataHandler3();
            }
        });



    }

    private void dataHandler1()
    {

    }

    private void dataHandler2()
    {

    }

    private void dataHandler3()
    {

    }


}
