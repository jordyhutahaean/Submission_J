package com.dicoding.picodiploma.submissionapp;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListCharaAdapter extends RecyclerView.Adapter<ListCharaAdapter.ListViewHolder> {
    public interface OnItemClickCallback {
        void onItemClicked(Chara data);
    }

    private Context context;
    private ArrayList<Chara> listChara;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListCharaAdapter(ArrayList<Chara> list){this.listChara = list;}

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_chara, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Chara chara = listChara.get(position);
        Glide.with(holder.itemView.getContext())
                .load(chara.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.charaName.setText(chara.getName());
        holder.charaDetail.setText(chara.getDetail());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context = v.getContext();
                Intent detailIntent = new Intent(context, FGO.class);
                detailIntent.putExtra(FGO.EXTRA_DESC, (Parcelable) listChara.get(holder.getAdapterPosition()));
                context.startActivity(detailIntent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listChara.size();
    }


    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView charaName, charaDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.ch_item_photo);
            charaName = itemView.findViewById(R.id.ch_item_name);
            charaDetail = itemView.findViewById(R.id.ch_item_detail);
        }
    }

}
