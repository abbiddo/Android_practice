package com.sy.example.mp3_player;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp=MediaPlayer.create(this, R.raw.wakeup);
        mp.setLooping(false);

        tv=this.findViewById(R.id.playbutton);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mp.isPlaying()){
                    mp.start();
                    tv.setText("Stop");
                }
                else{
                    mp.pause();
                    tv.setText("Start");
                }
            }
        });
    }
}