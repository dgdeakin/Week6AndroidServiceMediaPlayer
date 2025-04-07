package com.example.week6androidserviceandbroadcastreceiver;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button musicButton, backgroundButton, foregroundButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        musicButton = findViewById(R.id.buttonMusicActivity);
//        backgroundButton = findViewById(R.id.buttonBackGround);
//        foregroundButton = findViewById(R.id.buttonForeground);

        musicButton.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, MusicPlayerActivity.class));

        });
//        backgroundButton.setOnClickListener(v -> {
//        });
//        foregroundButton.setOnClickListener(v -> {});
    }
}