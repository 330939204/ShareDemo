package com.example.laijianyang.sharedemo.data.model;

import java.util.List;
import lombok.Data;

/**
 * Created by laijianyang on 2016/11/2.
 */
@Data
public class DataBean {
  private String dst;
  private String src;
  private List<?> relation;
  private List<List<Integer>> result;
}
