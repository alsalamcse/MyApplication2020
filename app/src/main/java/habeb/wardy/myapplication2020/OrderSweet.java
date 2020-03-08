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

public class OrderSweet extends AppCompatActivity
{
     private TextView iceTX, koTX, chTX ;
     private FloatingActionButton iceC, konafa, choclate;
     private Button b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_sweet);

        iceTX=(TextView)findViewById(R.id.iceTX);
        koTX=(TextView)findViewById(R.id.koTX);
        chTX=(TextView)findViewById(R.id.chTX);
        iceC=(FloatingActionButton)findViewById(R.id.iceC);
        konafa=(FloatingActionButton)findViewById(R.id.konafa);
        choclate=(FloatingActionButton)findViewById(R.id.choclate);
        b3=(Button)findViewById(R.id.b3);

        iceC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        konafa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        choclate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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
