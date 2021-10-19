package org.aplas.kuis;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailProtokol extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_protokol);

        ImageView imgProtokol = findViewById(R.id.imgProtokol);
        TextView tvProtokolname = findViewById(R.id.tvProtokolName);
        TextView tvProtokolDetail = findViewById(R.id.tvProtokolDetail);


        Protokol protokol = getIntent().getParcelableExtra(ITEM_EXTRA);
        if(protokol != null){
            Glide.with(this)
                    .load(protokol.getPhoto())
                    .into(imgProtokol);
            tvProtokolname.setText(protokol.getName());
            tvProtokolDetail.setText(protokol.getDetail());
        }
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Video Penjelasan");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
