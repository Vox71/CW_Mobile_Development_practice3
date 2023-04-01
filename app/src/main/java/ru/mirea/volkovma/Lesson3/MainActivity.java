package ru.mirea.volkovma.Lesson3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private String TAG=MainActivity.class.getSimpleName();

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    long dateInMillis = System.currentTimeMillis();
    String format = "yyyy-MM-dd HH:mm:ss";
    final SimpleDateFormat sdf = new SimpleDateFormat(format);
    String dateString = sdf.format(new Date(dateInMillis));
    int group_number = 1;

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "Invoke onSaveInstanceSate method" + dateString);
        outState.putString("data_value", dateString);
    }
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        String text = savedInstanceState.getString("data_value");
        Log.d(TAG, "Saved text:" + text);
        if (text != null) {
        }
    }
    public void invokeSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key", dateString);
        startActivity(intent);
    }
}