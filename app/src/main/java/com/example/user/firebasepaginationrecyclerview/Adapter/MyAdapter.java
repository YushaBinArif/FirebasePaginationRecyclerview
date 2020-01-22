package com.example.user.firebasepaginationrecyclerview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.user.firebasepaginationrecyclerview.Model.User;
import com.example.user.firebasepaginationrecyclerview.R;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    List<User> userList;
    Context context;

    public MyAdapter(Context context){
        this.userList = new ArrayList<>();
        this.context = context;
    }

    public void addAll(List<User> newUsers){
        int initSize = userList.size();
        userList.addAll(newUsers);
        notifyItemRangeChanged(initSize, newUsers.size());

    }
    public String getLastItemId(){
        return userList.get(userList.size()-1).getUid();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.user_list_item_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.txt_name.setText(userList.get(position).getName());
        holder.txt_country.setText(userList.get(position).getCountry());
        holder.txt_gender.setText(userList.get(position).getGender());

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public void removeLastItem() {
        userList.remove(userList.size() - 1);
    }

    public boolean isEmpty() {
        return userList.isEmpty();
    }

    public void clear() {
        userList.clear();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView txt_name, txt_country, txt_gender;
        public MyViewHolder(View itemView){
            super(itemView);

            txt_name = itemView.findViewById(R.id.user_name_iv);
            txt_country = itemView.findViewById(R.id.country);
            txt_gender = itemView.findViewById(R.id.gender);
        }
    }
}
