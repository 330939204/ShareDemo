package com.example.laijianyang.sharedemo.ui.columns;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.example.laijianyang.sharedemo.DemoApplication;
import com.example.laijianyang.sharedemo.R;
import com.example.laijianyang.sharedemo.data.model.Column;
import com.example.laijianyang.sharedemo.ui.activity.ContainerActivity;
import com.example.laijianyang.sharedemo.ui.adapter.ColumnAdapter;
import com.example.laijianyang.sharedemo.ui.adapter.decoration.StaggeredGridItemDecoration;
import com.example.laijianyang.sharedemo.utils.ViewUtils;
import java.util.List;

public class MainActivity extends ContainerActivity implements ColumnsContract.View {

  private ColumnAdapter adapter;
  private ColumnsContract.Presenter presenter;

  @Override
  protected int getActivityContentId() {
    return R.layout.layout_main;
  }

  @Override
  protected void doOnCreate(Bundle savedInstanceState) {
    adapter = new ColumnAdapter();
    presenter = new ColumnsPresenter(this, DemoApplication.getInstance().getDataSource());
    RecyclerView recyclerColumn = (RecyclerView) findViewById(R.id.recycler_columns);
    recyclerColumn.setAdapter(adapter);
    recyclerColumn.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
    recyclerColumn.addItemDecoration(new StaggeredGridItemDecoration(this));
    presenter.start();
  }

  @Override
  public void showErrorMessage(String errorMessage) {
    ViewUtils.toastMessage(this, errorMessage);
  }

  @Override
  public void showColumns(List<Column> columns) {
    adapter.set(columns);
  }
}
