package com.example.laijianyang.sharedemo.data.model;

import java.util.List;
import lombok.Data;

/**
 * Created by laijianyang on 2016/11/2.
 */
@Data
public class EdictBean {
  private String word;
  /**
   * tr_group : [{"tr":["articles of commerce"],"example":[],"similar_word":["commodity","trade
   * good"]},{"tr":["moral excellence or admirableness"],"example":["there is much good to be found in
   * people"],"similar_word":["goodness"]},{"tr":["that which is pleasing or valuable or useful"],"example":["weigh
   * the good against the bad","among the highest goods of all are happiness and
   * self-realization"],"similar_word":["goodness"]},{"tr":["benefit"],"example":["for your own good","what's the
   * good of worrying?"],"similar_word":[]}]
   * pos : noun
   */

  private List<ItemBean> item;

}
