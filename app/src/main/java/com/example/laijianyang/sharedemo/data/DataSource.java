package com.example.laijianyang.sharedemo.data;

import com.example.laijianyang.sharedemo.data.services.TranslateService;
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
  private TranslateService translateService;

  public DataSource() {

    client = new OkHttpClient();

    translateService = createService(client, API.TRANSLATE_BASE_URL, TranslateService.class);
  }

  private <T> T createService(OkHttpClient client, String url, Class<T> tClass) {
    return new Retrofit.Builder().client(client)
                                 .baseUrl(url)
                                 .addConverterFactory(GsonConverterFactory.create())
                                 .build()
                                 .create(tClass);
  }
}
