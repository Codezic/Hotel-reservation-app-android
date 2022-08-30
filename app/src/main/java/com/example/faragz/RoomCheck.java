package com.example.faragz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class RoomCheck extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_check);
        Bundle bundle = getIntent().getExtras();
        ArrayList<String> roomsTakenList = bundle.getStringArrayList("keyArraylist");
        ListView listView = findViewById(R.id.listview);
        ArrayAdapter<String> rooms = new ArrayAdapter<String >(this, android.R.layout.simple_list_item_1,roomsTakenList);
        listView.setAdapter(rooms);
    }
}