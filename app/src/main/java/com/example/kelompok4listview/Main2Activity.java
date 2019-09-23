package com.example.kelompok4listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void home(View view) {
        Intent home = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(home);
        finish();
    }
}
