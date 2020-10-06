package com.example.pirmas_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;
    private Button button01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMain);
        this.button01 = findViewById(R.id.button01);
    }

    public void btnChangeText(View view) {
        this.tvMain.setText("Funnie");
        this.button01.setText("HaHa");
    }

    public void btnChangeColours(View view) {
        java.util.Random r = new java.util.Random();
        this.tvMain.setTextColor(android.graphics.Color.rgb(r.nextInt(256),r.nextInt(256),r.nextInt(256)));
        this.button01.setTextColor(android.graphics.Color.rgb(r.nextInt(256),r.nextInt(256),r.nextInt(256)));
    }
}