package com.example.laijianyang.sharedemo.data.model;

import java.util.List;
import lombok.Data;

/**
 * Created by laijianyang on 2016/11/2.
 */
@Data
public class ValueBean {
  private String tran;
  private String def;
  private String mean_id;
  /**
   * info_type : example
   * info_id : 41108
   * example : [{"example_id":"39395","tts_size":"10.0","tran":"我们一起玩得真痛快。","ex":"We had a really good time
   * together...","tts_mp3":"e/8/4/e84dbefbf104b00dba31cd1b82f781d4.mp3"}]
   */

  private List<MeanTypeBean> mean_type;
  private List<?> gramarinfo;
  /**
   * label : ADJ-GRADED
   */

  private List<PospBean> posp;
}
