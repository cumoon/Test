package com.example.optionmenu;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    View view1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view1 = findViewById(R.id.layout);
        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            getMenuInflater().inflate(R.menu.mymenu, menu);
            return true;
        }
        @Override
        public boolean onOptionsItemSelected (@NonNull MenuItem item){
            int id = item.getItemId();
            if (id == R.id.blue) {
                view1.setBackgroundColor(Color.BLUE);
                return true;
            } else if (id == R.id.green) {
                view1.setBackgroundColor(Color.GREEN);
                return true;
            } else if (id == R.id.red) {
                view1.setBackgroundColor(Color.RED);
                return true;
            }
            return super.onOptionsItemSelected(item);
        }
    }