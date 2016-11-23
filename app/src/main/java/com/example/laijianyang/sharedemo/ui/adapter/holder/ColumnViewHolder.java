package com.example.laijianyang.sharedemo.ui.adapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.example.laijianyang.sharedemo.R;
import com.example.laijianyang.sharedemo.data.model.Column;

/**
 * 专栏view holder
 *
 * Created by laijianyang on 2016/11/23.
 */

public class ColumnViewHolder extends RecyclerView.ViewHolder {

  private TextView textName;
  private TextView textSummery;
  private TextView textInfo;

  public ColumnViewHolder(View itemView) {
    super(itemView);
    textName = (TextView) itemView.findViewById(R.id.text_name);
    textSummery = (TextView) itemView.findViewById(R.id.text_summery);
    textInfo = (TextView) itemView.findViewById(R.id.text_info);
  }

  public void bind(Column column) {
    textName.setText(column.getName());
    textSummery.setText(column.getDescription());
    textInfo.setText(itemView.getContext()
                             .getString(R.string.column_info_template, column.getFollowersCount(),
                                        column.getPostsCount()));
  }
}
