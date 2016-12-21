package com.example.laijianyang.sharedemo.ui.columns;

import com.example.laijianyang.sharedemo.DemoApplication;
import com.example.laijianyang.sharedemo.data.SimpleCallback;
import com.example.laijianyang.sharedemo.data.model.Column;

import java.util.List;
import java.util.Random;

/**
 * @author laijianyang E-mail: laijianyang@tigerbrokers.com
 * @version 创建时间: 2016/12/21 14:58
 */

public class ColumnsPresenter implements ColumnsContract.Presenter {

    private final static int COLUMN_LIMIT = 16;
    private final static int COLUMN_OFFSET = 0;
    private final ColumnsContract.View view;
    private Random mRandom = new Random();

    public ColumnsPresenter(ColumnsContract.View view) {
        this.view = view;
    }

    @Override
    public void loadColumns() {
        DemoApplication.getInstance()
                .getDataSource()
                .getColumnService()
                .recommendedColumns(COLUMN_LIMIT, mRandom.nextInt(100), COLUMN_OFFSET)
                .enqueue(new SimpleCallback<List<Column>>() {
                    @Override
                    protected void onSuccess(List<Column> body) {
                        view.showColumns(body);
                    }

                    @Override
                    protected void onError(String errorBody) {
                        view.showErrorMessage(errorBody);
                    }
                });
    }

    @Override
    public void start() {
        loadColumns();
    }
}
