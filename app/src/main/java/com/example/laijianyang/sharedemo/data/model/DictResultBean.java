package com.example.laijianyang.sharedemo.data.model;

import java.util.List;
import lombok.Data;

/**
 * Created by laijianyang on 2016/11/3.
 */
@Data
public class DictResultBean {

  /**
   * word_name : reason
   * from : kingsoft
   * word_means : ["原因","理由","理性","理智","推理，思考","争辩","辩论","向\u2026解释"]
   * exchange : {"word_third":["reasons"],"word_done":["reasoned"],"word_pl":["reasons"],"word_est":"","word_ing":["reasoning"],"word_er":"","word_past":["reasoned"]}
   * symbols : [{"ph_am_mp3":"/1/0/40/be/40bea8d637cdf2c1b07fcf0630482b73.mp3","ph_am":"ˈrizən","ph_en_mp3":"/oxford/0/f1/7b/f17b3359692586c3f679a84fab3e2f7c.mp3","ph_en":"ˈri:zn","ph_other":"","parts":[{"part":"n.","means":["原因","理由","理性","理智"]},{"part":"vt.& vi.","means":["推理，思考","争辩","辩论","向\u2026解释"]}],"ph_tts_mp3":"/4/0/b/40bea8d637cdf2c1b07fcf0630482b73.mp3"}]
   * is_CRI : 1
   */

  private String word_name;
  private String from;
  /**
   * word_third : ["reasons"]
   * word_done : ["reasoned"]
   * word_pl : ["reasons"]
   * word_est :
   * word_ing : ["reasoning"]
   * word_er :
   * word_past : ["reasoned"]
   */

  private ExchangeBean exchange;
  /**
   * ph_am_mp3 : /1/0/40/be/40bea8d637cdf2c1b07fcf0630482b73.mp3
   * ph_am : ˈrizən
   * ph_en_mp3 : /oxford/0/f1/7b/f17b3359692586c3f679a84fab3e2f7c.mp3
   * ph_en : ˈri:zn
   * ph_other :
   * parts : [{"part":"n.","means":["原因","理由","理性","理智"]},{"part":"vt.& vi.","means":["推理，思考","争辩","辩论","向\u2026解释"]}]
   * ph_tts_mp3 : /4/0/b/40bea8d637cdf2c1b07fcf0630482b73.mp3
   */

  private List<SymbolsBean> symbols;
}
