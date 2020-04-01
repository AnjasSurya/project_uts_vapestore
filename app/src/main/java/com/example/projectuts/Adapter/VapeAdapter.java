package com.example.projectuts.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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
        Choice item = items.get(position);
        Picasso.get().load(item.getFoto()).into(holder.logoImage);
        holder.nameText.setText(item.getNama());
        holder.jenisText.setText(item.getJenis());
        holder.hargaText.setText(String.valueOf(item.getHarga()));
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
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logoImage = itemView.findViewById(R.id.imageView3);
            nameText = itemView.findViewById(R.id.textView4);
            jenisText = itemView.findViewById(R.id.textView6);
            hargaText = itemView.findViewById(R.id.textView5);
        }
    }
}
