package com.example.vip.jobago;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class Mail extends AppCompatActivity {

    Button Trend;
    Button Play;
    VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);

        Trend = (Button)findViewById(R.id.button6);
        Play = (Button)findViewById(R.id.button5);
        video = (VideoView) findViewById(R.id.videoView);
        Trend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mail.this, Trend.class);
                startActivity(intent);
            }
        });
    }
     public void videplay(View v){
        String videopath = "android.resource://com.example.vip.jobago/"+ R.raw.videoplayback;
         Uri uri = Uri.parse(videopath);
         video.setVideoURI(uri);
         video.start();
     }


}
