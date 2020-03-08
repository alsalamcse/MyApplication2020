package habeb.wardy.myapplication2020.Maniging;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import habeb.wardy.myapplication2020.Data.MyTask;
import habeb.wardy.myapplication2020.R;

public class MyUserAdapter extends ArrayAdapter<MyTask>
{

    public MyUserAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view= LayoutInflater.from(getContext()).inflate(R.layout.taskitem,parent,false);
       TextView name=view.findViewById(R.id.tvname);
       TextView much=view.findViewById(R.id.tvmuch);

       MyTask myTask=getItem(position);

       name.setText(myTask.getName());


      // onClick
      // Toast.makeText(getContext(),"calling"+myUser.getPhone(), Toast.LENGTH_SHORT.show());






        return view;

    }
}
