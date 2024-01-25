package com.example.mvvmmodel;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvmmodel.databinding.UserrowBinding;

import java.util.List;

public class rvadepter extends RecyclerView.Adapter<rvadepter.viewholder> {
 List<Datamodel> list;


    public rvadepter(List<Datamodel> list  ) {
        this.list = list;
    }


    @NonNull
    @Override
    public rvadepter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new viewholder(DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.userrow,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull rvadepter.viewholder holder, int position) {
          Datamodel model=list.get(position);
          holder.userrowBinding.setUsermodel(model);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        UserrowBinding userrowBinding;
        public viewholder(@NonNull UserrowBinding itemView) {
            super(itemView.getRoot());
            userrowBinding=itemView;
        }
    }
}
