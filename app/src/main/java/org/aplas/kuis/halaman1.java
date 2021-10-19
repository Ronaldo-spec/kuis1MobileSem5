package org.aplas.kuis;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class halaman1 extends AppCompatActivity {

    VideoView videov;
    MediaController mediac;
    ImageButton clk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman1);

        VideoView simpleVideoView = (VideoView) findViewById(R.id.videoView);
        simpleVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cuci));
        MediaController mediaController = new MediaController(this);
        VideoView objek = (VideoView) findViewById(R.id.videoView);
        objek.setMediaController(mediaController);

        ImageButton back= findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(halaman1.this,MainActivity.class);
                startActivity(a);
            }
        });

        ImageButton next= findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(halaman1.this,halaman2.class);
                startActivity(a);
            }
        });
    }
}
