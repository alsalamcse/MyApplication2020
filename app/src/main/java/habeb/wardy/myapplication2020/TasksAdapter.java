package habeb.wardy.myapplication2020;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

public class TasksAdapter extends ArrayAdapter<MyApp>
{

    public TasksAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    public View getView(int position, View converView, ViewGroup parent)
    {
        //View vitem= LayoutInflater.from(getContext().);
       // TextView tvLemon=vitem.findViewById(R.id.lemon);
        //TextView tvOrange=vitem.findViewById(R.id.orange);
       // TextView tvApple=vitem.findViewById(R.id.apple);
        //TextView tvFish=vitem.findViewById(R.id.fish);
       // TextView tvchicken=vitem.findViewById(R.id.chicken);
       // TextView tvMeet=vitem.findViewById(R.id.meet);
       // TextView tvKonafa=vitem.findViewById(R.id.konafa);
      //  TextView tvChoclate=vitem.findViewById(R.id.choclate);
       // TextView tvIcecream=vitem.findViewById(R.id.iceC);

        MyApp myApp=getItem(position);





    }
}
