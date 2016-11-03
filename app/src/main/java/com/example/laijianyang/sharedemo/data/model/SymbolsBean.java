package com.example.laijianyang.sharedemo.data.model;

import java.util.List;
import lombok.Data;

/**
 * Created by laijianyang on 2016/11/3.
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
   * part : n.
   * means : ["原因","理由","理性","理智"]
   */

  private List<PartsBean> parts;
}
