package com.mohit.animationsapp;

import androidx.appcompat .app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void fade(View view){
        ImageView imageView = findViewById(R.id.imageView);
        imageView.animate().translationX(500f).rotation(1000f).setDuration(2000);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ImageView imageView = findViewById(R.id.imageView);
        imageView.setTranslationX(-1000f);
    }
}
