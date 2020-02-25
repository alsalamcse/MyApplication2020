package habeb.wardy.myapplication2020;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {
    private ListView lstvTasks;
    public static TasksAdapter tasksAdapter=new TasksAdapter();


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        tasksAdapter=new TasksAdapter(getContext(),R.id.);

        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        lstvTasks = view.findViewById(R.id.lstvTasks);
        lstvTasks.setAdapter(tasksAdapter);

        return view;

    }

}
