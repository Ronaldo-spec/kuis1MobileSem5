package org.aplas.kuis;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DetailActivity extends AppCompatActivity {

    protected Cursor cursor;
    Database database;
    Button btn_simpan;
    TextView nama, email, saran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        FloatingActionButton back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(DetailActivity.this,MainSaran.class);
                startActivity(a);
            }
        });
        database = new Database(this);
        nama = findViewById(R.id.nama);
        email = findViewById(R.id.email);
        saran = findViewById(R.id.saran);
        btn_simpan  = findViewById(R.id.btn_simpan);

        SQLiteDatabase db=database.getWritableDatabase();
        cursor = db.rawQuery("select * from protokol where nama = '" +
                getIntent().getStringExtra("nama")+"'", null);
        cursor.moveToFirst();
        if (cursor.getCount()>0){
            cursor.moveToPosition(0);
            nama.setText(cursor.getString(0).toString());
            email.setText(cursor.getString(1).toString());
            saran.setText(cursor.getString(2).toString());

        }
    }
}