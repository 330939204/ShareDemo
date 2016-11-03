package com.example.laijianyang.sharedemo.data.model;

import java.util.List;
import lombok.Data;

/**
 * Created by laijianyang on 2016/11/3.
 */
@Data
public class ExchangeBean {
  private String word_est;
  private String word_er;
  private List<String> word_third;
  private List<String> word_done;
  private List<String> word_pl;
  private List<String> word_ing;
  private List<String> word_past;
}
