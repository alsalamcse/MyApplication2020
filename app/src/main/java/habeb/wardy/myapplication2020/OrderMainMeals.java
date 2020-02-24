package habeb.wardy.myapplication2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class OrderMainMeals extends AppCompatActivity
{
    private TextView meTX,chTX,fishTX;
    private FloatingActionButton meet, chicken, fish;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_main_meals);

        meTX=(TextView)findViewById(R.id.meTX);
        chTX=(TextView)findViewById(R.id.chTX);
        fishTX=(TextView)findViewById(R.id.fishTX);
        meet=(FloatingActionButton)findViewById(R.id.meet);
        chicken=(FloatingActionButton)findViewById(R.id.chicken);
        fish=(FloatingActionButton)findViewById(R.id.fish);
        b1=(Button)findViewById(R.id.b1);

        meet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        chicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void  dataHandler1()
    {

    }

    private void dataHandler2()
    {

    }

    private void dataHandler3()
    {

    }

    private void creatMainmeals(MainMeals m)
    {
        FirebaseDatabase database=FirebaseDatabase.getInstance();
        DatabaseReference reference=database.getReference();
        FirebaseAuth auth=FirebaseAuth.getInstance();

    }

}
