package com.example.mylifecycle;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("LifeCycle", "onCreate() 호출");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LifeCycle", "onStart() 호출");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LifeCycle", "onStop()() 호출");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LifeCycle", "onDestroy() 호출");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LifeCycle", "onPause() 호출");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LifeCycle", "onResume() 호출");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("LifeCycle", "onRestart() 호출");
    }
}