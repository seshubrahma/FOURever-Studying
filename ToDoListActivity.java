package com.example.seshu.studyingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class ToDoListActivity extends AppCompatActivity {

    ListView eventList;
    ArrayList<String> eventNames;
    ArrayAdapter<String> eventAdapter;
    Button addButton;
    EditText editText;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_list);

        eventNames = new ArrayList<>();
        eventNames.add("asdf");
        intent = getIntent();

        eventList = (ListView) findViewById(R.id.event_List);
        addButton = (Button) findViewById(R.id.add_button);
        editText = (EditText) findViewById(R.id.edit_text);

        eventAdapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.item_text_view, eventNames);

        eventList.setAdapter(eventAdapter);

        addButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                String input = editText.getText().toString();
                if(!input.equals(""))
                {
                    eventNames.add(input);
                    eventAdapter.notifyDataSetChanged();
                    editText.setText("");
                }
            }
        });

    }
}
