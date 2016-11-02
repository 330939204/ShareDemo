package com.example.laijianyang.sharedemo.data.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * Created by laijianyang on 2016/11/2.
 */
@Data
public class LijuResultBean {
  @SerializedName("double")
  private String doubleX;
  private String single;
}
