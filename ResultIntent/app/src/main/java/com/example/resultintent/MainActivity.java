package com.example.resultintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText emailEditText, passwordEditText;
    private TextView statusText;
    private Button loginButton;
    ActivityResultLauncher<Intent> launcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);
        statusText = findViewById(R.id.loginStatus);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// 아이디와 비밀번호 입력값을 가져오기
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

// 두 번째 화면으로 전환하면서 아이디와 비밀번호 데이터 전달
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                intent.putExtra("ID", email);
                intent.putExtra("Password", password);
                launcher.launch(intent);
            }
        });
        launcher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),result -> {
            if (result.getResultCode() == Activity.RESULT_OK) {
                Intent data = result.getData();
                statusText.setText(data.getStringExtra("status"));
            }
        });
    }
}