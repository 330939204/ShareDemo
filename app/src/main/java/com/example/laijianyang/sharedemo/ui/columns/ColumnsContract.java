package com.example.laijianyang.sharedemo.ui.columns;

import com.example.laijianyang.sharedemo.BasePresenter;
import com.example.laijianyang.sharedemo.BaseView;
import com.example.laijianyang.sharedemo.data.model.Column;
import java.util.List;

/**
 * @author laijianyang E-mail: laijianyang@tigerbrokers.com
 * @version 创建时间: 2016/12/21 14:30
 */

public class ColumnsContract {

  interface View extends BaseView {

    void showColumns(List<Column> columns);
  }

  interface Presenter extends BasePresenter {

    void loadColumns();
  }
}
