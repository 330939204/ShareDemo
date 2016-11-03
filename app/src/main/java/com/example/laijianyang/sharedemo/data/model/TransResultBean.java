package com.example.laijianyang.sharedemo.data.model;

import java.util.List;
import lombok.Data;

/**
 * Created by laijianyang on 2016/11/2.
 */
@Data
public class TransResultBean {
  private String from;
  private String to;
  private String domain;
  private int type;
  private int status;
  private List<DataBean> data;

}
