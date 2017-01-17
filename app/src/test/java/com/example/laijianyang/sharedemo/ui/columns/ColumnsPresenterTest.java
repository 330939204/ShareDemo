package com.example.laijianyang.sharedemo.ui.columns;

import com.example.laijianyang.sharedemo.data.DataSource;
import com.example.laijianyang.sharedemo.data.SimpleCallback;
import com.example.laijianyang.sharedemo.data.model.Column;
import com.example.laijianyang.sharedemo.data.services.ColumnService;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import retrofit2.Call;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author laijianyang E-mail: laijianyang@tigerbrokers.com
 * @version 创建时间: 2016/12/21 15:50
 */
public class ColumnsPresenterTest {

  @Mock
  ColumnsContract.View view;

  @Mock
  ColumnService columnServiceMock;

  @Mock
  DataSource dataSourceMock;

  @Mock
  Call<List<Column>> callMock;

  @Captor
  ArgumentCaptor<SimpleCallback<List<Column>>> simpleCallbackArgumentCaptor;

  private ColumnsPresenter presenter;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    presenter = new ColumnsPresenter(view, dataSourceMock);
  }

  @Test
  @SuppressWarnings("unchecked")
  public void loadColumns_TestWithMock() throws Exception {
    when(dataSourceMock.getColumnService()).thenReturn(columnServiceMock);
    when(columnServiceMock.recommendedColumns(anyInt(), anyInt(), anyInt())).thenReturn(callMock);
    presenter.loadColumns();
    verify(callMock).enqueue(simpleCallbackArgumentCaptor.capture());
     simpleCallbackArgumentCaptor.getValue().onSuccess(new ArrayList<>());
    verify(view).showColumns(anyListOf(Column.class));
  }
}