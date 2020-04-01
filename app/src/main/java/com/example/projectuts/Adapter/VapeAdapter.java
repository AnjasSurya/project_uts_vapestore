package com.example.projectuts.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectuts.DetailActivity;
import com.example.projectuts.Model.Choice;
import com.example.projectuts.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class VapeAdapter extends RecyclerView.Adapter<VapeAdapter.ViewHolder> {
    public VapeAdapter(Context context, List<Choice> items) {
        this.context = context;
        this.items = items;
    }

    private Context context;
    private List<Choice> items;

    @NonNull
    @Override
    public VapeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.konten, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VapeAdapter.ViewHolder holder, int position) {
        final Choice item = items.get(position);
        Picasso.get().load(item.getFoto()).into(holder.logoImage);
        holder.nameText.setText(item.getNama());
        holder.jenisText.setText(item.getJenis());
        holder.hargaText.setText(item.getHarga());

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("nama_KEY", item.getNama());
                intent.putExtra("foto_KEY", item.getFoto());
                intent.putExtra("harga_KEY", item.getHarga());
                intent.putExtra("ukuran_KEY", item.getUkuran());
                intent.putExtra("output_KEY", item.getOutput());
                intent.putExtra("rasistance_KEY", item.getRasistance());
                intent.putExtra("bahan_KEY", item.getBahan());
                intent.putExtra("fitur_KEY", item.getFitur());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logoImage;
        TextView nameText;
        TextView jenisText;
        TextView hargaText;
        TextView ukuranText, outputText, rasistanceText, bahanText, fiturText;
        ConstraintLayout parentLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logoImage = itemView.findViewById(R.id.imageView3);
            nameText = itemView.findViewById(R.id.textView4);
            jenisText = itemView.findViewById(R.id.textView6);
            hargaText = itemView.findViewById(R.id.textView5);
            ukuranText = itemView.findViewById(R.id.spekUkuran);
            outputText = itemView.findViewById(R.id.spekOutput);
            rasistanceText = itemView.findViewById(R.id.spekResistance);
            bahanText = itemView.findViewById(R.id.spekBahan);
            fiturText = itemView.findViewById(R.id.spekFitur);
            parentLayout=itemView.findViewById(R.id.parentlayout);
        }
    }
}
