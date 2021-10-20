package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   RecyclerView rec;
    ArrayList<ItemMakanan> item = new ArrayList<ItemMakanan>();;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rec = findViewById(R.id.recyclerView);




        item.add(new ItemMakanan("Sate Madura", 15000, "Rasanya Enak banget.. pokoknya enak banget lu musti cobain deh!!!!", R.drawable.sate_madura));
        item.add(new ItemMakanan("Kelapa bang Sani", 12000, "Rasanya enak banget bikin seger.. dipilih dari kelapa terbaik. Dan telah diendorse oleh Dustin Tiffany", R.drawable.bangsani));
        item.add(new ItemMakanan("Mie Ayam Aldi Taher", 20000, "Mie ayam yang enak banget. Mie ayam ini punyanya Aldi taher. Dia punya karya musik yang bangus banget karyanya dan kerenlah pokoknya!", R.drawable.mie_ayam_aldi_taher));
        item.add(new ItemMakanan("Ayam Bakar", 15000, "Ayam suka bakar bumi (?) ya gitu lah... Aku ga tau dah.. ya siapapun boleh nyoba. Siapa tau dibakar api asmara kan...", R.drawable.ayam_suka_bakar_bumi));
        item.add(new ItemMakanan("Burger", 25000, "Adalah burger terbaik di bikini bottom. Rasanya enak sekali dan saking enaknya plankton pun sering mencoba mencuri resepnya...", R.drawable.burger));
        item.add(new ItemMakanan("Nasi Lemak", 30000, "Nasi lemak buatan kak ros yang dijual lagi sama Uncle Muthu.. harganya emang agak mahal ketambahan ongkir soalnya...", R.drawable.nasi_lemak));
        item.add(new ItemMakanan("Odading Mang Oleh", 10000, "Odading mang oleh, Rasanya seperti anda menjadi ironman... Belilah odading mang oleh sekarang..", R.drawable.odading_mang_oleh));
        item.add(new ItemMakanan("Darawet Enak!", 5000, "Kali ini menunya adalah minuman.. kalo makan terus tar seret... Darawet enak *ting2 darawet enak... ", R.drawable.darawet_enak));


        rec.setAdapter(new ListAdapter(item));
        rec.setLayoutManager(new LinearLayoutManager(this));


    }



}