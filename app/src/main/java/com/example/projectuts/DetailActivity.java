package com.example.projectuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getIncomentent();
    }

    private void getIncomentent() {
        String fotoVAPE=getIntent().getStringExtra("foto_KEY");
        String namaVAPE=getIntent().getStringExtra("nama_KEY");
        String hargaVAPE=getIntent().getStringExtra("harga_KEY");
        String ukuranVAPE=getIntent().getStringExtra("ukuran_KEY");
        String outputVAPE=getIntent().getStringExtra("output_KEY");
        String rasistanceVAPE=getIntent().getStringExtra("rasistance_KEY");
        String bahanVAPE=getIntent().getStringExtra("bahan_KEY");
        String fiturVAPE=getIntent().getStringExtra("fitur_KEY");

        setData(fotoVAPE, namaVAPE, hargaVAPE, ukuranVAPE, outputVAPE, rasistanceVAPE, bahanVAPE, fiturVAPE);

    }

    private void setData(String fotoVAPE, String namaVAPE, String hargaVAPE,
                         String ukuranVAPE, String outputVAPE, String rasistanceVAPE, String bahanVAPE, String fiturVAPE){
        TextView nama = findViewById(R.id.namadetail);
        nama.setText(namaVAPE);

        ImageView foto = findViewById(R.id.fotodetail);
        Picasso.get().load(fotoVAPE).into(foto);

        TextView harga = findViewById(R.id.spekHarga);
        harga.setText(hargaVAPE);

        TextView ukuran = findViewById(R.id.spekUkuran);
        ukuran.setText(ukuranVAPE);

        TextView output = findViewById(R.id.spekOutput);
        output.setText(outputVAPE);

        TextView rasistance = findViewById(R.id.spekResistance);
        rasistance.setText(rasistanceVAPE);

        TextView bahan = findViewById(R.id.spekBahan);
        bahan.setText(bahanVAPE);

        TextView fitur = findViewById(R.id.spekFitur);
        fitur.setText(fiturVAPE);
    }
}
