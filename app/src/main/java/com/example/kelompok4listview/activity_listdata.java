package com.example.kelompok4listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_listdata extends AppCompatActivity {
    TextView listdata;
    ImageView imageView;
    TextView spesifikasi;
    TextView processor;
    TextView ram;
    TextView storage;
    TextView os;
    TextView harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listdata);

        listdata = findViewById(R.id.listdata);
        imageView = findViewById(R.id.imageView);
        spesifikasi = findViewById(R.id.spesifikasi);
        processor = findViewById(R.id.processor);
        ram = findViewById(R.id.ram);
        storage = findViewById(R.id.storage);
        os = findViewById(R.id.os);
        harga = findViewById(R.id.harga);


        Intent intent = getIntent();
        String receivedName =  intent.getStringExtra("name");
        String receivedSpesifikasi = intent.getStringExtra("spesifikasi");
        String receivedProcessor = intent.getStringExtra("processor");
        String receivedRam = intent.getStringExtra("ram");
        String receivedStorage = intent.getStringExtra("storage");
        String receivedOs = intent.getStringExtra("os");
        String receivedHarga = intent.getStringExtra("harga");
        int receivedImage = intent.getIntExtra("image",0);

        listdata.setText(receivedName);
        imageView.setImageResource(receivedImage);
        spesifikasi.setText(receivedSpesifikasi);
        processor.setText(receivedProcessor);
        ram.setText(receivedRam);
        storage.setText(receivedStorage);
        os.setText(receivedOs);
        harga.setText(receivedHarga);
        //enable back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    //getting back to listview
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
