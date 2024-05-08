package com.example.lab7;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        // 액티비티가 시작될 때 첫 번째 프래그먼트를 보여줍니다.
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, new com.example.quiz.Fragment1())
                    .commit();
        }
    }

    // 다른 프래그먼트로 교체하는 메서드 예시입니다.
    public void switchFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .commit();
    }
}
