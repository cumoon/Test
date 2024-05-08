package kr.co.example.musicservice;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MusicService";
    Button start, stop;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = findViewById(R.id.start);
        stop = findViewById(R.id.stop);
        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }

     public void onClick(View src) {
            int id = src.getId(); // 뷰의 ID를 가져옵니다.

            if (id == R.id.start) { //switch문에서 오류가 발생하여 if문으로 변경
                Log.d(TAG, "onClick() start ");
                startService(new Intent(this, kr.co.example.musicservice.MusicService.class));
            } else if (id == R.id.stop) {
                Log.d(TAG, "onClick() stop");
                stopService(new Intent(this, kr.co.example.musicservice.MusicService.class));
            }
        }

    }
