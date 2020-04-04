package com.example.hpapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class Main2Activity extends AppCompatActivity {

    // Button button;

                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_main2);
                }

                public void onML(View view){
                    Intent intent = new Intent(this,ML.class);
                    startActivity(intent);
                }

                public void onEB(View view){
                    Intent intent = new Intent(this,EB.class);
                    startActivity(intent);
                }

                public void onLA(View view){
                    Intent intent = new Intent(this,LA.class);
                    startActivity(intent);
                }

                public void onNS(View view){
                    Intent intent = new Intent(this,NS.class);
                    startActivity(intent);
                }

                public void onWM(View view){
                    Intent intent = new Intent(this,WM.class);
                    startActivity(intent);
                }

                public void onAU(View view){
                    Intent intent = new Intent(this,AU.class);
                    startActivity(intent);
                }
}