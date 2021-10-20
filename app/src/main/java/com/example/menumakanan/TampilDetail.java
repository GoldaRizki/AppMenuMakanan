package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class TampilDetail extends AppCompatActivity {

    private TextView dnama, dharga, desc;
    private ImageView dgambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_detail);


        dnama = findViewById(R.id.detailNamaMakanan);
        dharga = findViewById(R.id.detailHarga);
        desc = findViewById(R.id.detailDeskripsi);
        dgambar = findViewById(R.id.detailGambar);


        Bundle bandel = getIntent().getExtras(); // ben iso "cross activity" barange . . .


        dnama.setText(bandel.getString("Nama"));
        dharga.setText("Rp. "+bandel.getString("Harga"));
        desc.setText(bandel.getString("Deskripsi"));
        dgambar.setImageResource(bandel.getInt("Idgambar"));



    }
}