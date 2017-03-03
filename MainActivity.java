package com.example.seshu.studyingapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button timerButton;
    Button calendarButton;
    Button toDoListButton;
    Button statsButton;
    Context context;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();
        intent = getIntent();

       // toDoListButton = (Button)findViewById(R.id.to_do_list);
    }

    public void toDoListClick () {
        intent = new Intent(context, ToDoListActivity.class);
        startActivity(intent);
    }


}
