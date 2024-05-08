package com.example.resultintent;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class SubActivity extends AppCompatActivity {
    private TextView displayIdTextView, displayPasswordTextView, statusTextView;
    String id, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        displayIdTextView = findViewById(R.id.displayIdTextView);
        displayPasswordTextView = findViewById(R.id.displayPasswordTextView);
        statusTextView = findViewById(R.id.loginSuccess);
        // 인텐트에서 아이디와 비밀번호 데이터 가져오기
        Intent intent = getIntent();

        if (intent != null) {
            id = intent.getStringExtra("ID");
            password = intent.getStringExtra("Password");
// 화면에 아이디와 비밀번호 출력
            displayIdTextView.setText("아이디: " + id);
            displayPasswordTextView.setText("비밀번호: " + password);
        }
    }

    public void check(View e){
// 로그인 로직 (더미 데이터 사용)
        Intent intent= new Intent();
        if (isUserValid(id, password)) {
// 인증 성공 시 메인 액티비티로 이동
            intent.putExtra("status", "로그인 성공!!!!");
        } else {
// 인증 실패 시 메시지 표시
// 실제로는 실패 처리 및 메시지를 표시하는 방식을 변경해야 합니다.
            intent.putExtra("status", "로그인 실패!!!!");
        }
        setResult(RESULT_OK, intent);
        finish();
    }
    private boolean isUserValid(String username, String password) {
// 실제로는 여기에서 서버 또는 로컬 데이터베이스를 통해 인증을 확인해야 합니다.
// 이 예제에서는 더미 데이터를 사용하여 단순하게 인증 성공 여부를 판단합니다.
        return username.equals("kim") && password.equals("1234");
    }
}