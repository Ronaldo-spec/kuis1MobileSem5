package org.aplas.kuis;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CreateActivity extends AppCompatActivity {
    protected Cursor cursor;
    Database database;
    Button btn_simpan;
    EditText nama, email,saran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        FloatingActionButton back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(CreateActivity.this,MainSaran.class);
                startActivity(a);
            }
        });

        database = new Database(this);
        nama = findViewById(R.id.nama);
        email = findViewById(R.id.email);
        saran = findViewById(R.id.saran);
        btn_simpan = findViewById(R.id.btn_simpan);
        btn_simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase db = database.getWritableDatabase();
                db.execSQL("insert into protokol(nama,email,saran) values('" +
                        nama.getText().toString() +"','" +
                        email.getText().toString() +"','" +
                        saran.getText().toString() + "')");
                MainSaran.ma.RefreshList();
                finish();
            }
        });
    }
}