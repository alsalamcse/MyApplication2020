package habeb.wardy.myapplication2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Orders extends AppCompatActivity
{
    private Button mm1, dr1,sw1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        mm1=(Button)findViewById(R.id.mm1);
        dr1=(Button)findViewById(R.id.dr1);
        sw1=(Button)findViewById(R.id.sw1);


        mm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent(getApplicationContext(),OrderMainMeals.class);
                startActivity(i);

            }
        });

        dr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), OrderDrink.class);
                startActivity(i);
            }
        });

        sw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), OrderSweet.class);
                startActivity(i);
            }
        });

    }
}
