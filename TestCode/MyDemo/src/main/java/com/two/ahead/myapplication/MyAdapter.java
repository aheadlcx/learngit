package com.two.ahead.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ahead on 2014/10/30.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private List<String> listData;

    public MyAdapter(List<String> listData) {
        this.listData = listData;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_view,viewGroup,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, int i) {
        if(listData != null && listData.size() >0 && i >=0 && i<listData.size())
        viewHolder.mTextViewA.setText(listData.get(i)+"A");
        viewHolder.mTextViewB.setText(listData.get(i)+"B");
        viewHolder.mTextViewA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewHolder.mTextViewA.setBackgroundResource(R.color.color_testa);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView mTextViewA;
        public TextView mTextViewB;
        public ViewHolder(View itemView) {
            super(itemView);
            mTextViewA = (TextView) itemView.findViewById(R.id.tv1);
            mTextViewB = (TextView) itemView.findViewById(R.id.tv2);
        }
    }
}
