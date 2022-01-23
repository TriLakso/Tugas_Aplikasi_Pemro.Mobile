package com.example.myapplication.ui.inputdata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.ArrayList;


public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private ArrayList<ModelInput> modelInputList = new ArrayList<>();
    private Context mContext;

    public DataAdapter(Context context) {
        this.mContext = context;
    }

    public void setDataAdapter(ArrayList<ModelInput> items) {
        modelInputList.clear();
        modelInputList.addAll(items);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_daftar, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final ModelInput data = modelInputList.get(position);

        holder.tvDate.setText(data.getTgldaftar());
        holder.tvNama.setText(data.getNama());
        holder.tvNim.setText(data.getNim());
        holder.tvTanggalLahir.setText(data.getTtl());

    }

    @Override
    public int getItemCount() {
        return modelInputList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvDate;
        public TextView tvNama;
        public TextView tvNim;
        public TextView tvTanggalLahir;
        public ImageView ivImageFT;

        public ViewHolder(View itemView) {
            super(itemView);
            tvDate = itemView.findViewById(R.id.tvDate);
            tvNama = itemView.findViewById(R.id.tvNama);
            tvNim = itemView.findViewById(R.id.tvNim);
            tvTanggalLahir = itemView.findViewById(R.id.tvTanggalLahir);
        }
    }

}
