package com.example.laijianyang.sharedemo.ui.adapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.laijianyang.sharedemo.R;
import com.example.laijianyang.sharedemo.data.model.Column;
import com.example.laijianyang.sharedemo.ui.activity.ColumnActivity;
import com.example.laijianyang.sharedemo.utils.ImageLoaderUtils;

/**
 * 专栏view holder
 *
 * Created by laijianyang on 2016/11/23.
 */

public class ColumnViewHolder extends RecyclerView.ViewHolder {

  private TextView textName;
  private TextView textSummery;
  private TextView textInfo;
  private ImageView imageHead;

  public ColumnViewHolder(View itemView) {
    super(itemView);
    textName = (TextView) itemView.findViewById(R.id.text_name);
    textSummery = (TextView) itemView.findViewById(R.id.text_summery);
    textInfo = (TextView) itemView.findViewById(R.id.text_info);
    imageHead = (ImageView) itemView.findViewById(R.id.user_head);
  }

  public void bind(Column column) {
    ImageLoaderUtils.displayRoundImage(column.getAvatar().getAvatarM(), imageHead);
    textName.setText(column.getName());
    textSummery.setText(column.getDescription());
    textInfo.setText(itemView.getContext()
                             .getString(R.string.column_info_template, column.getFollowersCount(),
                                        column.getPostsCount()));
    itemView.setOnClickListener(v -> ColumnActivity.start(itemView.getContext(), column.getUrl()));
  }
}
