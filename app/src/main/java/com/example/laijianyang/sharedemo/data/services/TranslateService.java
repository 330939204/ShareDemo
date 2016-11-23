package com.example.laijianyang.sharedemo.data.services;

import com.example.laijianyang.sharedemo.data.model.TranslateResult;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 *
 *
 * Created by laijianyang on 2016/11/2.
 */
public interface TranslateService {

  /**
   * @param fromLang 源语种
   * @param toLang 翻译语种
   * @param query 查询字符串
   * @param type 翻译类型 - 常量填 "translang"
   * @param flag 常量填 3
   */
  @POST("v2transapi")
  @FormUrlEncoded
  Call<TranslateResult> translate(@Field("from") String fromLang, @Field("to") String toLang,
      @Field("query") String query, @Field("transtype") String type, @Field("simple_means_flag") int flag);
}
