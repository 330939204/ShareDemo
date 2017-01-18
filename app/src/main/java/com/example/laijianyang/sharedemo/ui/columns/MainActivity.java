package com.example.laijianyang.sharedemo.ui.columns;

import android.app.LoaderManager;
import android.content.Loader;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.example.laijianyang.sharedemo.DemoApplication;
import com.example.laijianyang.sharedemo.LoaderPresenter;
import com.example.laijianyang.sharedemo.PresenterFactory;
import com.example.laijianyang.sharedemo.R;
import com.example.laijianyang.sharedemo.data.model.Column;
import com.example.laijianyang.sharedemo.ui.activity.ContainerActivity;
import com.example.laijianyang.sharedemo.ui.adapter.ColumnAdapter;
import com.example.laijianyang.sharedemo.ui.adapter.decoration.StaggeredGridItemDecoration;
import com.example.laijianyang.sharedemo.utils.ViewUtils;
import java.util.List;

public class MainActivity extends ContainerActivity
    implements ColumnsContract.View, LoaderManager.LoaderCallbacks<ColumnsContract.Presenter> {

  private static final int LOADER_ID = 101;
  private ColumnAdapter adapter;
  private ColumnsContract.Presenter presenter;

  @Override
  protected int getActivityContentId() {
    return R.layout.layout_main;
  }

  @Override
  protected void doOnCreate(Bundle savedInstanceState) {
    getLoaderManager().initLoader(LOADER_ID,null,this);
    adapter = new ColumnAdapter();
    RecyclerView recyclerColumn = (RecyclerView) findViewById(R.id.recycler_columns);
    recyclerColumn.setAdapter(adapter);
    recyclerColumn.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
    recyclerColumn.addItemDecoration(new StaggeredGridItemDecoration(this));
  }

  @Override
  protected void onStart() {
    super.onStart();
    presenter.attached();
    presenter.start();
  }

  @Override
  protected void onDestroy() {
    presenter.detached();
    super.onDestroy();
  }

  @Override
  public void showErrorMessage(String errorMessage) {
    ViewUtils.toastMessage(this, errorMessage);
  }

  @Override
  public void showColumns(List<Column> columns) {
    adapter.set(columns);
  }

  @Override
  public Loader<ColumnsContract.Presenter> onCreateLoader(int id, Bundle args) {
    return new LoaderPresenter<>(this, () -> new ColumnsPresenter(MainActivity.this, DemoApplication.getInstance().getDataSource()));
  }

  @Override
  public void onLoadFinished(Loader<ColumnsContract.Presenter> loader, ColumnsContract.Presenter data) {
    this.presenter = data;
  }

  @Override
  public void onLoaderReset(Loader<ColumnsContract.Presenter> loader) {
    presenter = null;
  }
}
