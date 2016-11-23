package com.example.laijianyang.sharedemo.data.model;

import lombok.Data;

/**
 * 用户头像
 *
 * Created by laijianyang on 2016/11/23.
 */
@Data
public class Avatar {
  /**
   * id : 79edf3bbd7e8862389ae14e2a208f9f5
   * template : https://pic2.zhimg.com/{id}_{size}.jpg
   */

  private String id;
  /**
   * template id为 id， size 为 xl l xs s等
   */
  private String template;
}
