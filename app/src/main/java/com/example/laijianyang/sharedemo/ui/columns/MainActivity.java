package com.example.laijianyang.sharedemo.ui.columns;

import com.example.laijianyang.sharedemo.ActivityPresenter;
import com.example.laijianyang.sharedemo.DemoApplication;
import com.example.laijianyang.sharedemo.data.SimpleCallback;
import com.example.laijianyang.sharedemo.data.model.Column;
import java.util.List;
import java.util.Random;

public class MainActivity extends ActivityPresenter<MainActivityView> {

  private final static int COLUMN_LIMIT = 16;
  private final static int COLUMN_OFFSET = 0;
  private Random mRandom = new Random();

  @Override
  public Class<MainActivityView> getViewDelegateType() {
    return MainActivityView.class;
  }

  @Override
  protected void onStart() {
    super.onStart();
    loadColumns();
  }

  public void loadColumns() {
    DemoApplication.getInstance()
                   .getDataSource()
                   .getColumnService()
                   .recommendedColumns(COLUMN_LIMIT, mRandom.nextInt(100), COLUMN_OFFSET)
                   .enqueue(new SimpleCallback<List<Column>>() {
                     @Override
                     public void onSuccess(List<Column> body) {
                       viewDelegate.showColumns(body);
                     }

                     @Override
                     public void onError(String errorBody) {
                       viewDelegate.showErrorMessage(errorBody);
                     }
                   });
  }
}
