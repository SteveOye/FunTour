package com.example.android.funtour.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.funtour.HistoricalSites;
import com.example.android.funtour.R;

import java.util.List;

public class HistoricalHorizontalViewAdapter extends RecyclerView.Adapter<HistoricalHorizontalViewAdapter.MyViewHolder> {

    List<HistoricalSites> historicalSites ;
    Context context;

    public HistoricalHorizontalViewAdapter(List<HistoricalSites> historicalSites, Context context) {
        this.historicalSites = historicalSites;
        this.context = context;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView txtview;
        public MyViewHolder(View view) {
            super(view);
            imageView=view.findViewById(R.id.imageview_id);
            txtview= view.findViewById(R.id.name_id);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout, parent, false);

        return new HistoricalHorizontalViewAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imageView.setImageResource(historicalSites.get(position).imageId);
        holder.txtview.setText(historicalSites.get(position).txt);
    }

    @Override
    public int getItemCount()
    {
        return historicalSites.size();
    }
}