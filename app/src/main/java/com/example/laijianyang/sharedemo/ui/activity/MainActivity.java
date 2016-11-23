package com.example.laijianyang.sharedemo.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.example.laijianyang.sharedemo.DemoApplication;
import com.example.laijianyang.sharedemo.R;
import com.example.laijianyang.sharedemo.data.SimpleCallback;
import com.example.laijianyang.sharedemo.data.model.Column;
import com.example.laijianyang.sharedemo.ui.adapter.ColumnAdapter;
import com.example.laijianyang.sharedemo.ui.adapter.decoration.StaggeredGridItemDecoration;
import com.example.laijianyang.sharedemo.utils.ViewUtils;
import java.util.List;
import java.util.Random;

public class MainActivity extends ContainerActivity {

  private final static int COLUMN_LIMIT = 16;
  private final static int COLUMN_OFFSET = 0;

  private ColumnAdapter adapter;
  private Random mRandom = new Random();

  @Override
  protected int getActivityContentId() {
    return R.layout.layout_main;
  }

  @Override
  protected void doOnCreate(Bundle savedInstanceState) {
    adapter = new ColumnAdapter();
    RecyclerView recyclerColumn = (RecyclerView) findViewById(R.id.recycler_columns);
    recyclerColumn.setAdapter(adapter);
    recyclerColumn.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
    recyclerColumn.addItemDecoration(new StaggeredGridItemDecoration(this));
    loadColumnData();
  }

  private void loadColumnData() {
    DemoApplication.getInstance()
                   .getDataSource()
                   .getColumnService()
                   .recommendedColumns(COLUMN_LIMIT, mRandom.nextInt(100), COLUMN_OFFSET)
                   .enqueue(new SimpleCallback<List<Column>>() {
                     @Override
                     protected void onSuccess(List<Column> body) {
                       showColumnData(body);
                     }

                     @Override
                     protected void onError(String errorBody) {
                       showErrorMessage(errorBody);
                     }
                   });
  }

  private void showErrorMessage(String errorBody) {
    ViewUtils.toastMessage(this, errorBody);
  }

  private void showColumnData(List<Column> body) {
    adapter.set(body);
  }
}
