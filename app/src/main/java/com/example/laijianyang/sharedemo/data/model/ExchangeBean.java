package com.example.laijianyang.sharedemo.data.model;

import java.util.List;
import lombok.Data;

/**
 * Created by laijianyang on 2016/11/2.
 */
@Data
public class ExchangeBean {
  private String word_third;
  private String word_done;
  private String word_ing;
  private String word_past;
  private List<String> word_pl;
  private List<String> word_est;
  private List<String> word_er;
}
