package org.aplas.kuis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class halaman3 extends AppCompatActivity {

    private RecyclerView rvProtokol;
    private ArrayList<Protokol> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman3);

        rvProtokol = findViewById(R.id.rv_protokol);
        rvProtokol.setHasFixedSize(true);

        list.addAll(ProtokolData.getlistData());
        showRecyclerList();
    }
    private void showRecyclerList() {
        rvProtokol.setLayoutManager(new LinearLayoutManager(this));
        ListProtokolAdapter listProtokolAdapter = new ListProtokolAdapter(list);
        rvProtokol.setAdapter(listProtokolAdapter);

        listProtokolAdapter.setOnItemClickCallback(new ListProtokolAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Protokol protokol) {
//                showSelectedProtokol(data);
                Intent moveIntent = new Intent(halaman3.this, DetailProtokol.class);
                moveIntent.putExtra(DetailProtokol.ITEM_EXTRA, protokol);
                startActivity(moveIntent);
            }
        });
    }
//    private void showSelectedProtokol(Protokol protokol){
//        Toast.makeText(this, "Kamu memilih " + protokol.getName(), Toast.LENGTH_SHORT).show();
//
//    }

}
