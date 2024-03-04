package com.aisoft.androidvisibilitycontrolandtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    ImageView displayImage;
    Button showButton, goneButton;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        displayImage = findViewById(R.id.displayImage);
        showButton = findViewById(R.id.showButton);
        goneButton = findViewById(R.id.goneButton);




        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                displayImage.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, "Image is Visible", Toast.LENGTH_SHORT).show();

            }
        });




        goneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                displayImage.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this, "Image is Gone", Toast.LENGTH_SHORT).show();

            }
        });




    }
}