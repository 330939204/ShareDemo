package com.example.laijianyang.sharedemo.data.model;

import lombok.Data;

/**
 * 知乎专栏
 *
 * Created by laijianyang on 2016/11/23.
 */
@Data
public class Column {

  /**
   * followersCount : 454
   * name : 嘿，压力君~
   * url : /stress-w0v0w-
   * postsCount : 8
   * description : 压力及其生理反应科普~
   专栏参考内容：neuroscience, stress and resilience，及方向相关论文。
   专栏参考书目：why zebras don't get ulcers
   书目有中文版，有兴趣的可以自己去看。
   因为是科普所以内容和idea有一定相似度。本专栏只作为纯知识分享。
   头像=本校lab的某只rat的某一个脑子切片的amygdala部分。
   以上。
   * slug : stress-w0v0w-
   * avatar : {"id":"79edf3bbd7e8862389ae14e2a208f9f5","template":"https://pic2.zhimg.com/{id}_{size}.jpg"}
   */

  private int followersCount;
  private String name;
  private String url;
  private int postsCount;
  private String description;
  private String slug;
  private Avatar avatar;

}
