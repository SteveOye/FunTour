package com.example.android.funtour.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.funtour.Data;
import com.example.android.funtour.R;

import java.util.List;

public class HorizontalViewAdapter extends RecyclerView.Adapter<HorizontalViewAdapter.MyViewHolder> {

    List<Data> horizontalList ;
    Context context;

    public HorizontalViewAdapter(List<Data> horizontalList, Context context) {
        this.horizontalList = horizontalList;
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

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        holder.imageView.setImageResource(horizontalList.get(position).imageId);
        holder.txtview.setText(horizontalList.get(position).txt);
    }

    @Override
    public int getItemCount()
    {
        return horizontalList.size();
    }
}