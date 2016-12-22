package com.example.laijianyang.sharedemo.ui.columns;

import com.example.laijianyang.sharedemo.DemoApplication;
import com.example.laijianyang.sharedemo.data.SimpleCallback;
import com.example.laijianyang.sharedemo.data.model.Column;
import com.google.gson.Gson;
import com.nostra13.universalimageloader.utils.L;
import java.util.List;
import java.util.Random;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author laijianyang E-mail: laijianyang@tigerbrokers.com
 * @version 创建时间: 2016/12/21 15:50
 */
public class ColumnsPresenterTest {

  private final static int COLUMN_LIMIT = 16;
  private final static int COLUMN_OFFSET = 0;
  private Random mRandom = new Random();

  @Test
  public void loadColumns() throws Exception {
    assert DemoApplication.getInstance() != null;

    DemoApplication.getInstance()
                   .getDataSource()
                   .getColumnService()
                   .recommendedColumns(COLUMN_LIMIT, mRandom.nextInt(100), COLUMN_OFFSET)
                   .enqueue(new SimpleCallback<List<Column>>() {
                     @Override
                     protected void onSuccess(List<Column> body) {
                       assertNotNull(body);
                     }

                     @Override
                     protected void onError(String errorBody) {
                       L.e(errorBody);
                     }
                   });
  }
}