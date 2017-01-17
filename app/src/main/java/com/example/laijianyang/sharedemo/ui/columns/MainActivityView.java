package com.example.laijianyang.sharedemo.ui.columns;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.example.laijianyang.sharedemo.BaseViewDelegate;
import com.example.laijianyang.sharedemo.R;
import com.example.laijianyang.sharedemo.data.model.Column;
import com.example.laijianyang.sharedemo.ui.adapter.ColumnAdapter;
import com.example.laijianyang.sharedemo.ui.adapter.decoration.StaggeredGridItemDecoration;
import com.example.laijianyang.sharedemo.utils.ViewUtils;
import java.util.List;

/**
 * @author laijianyang E-mail: laijianyang@tigerbrokers.com
 * @version 创建时间: 2017/01/17 17:21
 */
public class MainActivityView extends BaseViewDelegate {

  private ColumnAdapter adapter;

  @Override
  public int getRootViewId() {
    return R.layout.layout_main;
  }

  @Override
  public void initView() {
    RecyclerView recyclerColumn = getView(R.id.recycler_columns);
    adapter = new ColumnAdapter();
    recyclerColumn.setAdapter(adapter);
    recyclerColumn.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
    recyclerColumn.addItemDecoration(new StaggeredGridItemDecoration(getContext()));
  }

  public void showColumns(List<Column> body) {
    adapter.addAll(body);
  }

  public void showErrorMessage(String errorBody) {
    ViewUtils.toastMessage(rootView.getContext(), errorBody);
  }
}
