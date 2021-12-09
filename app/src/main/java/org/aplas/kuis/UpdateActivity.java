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

public class UpdateActivity extends AppCompatActivity {

    protected Cursor cursor;
    Database database;
    Button btn_simpan;
    EditText nama, email,saran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        FloatingActionButton back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(UpdateActivity.this,MainSaran.class);
                startActivity(a);
            }
        });

        database = new Database(this);
        nama = findViewById(R.id.nama);
        email = findViewById(R.id.email);
        saran = findViewById(R.id.saran);
        btn_simpan  = findViewById(R.id.btn_simpan);

        SQLiteDatabase db=database.getReadableDatabase();
        cursor = db.rawQuery("select * from protokol where nama = '" +
                getIntent().getStringExtra("nama")+"'", null);
        cursor.moveToFirst();
        if (cursor.getCount()>0){
            cursor.moveToPosition(0);
            nama.setText(cursor.getString(0).toString());
            email.setText(cursor.getString(1).toString());
            saran.setText(cursor.getString(2).toString());

        }
        btn_simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase db = database.getWritableDatabase();
                db.execSQL("update protokol set nama = '" +
                        nama.getText().toString() +"', email= '" +
                        email.getText().toString() +"', saran= '" +
                        saran.getText().toString() + "' where nama = '" +
                        getIntent().getStringExtra("nama")+"'");

                MainSaran.ma.RefreshList();
                finish();

            }
        });
    }
}
