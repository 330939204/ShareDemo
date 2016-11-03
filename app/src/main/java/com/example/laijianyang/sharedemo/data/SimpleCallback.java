package com.example.laijianyang.sharedemo.data;

import android.util.Log;
import java.io.IOException;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by laijianyang on 2016/11/2.
 */

public abstract class SimpleCallback<T> implements Callback<T> {

  protected abstract void onSuccess(T body);

  protected abstract void onError(String errorBody);

  @Override
  public void onResponse(Call<T> call, Response<T> response) {
    if (response.isSuccessful()) {
      onSuccess(response.body());
    } else {
      try {
        onError(response.errorBody().string());
      } catch (IOException e) {
        onError(response.errorBody().toString());
      }
    }
  }

  @Override
  public void onFailure(Call<T> call, Throwable t) {
    Log.e("network error", t.getMessage());
    onError(t.getMessage());
  }
}
