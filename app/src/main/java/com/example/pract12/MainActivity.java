package com.example.pract12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<State> states = new ArrayList<State>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // начальная инициализация списка
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list);
        // создаем адаптер
        StateAdapter adapter = new StateAdapter(this, states);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){

        states.add(new State ("M4A1", "STG", R.drawable.m4a1, "это смг"));
        states.add(new State ("M4A1", "SMG", R.drawable.m4a1, "это смг"));
        states.add(new State ("M4A1", "STG", R.drawable.m4a1, "это штурмгевер"));
        states.add(new State ("M4A1", "MG", R.drawable.m4a1, "это пулемёт"));
        states.add(new State ("M4A1", "HMG", R.drawable.m4a1,"это тяжёлый пулемёт"));
        states.add(new State ("M4A1", "HMG", R.drawable.m4a1,"это тяжёлый пулемёт"));
        states.add(new State ("M4A1", "HMG", R.drawable.m4a1,"это тяжёлый пулемёт"));
    }
}