package com.example.laijianyang.sharedemo.data.model;

import java.util.List;
import lombok.Data;

/**
 * Created by laijianyang on 2016/11/2.
 */
@Data
public class SymbolsBean {
  private String ph_am_mp3;
  private String ph_am;
  private String ph_en_mp3;
  private String ph_en;
  private String ph_other;
  private String ph_tts_mp3;
  /**
   * part : adj.
   * means : ["好的","优秀的","有益的","漂亮的，健全的"]
   */

  private List<PartsBean> parts;
}
