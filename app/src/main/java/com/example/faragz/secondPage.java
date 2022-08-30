package com.example.faragz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class secondPage extends AppCompatActivity {
    private Button buttons,buttond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        buttons = (Button) findViewById(R.id.single);
        buttond = (Button) findViewById(R.id.double1);

        buttond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3d();
            }
        });

        buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3s();
            }
        });



    }

    public void openActivity3s() {
        EditText getname = (EditText) findViewById(R.id.name);
        EditText getRoomNumber = (EditText) findViewById(R.id.roomNumber);
        EditText totalRoom = (EditText) findViewById(R.id.totalrooms);
        EditText getPrice = (EditText) findViewById(R.id.price1);
        String name = getname.getText().toString();
        String RoomNumber = getRoomNumber.getText().toString();
        String price1 = getPrice.getText().toString();
        String type="Single";
        String total = totalRoom.getText().toString();


        Intent intent1 = new Intent(secondPage.this,thirdPage.class);
        intent1.putExtra("Keyname",name);
        intent1.putExtra("KeyRoomNo",RoomNumber);
        intent1.putExtra("KeyPrice",price1);
        intent1.putExtra("keyType",type);
        intent1.putExtra("keytotal",total);
        startActivity(intent1);


    }
    public void openActivity3d(){
        EditText getname = (EditText) findViewById(R.id.name);
        EditText getRoomNumber = (EditText) findViewById(R.id.roomNumber);
        EditText totalRoom = (EditText) findViewById(R.id.totalrooms);
        EditText getPrice = (EditText) findViewById(R.id.price1);
        String name = getname.getText().toString();
        String RoomNumber = getRoomNumber.getText().toString();
        String price1 = getPrice.getText().toString();
        String type="Double";
        String total = totalRoom.getText().toString();

        Intent intent2 = new Intent(secondPage.this,thirdPage.class);
        intent2.putExtra("Keyname",name);
        intent2.putExtra("KeyRoomNo",RoomNumber);
        intent2.putExtra("KeyPrice",price1);
        intent2.putExtra("keyType",type);
        intent2.putExtra("keytotal",total);
        startActivity(intent2);
    }

}