package com.example.faragz;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class thirdPage extends AppCompatActivity {
    private Button button3,RoomsTaken;
    private ArrayList<String> roomsTakenList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int i=0;
        setContentView(R.layout.activity_third_page);
        TextView name = findViewById(R.id.o1Name);
        TextView price = findViewById(R.id.textView3);
        TextView type = findViewById(R.id.textView2);
        TextView roomNumber = findViewById(R.id.o4rn);

        String thName = getIntent().getStringExtra("Keyname");
        String thRoomNo = getIntent().getStringExtra("KeyRoomNo");
        String thPrice = getIntent().getStringExtra("KeyPrice");
        String thTotal = getIntent().getStringExtra("keytotal");
        String thtype = getIntent().getStringExtra("keyType");

        price.setText(thPrice.toString());

        name.setText(thName.toString());

        type.setText(thtype.toString());

        Room [] rooms = new Room[Integer.parseInt(thTotal)];


        if (thtype.equals("Single")) {
            rooms[i] =  new SingleRoom(Integer.parseInt(thRoomNo));
            roomNumber.setText(rooms[i].toString());
        } else {
            rooms[i] =  new DoubleRoom(Integer.parseInt(thRoomNo));
            roomNumber.setText(rooms[i].toString());
        }

        roomsTakenList.add(thRoomNo);

        i++;

        RoomsTaken = (Button) findViewById(R.id.roomz);
        RoomsTaken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(thirdPage.this,RoomCheck.class);
                intent4.putExtra("keyArraylist",roomsTakenList);
                startActivity(intent4);
            }
        });

        button3 = (Button) findViewById(R.id.nextReservation);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReservation();
            }
        });
    }
    public void openReservation(){
        Intent intent3 = new Intent(this,secondPage.class);
        startActivity(intent3);
    }
}