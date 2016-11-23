package com.example.laijianyang.sharedemo.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.example.laijianyang.sharedemo.DemoApplication;
import com.example.laijianyang.sharedemo.R;
import com.example.laijianyang.sharedemo.data.SimpleCallback;
import com.example.laijianyang.sharedemo.data.model.DataBean;
import com.example.laijianyang.sharedemo.data.model.TranslateResult;
import com.example.laijianyang.sharedemo.utils.CollectionUtils;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

  private EditText editSource;

  private TextView textDest;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    editSource = (EditText) findViewById(R.id.edit_source);
    textDest = (TextView) findViewById(R.id.text_dest);

    final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    fab.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        DemoApplication.getInstance()
                       .getDataSource()
                       .getTranslateService()
                       .translate("en", "zh", editSource.getText().toString(), "translang", 3)
                       .enqueue(new SimpleCallback<TranslateResult>() {

                         @Override
                         protected void onSuccess(TranslateResult body) {
                           bindTransResult(body);
                         }

                         @Override
                         protected void onError(String errorBody) {
                           Snackbar.make(fab, errorBody, Snackbar.LENGTH_SHORT).show();
                         }
                       });
      }
    });
  }

  private void bindTransResult(TranslateResult translateResult) {

    if (translateResult == null) return;

    StringBuilder sb = new StringBuilder();

    if (!CollectionUtils.isEmpty(translateResult.getTrans_result().getData())) {
      List<DataBean> dataBean = translateResult.getTrans_result().getData();
      if (dataBean.size() > 1) {
        for (int i = 1; i <= dataBean.size(); i++) {
          sb.append(String.format(Locale.getDefault(), "%d%s", i, dataBean.get(i).getDst())).append("\n");
        }
      } else {
        sb.append(dataBean.get(0).getDst()).append("\n");
      }
    }

    textDest.setText(sb);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }
}