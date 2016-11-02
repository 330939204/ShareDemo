package com.example.laijianyang.sharedemo.data.model;

import java.util.List;
import lombok.Data;

/**
 * Created by laijianyang on 2016/11/2.
 */
@Data
public class TrGroupBean {
  private List<String> tr;
  private List<?> example;
  private List<String> similar_word;

}
