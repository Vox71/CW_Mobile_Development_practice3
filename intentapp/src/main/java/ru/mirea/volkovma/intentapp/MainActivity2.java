package ru.mirea.volkovma.intentapp;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView tvTransfer;
    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvTransfer = findViewById(R.id.textViewTransfer);
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            String value = extras.getString("intentKey");
            tvTransfer.setText(String.format("Квадрат номера в списке: %d. Текущее время:" +  "%s", 1, value));
        }
    }
}