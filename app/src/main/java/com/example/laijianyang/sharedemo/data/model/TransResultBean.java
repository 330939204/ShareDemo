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
  /**
   * dst : 好的
   * src : good
   * relation : []
   * result : [[0,"好的",["0|4"],[],["0|4"],["0|6"]]]
   */

  private List<DataBean> data;
  /**
   * src_str : 好
   * trg_str : hǎo
   */

  private List<PhoneticBean> phonetic;

}
