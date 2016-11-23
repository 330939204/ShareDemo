package com.example.laijianyang.sharedemo.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.laijianyang.sharedemo.R;
import com.example.laijianyang.sharedemo.data.model.Column;
import com.example.laijianyang.sharedemo.ui.adapter.holder.ColumnViewHolder;
import com.example.laijianyang.sharedemo.utils.ArrayAdapter;

/**
 * 专栏列表adapter
 *
 * Created by laijianyang on 2016/11/23.
 */
public class ColumnAdapter extends ArrayAdapter<Column, ColumnViewHolder> {

  @Override
  public ColumnViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_column, parent, false);
    return new ColumnViewHolder(itemView);
  }

  @Override
  public void onBindViewHolder(ColumnViewHolder holder, int position) {
    holder.bind(getItem(position));
  }
}
