package com.example.menumakanan;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.telecom.InCallService;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.Viewholder> {


    public ListAdapter(ArrayList listMakanan){
        this.ListMakanan = listMakanan;
    }
    private ArrayList<ItemMakanan> ListMakanan;
    public Context context;

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        Viewholder holder = new Viewholder(inflater.inflate(R.layout.activity_layout_kecil,parent,false));
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        ItemMakanan makanan = ListMakanan.get(position);
        holder.nama.setText(makanan.getNamaMakanan());
        holder.harga.setText("Rp. "+makanan.getHargaMakanan());
        holder.gambar.setImageResource(makanan.getIdGambar());


        holder.iniCs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.i(String.valueOf(this), "Najjal muncul pora");

            Intent inten = new Intent(context, TampilDetail.class);
            inten.putExtra("Nama", makanan.getNamaMakanan());
            inten.putExtra("Harga", makanan.getHargaMakanan());
            inten.putExtra("Deskripsi", makanan.getDeskripsi());
            inten.putExtra("Idgambar", makanan.getIdGambar());
            context.startActivity(inten);


                Log.i(String.valueOf(this), "Najjal muncul pora 666666666666666");






            }




        });

    }

    @Override
    public int getItemCount() {

        return ListMakanan.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        public TextView nama, harga;
        public ImageView gambar;
        public ConstraintLayout iniCs;


        public Viewholder(@NonNull View itemView) {
            super(itemView);
            //context = itemView.getContext();
            nama = (TextView) itemView.findViewById(R.id.tampilMakanan);
            harga = (TextView) itemView.findViewById(R.id.tampilHarga);
            gambar = (ImageView) itemView.findViewById(R.id.tampilGambar);
            iniCs = (ConstraintLayout) itemView.findViewById(R.id.layout_kecil);


        }
    }



}
