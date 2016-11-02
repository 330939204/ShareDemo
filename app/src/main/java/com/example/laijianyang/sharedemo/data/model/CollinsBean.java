package com.example.laijianyang.sharedemo.data.model;

import java.util.List;
import lombok.Data;

/**
 * Created by laijianyang on 2016/11/2.
 */
@Data
public class CollinsBean {
  private String word_name;
  private String word_id;
  private String word_emphasize;
  private String frequence;
  /**
   * type : mean
   * entry_id : 31371
   * value : [{"mean_type":[{"info_type":"example","info_id":"41108","example":[{"example_id":"39395","tts_size":"10.0","tran":"我们一起玩得真痛快。","ex":"We
   * had a really good time together...","tts_mp3":"e/8/4/e84dbefbf104b00dba31cd1b82f781d4.mp3"}]},{"info_type":"example","info_id":"41109","example":[{"example_id":"39396","tts_size":"10.0","tran":"我知道他们在这里会生活得更好。","ex":"I
   * know they would have a better life here...","tts_mp3":"6/d/5/6d5309ca78b120a42d809b9a5f32731a.mp3"}]},{"info_type":"example","info_id":"41110","example":[{"example_id":"39397","tts_size":"14.0","tran":"没有比喝一大杯热咖啡更惬意的事情了。","ex":"There's
   * nothing better than a good cup of hot coffee...","tts_mp3":"9/a/3/9a382dccb22db22746b2b87e6b13175f.mp3"}]},{"info_type":"example","info_id":"41111","example":[{"example_id":"39398","tts_size":"14.0","tran":"这么久没有联系，听到你的声音真是太好了。","ex":"It's
   * so good to hear your voice after all this time.","tts_mp3":"3/a/9/3a98c2472c89154b0133ef0e6333b33a.mp3"}]}],"gramarinfo":[],"tran":"愉快的；有趣的；令人愉快的","def":"<b>Good<\/b>
   * means pleasant or enjoyable.","mean_id":"30026","posp":[{"label":"ADJ-GRADED"}]}]
   */

  private List<EntryBean> entry;
}
