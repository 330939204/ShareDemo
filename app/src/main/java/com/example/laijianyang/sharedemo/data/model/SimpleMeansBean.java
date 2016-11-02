package com.example.laijianyang.sharedemo.data.model;

import java.util.List;
import lombok.Data;

/**
 * Created by laijianyang on 2016/11/2.
 */
@Data
public class SimpleMeansBean {
  private String word_name;
  private String from;
  /**
   * word_third :
   * word_done :
   * word_pl : ["goods"]
   * word_est : ["best"]
   * word_ing :
   * word_er : ["better"]
   * word_past :
   */

  private ExchangeBean exchange;
  private String is_CRI;
  private List<String> word_means;
  /**
   * ph_am_mp3 : /1/0/75/5f/755f85c2723bb39381c7379a604160d8.mp3
   * ph_am : ɡʊd
   * ph_en_mp3 : /oxford/0/28/a2/28a24294fed307cf7e65361b8da4f6e5.mp3
   * ph_en : gʊd
   * ph_other :
   * parts : [{"part":"adj.","means":["好的","优秀的","有益的","漂亮的，健全的"]},{"part":"n.","means":["好处，利益","善良","善行","好人"]},{"part":"adv.","means":["同well"]}]
   * ph_tts_mp3 : /7/5/5/755f85c2723bb39381c7379a604160d8.mp3
   */

  private List<SymbolsBean> symbols;
}
