package com.example.laijianyang.sharedemo.data.services;

import com.example.laijianyang.sharedemo.data.model.Column;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by laijianyang on 2016/11/2.
 */
public interface ColumnService {

  @GET("recommendations/columns")
  Call<List<Column>> recommendedColumns(@Query("limit") int limit, @Query("seed") int seed,
      @Query("offset") int offset);
}
