package kr.co.example.week11test;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

class DBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "mycontacts.db";
    private static final int DATABASE_VERSION = 1;

    public DBHelper(Context context){
        super  (context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
    db.execSQL("CREATE TABLE contacts ( _id INTEGER PRIMARY KEY"+
    " AUTOINCREMENT, name TEXT, tel TEXT);");
}

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL("DROP TABLE IF EXISTS contacts");
    onCreate(db);
    }
}
public class MainActivity extends AppCompatActivity {

    DBHelper helper;
    SQLiteDatabase db;
    EditText edit_name, edit_tel;
    TextView edit_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helper = new DBHelper(this);
        try {
            db = helper.getWritableDatabase();
        } catch (SQLiteException ex){
            db = helper.getReadableDatabase();
        }
        edit_name = (EditText) findViewById(R.id.name);
        edit_tel = (EditText) findViewById(R.id.tel);
        edit_result = (TextView) findViewById(R.id.textView);
    }
    public void insert(View target) {
        String name = edit_name.getText().toString();
        String tel = edit_tel.getText().toString();
        db.execSQL("INSERT INTO contacts VALUES);
    }

}