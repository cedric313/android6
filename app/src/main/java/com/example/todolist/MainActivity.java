package com.example.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Todo goGarage = new Todo("aller au garage" , "19/03/2018");
    Todo goBred = new Todo("aller chercher le pain" , "19/02/2019");

        List<Todo> doIt = new ArrayList<>();
        doIt.add(goGarage);
        doIt.add(goBred);

        ListView listFaire = findViewById(R.id.lvActivity_main);
        TodoAdapter adapter = new TodoAdapter(MainActivity.this, doIt);
        listFaire.setAdapter(adapter);
    }
}
