package com.example.myqurannavigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MyRVAdapter  extends RecyclerView.Adapter<MyRVAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<String> UrduTran, UrduTafs, EngTran, EngTafs,HndiTran, HindiTafs;
    Activity activity;

    MyRVAdapter(Activity activity,Context context, ArrayList UrduTran,ArrayList UrduTafs,ArrayList EngTran, ArrayList EngTafs,ArrayList HndiTran,ArrayList HindiTafs){
        this.activity=activity;
        this.context = context;
        this.UrduTran = UrduTran;
        this.UrduTafs=UrduTafs;
        this.EngTafs = EngTafs;
        this.EngTran = EngTran;
        this.HindiTafs = HindiTafs;
        this.HndiTran=HndiTran;
    }

    @NonNull
    @Override
    public MyRVAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRVAdapter.MyViewHolder holder, int position) {
        holder.UrduTran.setText(String.valueOf(UrduTran.get(position)));
        holder.UrduTafs.setText(String.valueOf(UrduTafs.get(position)));
        holder.EngTafs.setText(String.valueOf(EngTran.get(position)));
        holder.EngTran.setText(String.valueOf(EngTafs.get(position)));
        holder.HindiTafs.setText(String.valueOf(HindiTafs.get(position)));
        holder.HndiTran.setText(String.valueOf(HndiTran.get(position)));
//        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(context,activity_update.class);
//                intent.putExtra("id", String.valueOf(id.get(holder.getAdapterPosition())));
//                intent.putExtra("rollNo", String.valueOf(rollNo.get(holder.getAdapterPosition())));
//                intent.putExtra("name", String.valueOf(name.get(holder.getAdapterPosition())));
//                intent.putExtra("sabq", String.valueOf(sabq.get(holder.getAdapterPosition())));
//                intent.putExtra("sabqi", String.valueOf(sabqi.get(holder.getAdapterPosition())));
//                intent.putExtra("manzil", String.valueOf(manzil.get(holder.getAdapterPosition())));
//                activity.startActivityForResult(intent,1);
//
//            }
//        });


    }

    @Override
    public int getItemCount() {
        return UrduTafs.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView UrduTran, UrduTafs, EngTran, EngTafs,HndiTran, HindiTafs;
        LinearLayout mainLayout;
        public MyViewHolder(View itemView) {
            super(itemView);
            UrduTafs= itemView.findViewById(R.id.ETUrdutaf);
            UrduTran=itemView.findViewById(R.id.ETUrduTran);
            EngTran= itemView.findViewById(R.id.ETEngTran);
            EngTafs= itemView.findViewById(R.id.ETEngTaf);
            HndiTran= itemView.findViewById(R.id.EThindiTran);
            HindiTafs= itemView.findViewById(R.id.EThindiTaf);
            mainLayout=itemView.findViewById(R.id.mainLayout);


        }
    }
}
