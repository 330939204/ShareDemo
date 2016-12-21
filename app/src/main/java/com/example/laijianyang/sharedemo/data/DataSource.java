package com.example.laijianyang.sharedemo.data;

import com.example.laijianyang.sharedemo.data.services.ColumnService;
import lombok.Getter;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by laijianyang on 2016/11/2.
 */

public class DataSource {

  private final OkHttpClient client;

  @Getter
  private ColumnService columnService;

  @Getter
  private GsonConverterFactory factory;

  public DataSource() {

    client = new OkHttpClient();

    columnService = createService(client, API.COLUMN_BASE_API, ColumnService.class);
    factory = GsonConverterFactory.create();
  }

  private <T> T createService(OkHttpClient client, String url, Class<T> tClass) {
    return new Retrofit.Builder().client(client).baseUrl(url).addConverterFactory(factory).build().create(tClass);
  }
}
