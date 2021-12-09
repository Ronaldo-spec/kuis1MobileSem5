package org.aplas.kuis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn2, btn3, btn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton cucitangan= findViewById(R.id.cucitangan);
        cucitangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,halaman1.class);
                startActivity(a);
            }
        });

        ImageButton jagajarak= findViewById(R.id.jaga_jarak);
        jagajarak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,halaman2.class);
                startActivity(a);
            }
        });

        ImageButton pakaimasker= findViewById(R.id.masker);
        pakaimasker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,halaman3.class);
                startActivity(a);
            }
        });

        ImageButton vaksin= findViewById(R.id.vaksin);
        vaksin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,halaman4.class);
                startActivity(a);
            }
        });

        ImageButton saran= findViewById(R.id.media5);
        saran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,MainSaran.class);
                startActivity(a);
            }
        });

        ImageButton quiz= findViewById(R.id.media6);
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,halamanquiz.class);
                startActivity(a);
            }
        });
    }


}
