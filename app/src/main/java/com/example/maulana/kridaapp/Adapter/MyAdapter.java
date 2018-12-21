package com.example.maulana.kridaapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.maulana.kridaapp.R;

import com.example.maulana.kridaapp.LeadActivity;
import com.example.maulana.kridaapp.MainActivity;
import com.example.maulana.kridaapp.modelLead.Lead;

import java.util.List;
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    List<Lead> resultsItems;
    Context context;

    public MyAdapter(List<Lead> resultsItems, Context context) {
        this.resultsItems = resultsItems;
        this.context = context;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list, null);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.nama.setText(resultsItems.get(position).getLeadNama());
        holder.alamat.setText(resultsItems.get(position).getLeadAlamat());
        holder.email.setText(resultsItems.get(position).getLeadEmail());
        holder.pos.setText(resultsItems.get(position).getPosKode());
        holder.dat.setText(resultsItems.get(position).getLeadDate());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(context, resultsItems.get(position).getLeadNama(), Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(view.getContext(), DetailActivity.class);
//                view.getContext().startActivity(intent);

            }

        });
    }

    @Override
    public int getItemCount() {
        return resultsItems.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView nama, alamat, email, pos, dat;

        public MyViewHolder(View itemView) {
            super(itemView);

            nama = itemView.findViewById(R.id.nama);
            alamat = itemView.findViewById(R.id.alamat);
            email = itemView.findViewById(R.id.email);
            pos = itemView.findViewById(R.id.pos);
            dat = itemView.findViewById(R.id.dat);

        }

    }

}


