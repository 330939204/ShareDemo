package com.example.laijianyang.sharedemo.ui.columns;

import com.example.laijianyang.sharedemo.data.DataSource;
import com.example.laijianyang.sharedemo.data.SimpleCallback;
import com.example.laijianyang.sharedemo.data.model.Column;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.verify;

/**
 * @author laijianyang E-mail: laijianyang@tigerbrokers.com
 * @version 创建时间: 2016/12/21 15:50
 */
public class ColumnsPresenterTest {

  @Mock
  ColumnsContract.View view;

  @Mock
  DataSource dataSource;

  @Captor
  ArgumentCaptor<ColumnsContract.View> viewArgumentCaptor;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void loadColumns_TestWithMock() throws Exception {
    ColumnsPresenter presenter = new ColumnsPresenter(view, dataSource);
    doAnswer(invocation -> {
      ((SimpleCallback<?>) (invocation.getArguments()[0])).onResponse(any(), any());
      return null;
    }).when(dataSource.getColumnService().recommendedColumns(anyInt(), anyInt(), anyInt()))
      .enqueue(any(SimpleCallback.class));
    presenter.loadColumns();
    verify(view).showColumns(anyListOf(Column.class));
  }

}