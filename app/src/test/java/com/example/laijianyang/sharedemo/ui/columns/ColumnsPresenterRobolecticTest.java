package com.example.laijianyang.sharedemo.ui.columns;

import android.os.Build;
import com.example.laijianyang.sharedemo.BuildConfig;
import com.example.laijianyang.sharedemo.data.DataSource;
import com.example.laijianyang.sharedemo.data.model.Column;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.mockito.Matchers.anyListOf;
import static org.mockito.Mockito.verify;

/**
 * @author laijianyang E-mail: laijianyang@tigerbrokers.com
 * @version 创建时间: 2016/12/21 15:50
 */
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)
public class ColumnsPresenterRobolecticTest {

  private DataSource dataSource;

  @Mock
  ColumnsContract.View view;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    dataSource = new DataSource();
  }

  @Test
  public void loadColumns_TestWithRobolectic() throws Exception {
    ColumnsPresenter presenter = new ColumnsPresenter(view, dataSource);
    presenter.loadColumns();
    verify(view).showColumns(anyListOf(Column.class));
  }
}