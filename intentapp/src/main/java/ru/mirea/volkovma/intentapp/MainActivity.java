package ru.mirea.volkovma.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private Button transfer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        transfer = findViewById(R.id.buttonTransfer);
        transfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long dateInMillis = System.currentTimeMillis();
                String format = "yyyy-MM-dd HH:mm:ss";
                final SimpleDateFormat sdf = new SimpleDateFormat(format);
                String dateString = sdf.format(new Date(dateInMillis));
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("intentKey", dateString);
                startActivity(intent);
            }
        });
    }
}