package com.example.laijianyang.sharedemo.data.model;

import lombok.Data;

/**
 * Created by laijianyang on 2016/11/2.
 */
@Data
public class DictResultBean {
  /**
   * item : [{"tr_group":[{"tr":["articles of commerce"],"example":[],"similar_word":["commodity","trade
   * good"]},{"tr":["moral excellence or admirableness"],"example":["there is much good to be found in
   * people"],"similar_word":["goodness"]},{"tr":["that which is pleasing or valuable or useful"],"example":["weigh
   * the good against the bad","among the highest goods of all are happiness and self-realization"],"similar_word":["goodness"]},{"tr":["benefit"],"example":["for
   * your own good","what's the good of worrying?"],"similar_word":[]}],"pos":"noun"},{"tr_group":[{"tr":["promoting
   * or enhancing well-being"],"example":["an arms limitation agreement beneficial to all countries","the beneficial
   * effects of a temperate climate","the experience was good for her"],"similar_word":["beneficial"]},{"tr":["having
   * the normally expected amount"],"example":["gives full measure","gives good measure","a good mile from
   * here"],"similar_word":["full"]},{"tr":["with or in a close or intimate relationship"],"example":["a good
   * friend","my sisters and brothers are near and dear"],"similar_word":["dear","near"]},{"tr":["thorough"],"example":["had
   * a good workout","gave the house a good cleaning"],"similar_word":[]},{"tr":["generally admired"],"example":["good
   * taste"],"similar_word":[]},{"tr":["exerting force or influence"],"example":["the law is effective immediately","a
   * warranty good for two years","the law is already in effect (or in force)"],"similar_word":["effective","in
   * effect(p)","in force(p)"]},{"tr":["resulting favorably"],"example":["it's a good thing that I wasn't there","it
   * is good that you stayed","it is well that no one saw you","all's well that ends
   * well"],"similar_word":["well(p)"]},{"tr":["not left to spoil"],"example":["the meat is still
   * good"],"similar_word":["undecomposed","unspoiled","unspoilt"]},{"tr":["not forged"],"example":["a good dollar
   * bill"],"similar_word":["honest"]},{"tr":["having desirable or positive qualities especially those suitable for a
   * thing specified"],"example":["good news from the hospital","a good report card","when she was good she was very
   * very good","a good knife is one good for cutting","this stump will make a good picnic table","a good check","a
   * good joke","a good exterior paint","a good secretary","a good dress for the office"],"similar_word":[]},{"tr":["morally
   * admirable"],"example":[],"similar_word":[]},{"tr":["tending to promote physical well-being","beneficial to
   * health"],"example":["beneficial effects of a balanced diet","a good night's sleep","the salutary influence of
   * pure air"],"similar_word":["salutary"]},{"tr":["in excellent physical condition"],"example":["good teeth","I
   * still have one good leg","a sound mind in a sound body"],"similar_word":["sound"]},{"tr":["appealing to the
   * mind"],"example":["good music","a serious book"],"similar_word":["serious"]},{"tr":["agreeable or
   * pleasing"],"example":["we all had a good time","good manners"],"similar_word":[]},{"tr":["most suitable or right
   * for a particular purpose"],"example":["a good time to plant tomatoes","the right time to act","the time is ripe
   * for great sociological changes"],"similar_word":["right","ripe"]},{"tr":["capable of pleasing"],"example":["good
   * looks"],"similar_word":[]},{"tr":["deserving of esteem and respect"],"example":["all respectable companies give
   * guarantees","ruined the family's good name"],"similar_word":["estimable","honorable","respectable"]},{"tr":["of
   * moral excellence"],"example":["a genuinely good person","a just cause","an upright and respectable
   * man"],"similar_word":["just","upright"]},{"tr":["having or showing knowledge and skill and
   * aptitude"],"example":["adept in handicrafts","an adept juggler","an expert job","a good mechanic","a practiced
   * marksman","a proficient engineer","a lesser-known but no less skillful composer","the effect was achieved by
   * skillful retouching"],"similar_word":["adept","expert","practiced","proficient","skillful","skilful"]},{"tr":["financially
   * sound"],"example":["a good investment","a secure investment"],"similar_word":["dependable","safe","secure"]}],"pos":"adj"},{"tr_group":[{"tr":["(often
   * used as a combining form) in a good or proper or satisfactory manner or to a high standard (`good' is a
   * nonstandard dialectal variant for `well')"],"example":["the children behaved well","a task well done","the party
   * went well","he slept well","a well-argued thesis","a well-seasoned dish","a well-planned party","the baby can
   * walk pretty good"],"similar_word":["well"]},{"tr":["completely and absolutely (`good' is sometimes used
   * informally for `thoroughly')"],"example":["he was soundly defeated","we beat him
   * good"],"similar_word":["thoroughly","soundly"]}],"pos":"adv"}]
   * word : good
   */

  private EdictBean edict;
  private String zdict;
  private String from;
  /**
   * word_name : good
   * from : kingsoft
   * word_means : ["好的","优秀的","有益的","漂亮的，健全的","好处，利益","善良","善行","好人","同well"]
   * exchange : {"word_third":"","word_done":"","word_pl":["goods"],"word_est":["best"],"word_ing":"","word_er":["better"],"word_past":""}
   * symbols : [{"ph_am_mp3":"/1/0/75/5f/755f85c2723bb39381c7379a604160d8.mp3","ph_am":"ɡʊd","ph_en_mp3":"/oxford/0/28/a2/28a24294fed307cf7e65361b8da4f6e5.mp3","ph_en":"gʊd","ph_other":"","parts":[{"part":"adj.","means":["好的","优秀的","有益的","漂亮的，健全的"]},{"part":"n.","means":["好处，利益","善良","善行","好人"]},{"part":"adv.","means":["同well"]}],"ph_tts_mp3":"/7/5/5/755f85c2723bb39381c7379a604160d8.mp3"}]
   * is_CRI : 1
   */

  private SimpleMeansBean simple_means;
  /**
   * entry : [{"type":"mean","entry_id":"31371","value":[{"mean_type":[{"info_type":"example","info_id":"41108","example":[{"example_id":"39395","tts_size":"10.0","tran":"我们一起玩得真痛快。","ex":"We
   * had a really good time together...","tts_mp3":"e/8/4/e84dbefbf104b00dba31cd1b82f781d4.mp3"}]},{"info_type":"example","info_id":"41109","example":[{"example_id":"39396","tts_size":"10.0","tran":"我知道他们在这里会生活得更好。","ex":"I
   * know they would have a better life here...","tts_mp3":"6/d/5/6d5309ca78b120a42d809b9a5f32731a.mp3"}]},{"info_type":"example","info_id":"41110","example":[{"example_id":"39397","tts_size":"14.0","tran":"没有比喝一大杯热咖啡更惬意的事情了。","ex":"There's
   * nothing better than a good cup of hot coffee...","tts_mp3":"9/a/3/9a382dccb22db22746b2b87e6b13175f.mp3"}]},{"info_type":"example","info_id":"41111","example":[{"example_id":"39398","tts_size":"14.0","tran":"这么久没有联系，听到你的声音真是太好了。","ex":"It's
   * so good to hear your voice after all this time.","tts_mp3":"3/a/9/3a98c2472c89154b0133ef0e6333b33a.mp3"}]}],"gramarinfo":[],"tran":"愉快的；有趣的；令人愉快的","def":"<b>Good<\/b>
   * means pleasant or enjoyable.","mean_id":"30026","posp":[{"label":"ADJ-GRADED"}]}]},{"type":"mean","entry_id":"31372","value":[{"mean_type":[{"info_type":"example","info_id":"41112","example":[{"example_id":"39399","tts_size":"16.0","tran":"锻炼与合理膳食对健康同等重要。","ex":"Exercise
   * is just as important to health as good food...","tts_mp3":"d/0/5/d05c03bba86a59597500c707b4f1e853.mp3"}]},{"info_type":"example","info_id":"41113","example":[{"example_id":"39400","tts_size":"18.0","tran":"父母想让雷蒙德接受最好的教育。","ex":"His
   * parents wanted Raymond to have the best possible education...","tts_mp3":"9/a/f/9afbebaffa16342fe8dc71c807da4639.mp3"}]},{"info_type":"example","info_id":"41114","example":[{"example_id":"39401","tts_size":"18.0","tran":"火车的平均速度比我们骑自行车的速度快不了多少。","ex":"The
   * train's average speed was no better than that of our bicycles.","tts_mp3":"c/7/5/c751d823fbf9fcf80e11200ad31f2776.mp3"}]},{"info_type":"example","info_id":"41115","example":[{"example_id":"39402","tts_size":"7.0","tran":"质量上乘的家具","ex":"...good
   * quality furniture.","tts_mp3":"6/d/a/6dafef94815d590df60eb57e2a443de3.mp3"}]}],"gramarinfo":[],"tran":"好的；高品质的；高水准的","def":"<b>Good<\/b>
   * means of a high quality, standard, or level.","mean_id":"30027","posp":[{"label":"ADJ-GRADED"}]}]},{"type":"mean","entry_id":"31373","value":[{"mean_type":[{"info_type":"example","info_id":"41116","example":[{"example_id":"39403","tts_size":"9.0","tran":"他工作非常出色。","ex":"He
   * was very good at his work...","tts_mp3":"9/f/a/9faf056eb1a1a8e4d446e8153550ec11.mp3"}]},{"info_type":"example","info_id":"41117","example":[{"example_id":"39404","tts_size":"9.0","tran":"我不太擅长唱歌。","ex":"I'm
   * not very good at singing...","tts_mp3":"1/0/a/10a4223e9ac47b6cc895e2722ce6d82c.mp3"}]},{"info_type":"example","info_id":"41118","example":[{"example_id":"39405","tts_size":"12.0","tran":"他是世界上最优秀的选手之一。","ex":"He
   * is one of the best players in the world...","tts_mp3":"e/9/f/e9f0900dc2b2b0e12759d9cff828d099.mp3"}]},{"info_type":"example","info_id":"41119","example":[{"example_id":"39406","tts_size":"23.0","tran":"我经常跟哥哥一起踢足球，因为就我的年龄而论我的球技还算不错。","ex":"I
   * always played football with my older brother because I was good for my age.","tts_mp3":"5/4/c/54c007d10716ec4d392fcca7c6527dc3.mp3"}]}],"gramarinfo":[{"tran":"","type":"hdgr","label":"oft
   * ADJ <l>at<\/l> n/-ing"}],"tran":"擅长的；精通的；能干的","def":"If you are <b>good at<\/b> something, you are skilful and
   * successful at doing it.","mean_id":"30028","posp":[{"label":"ADJ-GRADED"}]}]},{"type":"mean","entry_id":"31374","value":[{"mean_type":[{"info_type":"example","info_id":"41120","example":[{"example_id":"39407","tts_size":"20.0","tran":"总的来说，生物技术对发展中国家应该是有利的。","ex":"On
   * balance biotechnology should be good news for developing countries...","tts_mp3":"9/8/9/989921ee3723cc1aaab6e89e8f28f8df.mp3"}]},{"info_type":"example","info_id":"41121","example":[{"example_id":"39408","tts_size":"11.0","tran":"我有幸被选中。","ex":"I
   * had the good fortune to be selected...","tts_mp3":"9/0/1/901ec07252c0e1a912d64763f7f1a6dd.mp3"}]},{"info_type":"example","info_id":"41122","example":[{"example_id":"39409","tts_size":"14.0","tran":"这可没有给别的孩子树立好榜样。","ex":"This
   * is not a good example to set other children...","tts_mp3":"2/4/e/24ee295f7935148d4e5a8b8cb3af7158.mp3"}]},{"info_type":"example","info_id":"41123","example":[{"example_id":"39410","tts_size":"8.0","tran":"我认为这次反响还不错。","ex":"I
   * think the response was good.","tts_mp3":"6/9/6/696dab4fb76e9bbda4c8fc0ea52afb1b.mp3"}]}],"gramarinfo":[{"tran":"","type":"hdgr","label":"usu
   * ADJ n"}],"tran":"有利的；有益的","def":"If you describe a piece of news, an action, or an effect as <b>good<\/b>, you
   * mean that it is likely to result in benefit or success.","mean_id":"30029","posp":[{"label":"ADJ-GRADED"}]}]},{"type":"mean","entry_id":"31375","value":[{"mean_type":[{"info_type":"example","info_id":"41124","example":[{"example_id":"39411","tts_size":"20.0","tran":"他们认为让一些违法者去社区做义工是个好主意。","ex":"They
   * thought it was a good idea to make some offenders do community service...","tts_mp3":"2/b/8/2b806dd907fe4c04a2bccf1be407b728.mp3"}]},{"info_type":"example","info_id":"41125","example":[{"example_id":"39412","tts_size":"10.0","tran":"有充分理由对此提出质疑。","ex":"There
   * is good reason to doubt this...","tts_mp3":"b/4/4/b446edec621b11a1ce53ea5ded2965dd.mp3"}]},{"info_type":"example","info_id":"41126","example":[{"example_id":"39413","tts_size":"15.0","tran":"您能就怎样以最好的方式处理这件事给我提点儿建议吗？","ex":"Could
   * you give me some advice on the best way to do this?","tts_mp3":"3/c/0/3c0db2a401c0c2dee7e20620d2b1ff0e.mp3"}]}],"gramarinfo":[{"tran":"","type":"hdgr","label":"usu
   * ADJ n"}],"tran":"合情理的；理由充足的；有根据的","def":"A <b>good<\/b> idea, reason, method, or decision is a sensible or valid
   * one.","mean_id":"30030","posp":[{"label":"ADJ-GRADED"}]}]},{"type":"mean","entry_id":"31376","value":[{"mean_type":[{"info_type":"example","info_id":"41127","example":[{"example_id":"39414","tts_size":"12.0","tran":"我认为一些人要去是好事情。","ex":"I
   * think it's good that some people are going...","tts_mp3":"e/5/8/e58c1cd2a482992ea3593b8a4e9bb352.mp3"}]},{"info_type":"example","info_id":"41128","example":[{"example_id":"39415","tts_size":"18.0","tran":"如果可能，最好还是挑选有机食品。","ex":"It
   * is always best to choose organically grown foods if possible.","tts_mp3":"e/b/8/eb812b743f77db0fd943918aadaebe1b.mp3"}]}],"gramarinfo":[{"tran":"","type":"hdgr","label":"usu
   * v-link ADJ, oft <l>it<\/l> v-link ADJ that/to-inf"}],"tran":"令人满意的；合适的；正确的","def":"If you say that <b>it is good
   * that<\/b> something should happen or <b>good to<\/b> do something, you mean it is desirable, acceptable, or
   * right.","mean_id":"30031","posp":[{"label":"ADJ-GRADED"}]}]},{"type":"mean","entry_id":"31377","value":[{"mean_type":[{"info_type":"example","info_id":"41129","example":[{"example_id":"39416","tts_size":"14.0","tran":"我们对正在发生的事有着相当清楚的认识。","ex":"We
   * have a fairly good idea of what's going on...","tts_mp3":"b/0/4/b04d37cd01caaa9420885be6f6cd8d2c.mp3"}]},{"info_type":"example","info_id":"41130","example":[{"example_id":"39417","tts_size":"18.0","tran":"这是显示学校真面貌的一个更加精确的指标。","ex":"This
   * is a much better indication of what a school is really like...","tts_mp3":"7/3/c/73cdd1c831f1627f8003af79e1a7c202.mp3"}]},{"info_type":"example","info_id":"41131","example":[{"example_id":"39418","tts_size":"21.0","tran":"实验室里的试验并非总能准确地指引人们认识外部世界的种种现象。","ex":"Laboratory
   * tests are not always a good guide to what happens in the world.","tts_mp3":"9/a/f/9af9e21ba9e36692954a2fbc5e3d5c8f.mp3"}]}],"gramarinfo":[{"tran":"","type":"hdgr","label":"usu
   * ADJ n"}],"tran":"精确的；准确的","def":"A <b>good<\/b> estimate or indication of something is an accurate
   * one.","mean_id":"30032","posp":[{"label":"ADJ-GRADED"}]}]},{"type":"mean","entry_id":"31378","value":[{"mean_type":[{"info_type":"example","info_id":"41132","example":[{"example_id":"39419","tts_size":"22.0","tran":"这样的地产是否可获得大笔收益还要视具体情形而定。","ex":"Whether
   * such properties are a good deal will depend on individual situations...","tts_mp3":"0/2/6/0265d0fc7e047cc1195335387d0d6894.mp3"}]},{"info_type":"example","info_id":"41133","example":[{"example_id":"39420","tts_size":"22.0","tran":"这些商品定价合理，很是划算。","ex":"The
   * merchandise is reasonably priced and offers exceptionally good value.","tts_mp3":"8/8/5/885903add6d893dfb525566ff73be4d5.mp3"}]}],"gramarinfo":[{"tran":"","type":"hdgr","label":"usu
   * ADJ n"}],"tran":"划算的；收益可观的","def":"If you get a <b>good<\/b> deal or a <b>good<\/b> price when you buy or sell
   * something, you receive a lot in exchange for what you give.","mean_id":"30033","posp":[{"label":"ADJ-GRADED"}]}]},{"type":"mean","entry_id":"31379","value":[{"mean_type":[{"info_type":"example","info_id":"41134","example":[{"example_id":"39421","tts_size":"17.0","tran":"雨水曾一度被认为可以滋养皮肤。","ex":"Rain
   * water was once considered to be good for the complexion...","tts_mp3":"d/8/9/d8903963f34058c070339b312c6a8bdf.mp3"}]},{"info_type":"example","info_id":"41135","example":[{"example_id":"39422","tts_size":"18.0","tran":"南希选择这种产品是因为它更环保。","ex":"Nancy
   * chose the product because it is better for the environment.","tts_mp3":"f/8/0/f8054565e2dd6d8f81b4c215aaf36ec8.mp3"}]}],"gramarinfo":[{"tran":"","type":"hdgr","label":"v-link
   * ADJ <l>for<\/l> n"}],"tran":"有利的；有益的","def":"If something is <b>good for<\/b> a person or organization, it
   * benefits them.","mean_id":"30034","posp":[{"label":"ADJ-GRADED"}]}]},{"type":"mean","entry_id":"31380","value":[{"mean_type":[{"info_type":"example","info_id":"41136","example":[{"example_id":"39423","tts_size":"14.0","tran":"弗劳德敦促他为了国家的利益辞职。","ex":"Furlaud
   * urged him to resign for the good of the country...","tts_mp3":"4/5/5/4552bd97ad2b7f8865d7f98455c14c35.mp3"}]},{"info_type":"example","info_id":"41137","example":[{"example_id":"39424","tts_size":"28.0","tran":"受害者希望正义得到伸张，这不仅是为了他们自己，也是为了社会的更广泛的利益。","ex":"Victims
   * want to see justice done not just for themselves, but for the greater good of
   * society...","tts_mp3":"b/7/f/b7fb7ebc6677322fcfa839c772d77fbc.mp3"}]},{"info_type":"example","info_id":"41138","example":[{"example_id":"39425","tts_size":"12.0","tran":"我是为了你好才跟你说这个的！","ex":"I'm
   *  only telling you this for your own good!","tts_mp3":"4/c/4/4c4498f6a9d3b9cae3dc09fa5f89fadc.mp3"}]}],"gramarinfo":[{"tran":"","type":"hdgr","label":"with
   * poss"}],"tran":"好处；利益","def":"If something is done for <b>the good<\/b> of a person or organization, it is done
   * in order to benefit them.","mean_id":"30035","posp":[{"label":"N-SING"}]}]},{"type":"mean","entry_id":"31381","value":[{"mean_type":[{"info_type":"example","info_id":"41139","example":[{"example_id":"39426","tts_size":"15.0","tran":"如果天气不好，我就不拍照了。","ex":"If
   * the weather's no good then I won't take any pictures...","tts_mp3":"b/2/d/b2db954a4077a024cb80d8d128d9ae92.mp3"}]},{"info_type":"example","info_id":"41140","example":[{"example_id":"39427","tts_size":"10.0","tran":"我数学向来就不好。","ex":"I
   * was never any good at maths.","tts_mp3":"8/f/3/8f3ca330b18e0fd07bf5b505d9bffc53.mp3"}]}],"gramarinfo":[{"tran":"","type":"hdgr","label":"with
   * brd-neg"}],"tran":"差强人意；低劣；不好","def":"If someone or something is <b>no good<\/b> or is <b>not any good<\/b>, they
   * are not satisfactory or are of a low standard.","mean_id":"30036","posp":[{"label":"N-UNCOUNT"}]}]},{"type":"mean","entry_id":"31382","value":[{"mean_type":[{"info_type":"example","info_id":"41141","example":[{"example_id":"39428","tts_size":"10.0","tran":"现在就为此发愁根本没用。","ex":"It's
   * no good worrying about it now...","tts_mp3":"a/0/e/a0eaeffd17618b30c688dd7f67605c12.mp3"}]},{"info_type":"example","info_id":"41142","example":[{"example_id":"39429","tts_size":"20.0","tran":"我们给他们水喝，为他们驱寒，但是都不管用。","ex":"We
   * gave them water and kept them warm, but it didn't do any good...","tts_mp3":"1/1/a/11a6e865b1f29aa34e30da7153ca789d.mp3"}]},{"info_type":"example","info_id":"41143","example":[{"example_id":"39430","tts_size":"23.0","tran":"没有办法衡量这些效果；可能它起到了一些作用。","ex":"There
   * is no way to measure these effects; the chances are it did some good.","tts_mp3":"6/5/1/65126e1f2e1e46f8c6f288297d43c10c.mp3"}]}],"gramarinfo":[{"tran":"","type":"hdgr","label":"usu
   * with brd-neg"}],"tran":"没好处；没用处","def":"If you say that doing something is <b>no good<\/b> or does <b>not<\/b> do
   * <b>any good<\/b>, you mean that doing it is not of any use or will not bring any
   * success.","mean_id":"30037","posp":[{"label":"N-UNCOUNT"}]}]},{"type":"mean","entry_id":"31383","value":[{"mean_type":[{"info_type":"example","info_id":"41144","example":[{"example_id":"39431","tts_size":"14.0","tran":"善与恶可能并存于一体。","ex":"Good
   * and evil may co-exist within one family.","tts_mp3":"e/7/a/e7ae2c16864d252dac112b88177e00e0.mp3"}]}],"gramarinfo":[],"tran":"善行；美德；合乎道德的行为","def":"<b>Good<\/b>
   * is what is considered to be right according to moral standards or religious beliefs.","mean_id":"30038","posp":[{"label":"N-UNCOUNT"}]}]},{"type":"mean","entry_id":"31384","value":[{"mean_type":[{"info_type":"example","info_id":"41145","example":[{"example_id":"39432","tts_size":"9.0","tran":"总统是个品行端正的人。","ex":"The
   * president is a good man...","tts_mp3":"e/c/2/ec2d69f65cad7ea47615c7ecf1163e2c.mp3"}]},{"info_type":"example","info_id":"41146","example":[{"example_id":"39433","tts_size":"22.0","tran":"在我看来，认为我自己比街上的无家可归者要更加高尚是很可笑的。","ex":"For
   * me to think I'm  any better than a homeless person on the street is ridiculous.","tts_mp3":"c/b/c/cbc26089c7cbb44e1c2b8af4a6d083ab.mp3"}]}],"gramarinfo":[],"tran":"正直的；高尚的；品行好的","def":"Someone
   * who is <b>good<\/b> is morally correct in their attitudes and behaviour.","mean_id":"30039","posp":[{"label":"ADJ-GRADED"}]}]},{"type":"mean","entry_id":"31385","value":[{"mean_type":[{"info_type":"example","info_id":"41147","example":[{"example_id":"39434","tts_size":"9.0","tran":"孩子们非常听话。","ex":"The
   * children were very good...","tts_mp3":"b/c/d/bcdcd23a54fecf659ca57e89ee3abece.mp3"}]},{"info_type":"example","info_id":"41148","example":[{"example_id":"39435","tts_size":"9.0","tran":"我现在要做个乖孩子了。","ex":"I'm
   * going to be a good boy now...","tts_mp3":"d/4/c/d4c1de6f1b02a800335ce01063ad3211.mp3"}]},{"info_type":"example","info_id":"41149","example":[{"example_id":"39436","tts_size":"16.0","tran":"这两个男孩都很有礼貌，友好地握了手。","ex":"Both
   * boys had good manners, politely shaking hands.","tts_mp3":"c/0/6/c06eddde68f0c81c02b369507f64ba73.mp3"}]}],"gramarinfo":[],"tran":"（尤指小孩）乖的，恭顺的，有礼貌的","def":"Someone,
   * especially a child, who is <b>good<\/b> obeys rules and instructions and behaves in a socially correct
   * way.","mean_id":"30040","posp":[{"label":"ADJ-GRADED"}]}]},{"type":"mean","entry_id":"31386","value":[{"mean_type":[{"info_type":"example","info_id":"41150","example":[{"example_id":"39437","tts_size":"6.0","tran":"你对我很体贴。","ex":"You
   * are good to me...","tts_mp3":"b/2/d/b2d7d4eb390ebba2caa644af096cdec2.mp3"}]},{"info_type":"example","info_id":"41151","example":[{"example_id":"39438","tts_size":"16.0","tran":"她的好心几乎马上被人拒绝了。","ex":"Her
   * good intentions were thwarted almost immediately...","tts_mp3":"9/c/3/9c386f5d4a01ba931978698177ab1779.mp3"}]},{"info_type":"example","info_id":"41152","example":[{"example_id":"39439","tts_size":"18.0","tran":"就问一问那位海军上将，是否可以有劳他给我留个便条。","ex":"Just
   * ask the Admiral if he will be good enough to drop me a note.","tts_mp3":"6/7/e/67e0aeeca333413bab5c420d801af5cb.mp3"}]}],"gramarinfo":[],"tran":"好心的；体贴的","def":"Someone
   * who is <b>good<\/b> is kind and thoughtful.","mean_id":"30041","posp":[{"label":"ADJ-GRADED"}]}]},{"type":"mean","entry_id":"31387","value":[{"mean_type":[{"info_type":"example","info_id":"41153","example":[{"example_id":"39440","tts_size":"9.0","tran":"人们的心情十分舒畅。","ex":"People
   * were in a pretty good mood...","tts_mp3":"6/4/1/641f4993c54f64127eaca44e49720c80.mp3"}]},{"info_type":"example","info_id":"41154","example":[{"example_id":"39441","tts_size":"12.0","tran":"他表现出一种与生俱来的魅力和很强的幽默感。","ex":"He
   * exudes natural charm and good humour...","tts_mp3":"f/5/3/f53125507955db3738158df593c57d4e.mp3"}]},{"info_type":"example","info_id":"41155","example":[{"example_id":"39442","tts_size":"17.0","tran":"放松一段时间，你的心情或许会好一些。","ex":"A
   * relaxation session may put you in a better frame of mind.","tts_mp3":"a/7/0/a7027cc7fcf1138c644087fd627dd1cf.mp3"}]}],"gramarinfo":[{"tran":"","type":"hdgr","label":"usu
   * ADJ n"}],"tran":"（心情）愉快的","def":"Someone who is in a <b>good<\/b> mood is cheerful and pleasant to be
   * with.","mean_id":"30042","posp":[{"label":"ADJ-GRADED"}]}]},{"type":"mean","entry_id":"31388","value":[{"mean_type":[{"info_type":"example","info_id":"41156","example":[{"example_id":"39443","tts_size":"10.0","tran":"她与加文是好朋友。","ex":"She
   * and Gavin are good friends...","tts_mp3":"4/d/a/4daa21973573b5934715860fcea83e67.mp3"}]},{"info_type":"example","info_id":"41157","example":[{"example_id":"39444","tts_size":"15.0","tran":"她是我最好的朋友，我真的很喜欢她。","ex":"She's
   *  my best friend, and I really love her.","tts_mp3":"d/f/6/df6117b3570ace4919275c671bf7025d.mp3"}]}],"gramarinfo":[{"tran":"","type":"hdgr","label":"ADJ
   * n"}],"tran":"亲密的；友好的","def":"If people are <b>good<\/b> friends, they get on well together and are very
   * close.","mean_id":"30043","posp":[{"label":"ADJ-GRADED"}]}]},{"type":"mean","entry_id":"31389","value":[{"mean_type":[{"info_type":"example","info_id":"41158","example":[{"example_id":"39445","tts_size":"11.0","tran":"他用那只健全的眼睛看着我笑了。","ex":"He
   * turned his good eye on me and laughed.","tts_mp3":"c/9/d/c9d76c0734a5599f4a05e210307057ab.mp3"}]}],"gramarinfo":[{"tran":"","type":"hdgr","label":"ADJ
   * n"}],"tran":"（身体部位或器官）健全的，强健的","def":"A person's <b>good<\/b> eye, arm, or leg is the one that is healthy and
   * strong, if the other one is injured or weak.","mean_id":"30044","posp":[{"label":"ADJ"}]}]},{"type":"mean","entry_id":"31390","value":[{"mean_type":[{"info_type":"example","info_id":"41159","example":[{"example_id":"39446","tts_size":"9.0","tran":"我们等了足足15分钟。","ex":"We
   * waited a good fifteen minutes...","tts_mp3":"2/b/5/2b51dec803ff4bdaffa3199f14c16ccb.mp3"}]},{"info_type":"example","info_id":"41160","example":[{"example_id":"39447","tts_size":"13.0","tran":"整件事情变得更加危险了。","ex":"This
   * whole thing's  got a good bit more dangerous.","tts_mp3":"8/6/2/86219155f7ed68f01deebbc2928e9329.mp3"}]}],"gramarinfo":[{"tran":"","type":"hdgr","label":"<l>a<\/l>
   * ADJ n"},{"tran":"","type":"boxe","label":"emphasis"}],"tran":"相当的；非常的","def":"You use <b>good<\/b> to emphasize
   * the great extent or degree of something.","mean_id":"30045","posp":[{"label":"ADJ"}]}]},{"type":"mean","entry_id":"31391","value":[{"mean_type":[{"info_type":"example","info_id":"41161","example":[{"example_id":"39448","tts_size":"30.0","tran":"\u201c你还好吗？\u201d\u2014\u2014\u201c我挺好。\u201d\u2014\u2014\u201c那就好。我也还不错。\u201d","ex":"'Are
   * you all right?' \u2014  'I'm fine.' \u2014 'Good. So am I.'...","tts_mp3":"2/3/f/23f029f98ea5b50c7bbb5c0ec94b36e6.mp3"}]},{"info_type":"example","info_id":"41162","example":[{"example_id":"39449","tts_size":"10.0","tran":"哦，太好了，汤姆刚巧进来了。","ex":"Oh
   * good, Tom's just come in...","tts_mp3":"3/7/d/37d784918991a3b91d6dd64b7b55fb11.mp3"}]},{"info_type":"example","info_id":"41163","example":[{"example_id":"39450","tts_size":"20.0","tran":"\u201c第三突击队已到这里，长官。\u201d\u2014\u2014\u201c很好。\u201d","ex":"'Strike
   * Force Three are here, sir.' \u2014 'Good.'","tts_mp3":"b/1/b/b1b243f4fc82204f793e7fe210e93433.mp3"}]}],"gramarinfo":[],"tran":"好；很好","def":"You
   * say '<b>Good<\/b>' or '<b>Very good<\/b>' to express pleasure, satisfaction, or agreement with something that has
   * been said or done, especially when you are in a position of authority.","mean_id":"30046","posp":[{"label":"CONVENTION"}]}]},{"type":"mean","entry_id":"31392","value":[{"mean_type":[{"xrsa":[{"xrsa_id":"940","defx":[],"posc":[],"xrsa_see":"best;better;goods"}],"info_id":"41164","info_type":"xrsa"}],"gramarinfo":[],"tran":"","def":"","mean_id":"30047","posp":[]}]},{"type":"mean","entry_id":"31393","value":[{"mean_type":[{"info_type":"example","info_id":"41165","example":[{"example_id":"39451","tts_size":"9.0","tran":"他的事业差不多完蛋了。","ex":"His
   * career is as good as over...","tts_mp3":"3/b/a/3ba8559c8cc33c83374b5821ab013396.mp3"}]},{"info_type":"example","info_id":"41166","example":[{"example_id":"39452","tts_size":"15.0","tran":"这次投票几乎是扼杀了一次真正改革的机会。","ex":"The
   * vote as good as kills the chance of real reform.","tts_mp3":"b/6/0/b6075eef4d67f5374e34b5052f86a04b.mp3"}]}],"gramarinfo":[{"tran":"","type":"hdgr","label":"v-link
   * PHR adj/-ed/v"}],"tran":"几乎；差不多","def":"'<b>As good as<\/b>' can be used to mean
   * 'almost.'","mean_id":"30048","posp":[{"label":"PHRASE"}]}]},{"type":"mean","entry_id":"31394","value":[{"mean_type":[{"info_type":"example","info_id":"41167","example":[{"example_id":"39453","tts_size":"13.0","tran":"为共同利益而团结协作的社区","ex":"...communities
   * working together  for the common good...","tts_mp3":"6/8/9/68907a6e693813f59dc0c3c4e99e65b8.mp3"}]},{"info_type":"example","info_id":"41168","example":[{"example_id":"39454","tts_size":"17.0","tran":"他们中的许多人置一己私利于集体利益之上。","ex":"Many
   * of them placed self-interest before the common good.","tts_mp3":"6/7/8/6786060d91af2c4130bb32838981ac98.mp3"}]}],"gramarinfo":[{"tran":"","type":"hdgr","label":"oft
   * <l>for<\/l> PHR"}],"tran":"为了共同利益","def":"If you do something <b>for the common good<\/b>, you do it for the
   * benefit or advantage of everyone.","mean_id":"30049","posp":[{"label":"PHRASE"}]}]},{"type":"mean","entry_id":"31395","value":[{"mean_type":[{"info_type":"example","info_id":"41169","example":[{"example_id":"39455","tts_size":"8.0","tran":"这次远足对我会有所助益。","ex":"The
   * outing will do me good...","tts_mp3":"a/d/9/ad935cee8ca08f5675b3f4849ca18487.mp3"}]},{"info_type":"example","info_id":"41170","example":[{"example_id":"39456","tts_size":"15.0","tran":"离开几小时或许对你有好处。","ex":"It's
   *  probably done you good to get away for a few hours...","tts_mp3":"9/3/a/93a1bcab8655fa6c966bd375c34d0008.mp3"}]},{"info_type":"example","info_id":"41171","example":[{"example_id":"39457","tts_size":"17.0","tran":"你要是被抓了对谁都没有好处。","ex":"You
   * don't do anybody any good by getting yourself arrested.","tts_mp3":"5/0/e/50ea31a5ebd9e3ef06477047b1dc46e6.mp3"}]}],"gramarinfo":[{"tran":"","type":"hdgr","label":"V
   * inflects, oft <l>it<\/l> PHR if/to-inf"}],"tran":"对\u2026有好处（或有帮助）","def":"If you say that something will
   * <b>do<\/b> someone <b>good<\/b>, you mean that it will benefit them or improve
   * them.","mean_id":"30050","posp":[{"label":"PHRASE"}]}]},{"type":"mean","entry_id":"31396","value":[{"mean_type":[{"info_type":"example","info_id":"41172","example":[{"example_id":"39458","tts_size":"16.0","tran":"在赫恩山举行盛大赛马会的日子早已一去不复返了。","ex":"The
   * days of big-time racing at Herne Hill had gone for good...","tts_mp3":"3/6/8/3684140e68e3e5daf6a46ba5ce0d9091.mp3"}]},{"info_type":"example","info_id":"41173","example":[{"example_id":"39459","tts_size":"16.0","tran":"注射几次这种药物就根除了这种疾病。","ex":"A
   * few shots of this drug cleared up the disease for good.","tts_mp3":"5/4/c/54c874d76d7e6b9eecd235766be36290.mp3"}]}],"gramarinfo":[{"tran":"","type":"hdgr","label":"PHR
   * after v"}],"tran":"永远；永久","def":"If something changes or disappears <b>for good<\/b>, it never changes back or
   * comes back as it was before.","mean_id":"30051","posp":[{"label":"PHRASE"}]}]},{"type":"mean","entry_id":"31397","value":[{"mean_type":[{"info_type":"example","info_id":"41174","example":[{"example_id":"39460","tts_size":"21.0","tran":"\u201c他现在有女朋友了，他们住在一起。\u201d\u2014\u2014\u201c他可真行啊。\u201d","ex":"'He
   * has a girl now, who he lives with.' \u2014 'Good for him.'","tts_mp3":"5/3/6/53673bbd4b9dbf2ee955717e8289ddfd.mp3"}]}],"gramarinfo":[{"tran":"","type":"boxe","label":"feelings"}],"tran":"（称赞某人）真行，真棒","def":"People
   * say '<b>Good for you<\/b>' to express approval of your actions.","mean_id":"30052","posp":[{"label":"CONVENTION"}]}]},{"type":"mean","entry_id":"31398","value":[{"mean_type":[{"info_type":"example","info_id":"41175","example":[{"example_id":"39461","tts_size":"13.0","tran":"乔总能绘声绘色地旁征博引。","ex":"Joe
   * was always good for a colorful quote...","tts_mp3":"e/c/2/ec2f9dbf4f2157eebcb12c785c5e1986.mp3"}]},{"info_type":"example","info_id":"41176","example":[{"example_id":"39462","tts_size":"30.0","tran":"她听到父亲叫嚷说母亲愚蠢无能，除了有点钱外一无是处。","ex":"She
   * heard her father shouting that her mother was stupid, useless, and good for nothing but her
   * money.","tts_mp3":"3/d/3/3d300482cc095ad548a1418349728e1b.mp3"}]}],"gramarinfo":[{"tran":"","type":"hdgr","label":"V
   * inflects, PHR n"}],"tran":"善于做；精通于","def":"If someone <b>is good for<\/b> something, you can rely on them to
   * provide that thing.","mean_id":"30053","posp":[{"label":"PHRASE"}]}]},{"type":"mean","entry_id":"31399","value":[{"mean_type":[{"info_type":"example","info_id":"41177","example":[{"example_id":"39463","tts_size":"8.0","tran":"幸好你没有结婚。","ex":"It's
   * a good thing you aren't married...","tts_mp3":"3/6/5/3652d9cf8d18e56c3066228557a55d9e.mp3"}]},{"info_type":"example","info_id":"41178","example":[{"example_id":"39464","tts_size":"16.0","tran":"庆幸的是事故发生在这里而不是在公路上。","ex":"It's
   * a good job it happened here rather than on the open road.","tts_mp3":"8/7/9/8797ae189a6b151c886b474bdd2b3876.mp3"}]}],"gramarinfo":[{"tran":"","type":"hdgr","label":"V
   * inflects"}],"tran":"庆幸的是，幸运的是（英国英语中作 it's a good job, that）","def":"If you say <b>it's a good thing<\/b>, or in
   * British English <b>it's a good job<\/b> ,<b>that<\/b> something is the case, you mean that it is
   * fortunate.","mean_id":"30054","posp":[{"label":"PHRASE"}]}]},{"type":"mean","entry_id":"31400","value":[{"mean_type":[{"info_type":"example","info_id":"41179","example":[{"example_id":"39465","tts_size":"17.0","tran":"也许要花上几十亿卢布才能赔偿这一损失。","ex":"It
   * may cost several billion roubles to make good the damage.","tts_mp3":"2/4/d/24db3380fa80499b1c5172d3bd697e32.mp3"}]}],"gramarinfo":[{"tran":"","type":"hdgr","label":"V
   * inflects, PHR n"}],"tran":"修复；恢复；偿付；赔偿","def":"If you <b>make good<\/b> some damage, a loss, or a debt, you try
   * to repair the damage, replace what has been lost, or repay the debt.","mean_id":"30055","posp":[{"label":"PHRASE"}]}]},{"type":"mean","entry_id":"31401","value":[{"mean_type":[{"info_type":"example","info_id":"41180","example":[{"example_id":"39466","tts_size":"22.0","tran":"他曾威胁要杀了她，而她确定他这次就要向她索命，便冲上前去拿枪。","ex":"Certain
   * that he was going to make good his threat to kill her, she lunged for the gun...","tts_mp3":"d/9/f/d9fc263c5f748f6fb028915525a7ffaf.mp3"}]},{"info_type":"example","info_id":"41181","example":[{"example_id":"39467","tts_size":"17.0","tran":"他相信盟友们会履行他们的承诺。","ex":"He
   * was confident the allies would make good on their pledges.","tts_mp3":"8/7/7/87727b589be756aaf51e292455c60cef.mp3"}]}],"gramarinfo":[{"tran":"","type":"hdgr","label":"V
   * inflects, PHR n, PHR <l>on<\/l> n"},{"tran":"主美","type":"lbrn","label":"mainly
   * AM"}],"tran":"兑现，履行（诺言等）","def":"If someone <b>makes good<\/b> a threat or promise or <b>makes good on<\/b> it,
   * they do what they have threatened or promised to do.","mean_id":"30056","posp":[{"label":"PHRASE"}]}]},{"type":"mean","entry_id":"31402","value":[{"mean_type":[{"info_type":"example","info_id":"41182","example":[{"example_id":"39468","tts_size":"11.0","tran":"两人都是出身贫穷，最终干出了一番事业。","ex":"Both
   * men are poor boys made good.","tts_mp3":"5/e/7/5e78a0548cc9a24906a2f5d41e0ec0c0.mp3"}]}],"gramarinfo":[{"tran":"","type":"hdgr","label":"V
   * inflects"}],"tran":"获得成功；出名；发迹","def":"If someone <b>makes good<\/b>, they become successful, famous, or
   * rich.","mean_id":"30057","posp":[{"label":"PHRASE"}]}]},{"type":"mean","entry_id":"31403","value":[{"mean_type":[{"info_type":"example","info_id":"41183","example":[{"example_id":"39469","tts_size":"19.0","tran":"我只在特别的场合下才使用它，所以它跟新的一样。","ex":"I
   * only ever use that on special occasions so it's as good as new...","tts_mp3":"5/1/1/5112455ad724bcf54d4184dc0b341fb5.mp3"}]},{"info_type":"example","info_id":"41184","example":[{"example_id":"39470","tts_size":"12.0","tran":"他大概一天工夫就会恢复过来。","ex":"In
   * a day or so he will be as good as new.","tts_mp3":"7/7/c/77c48c5f11ff0e1a5c4d3e6433408bfb.mp3"}]}],"gramarinfo":[{"tran":"","type":"hdgr","label":"usu
   * v-link PHR"}],"tran":"（尤指在康复或修复后）同以前一样好","def":"If you say that something or someone is <b>as good as new<\/b>,
   * you mean that they are in a very good condition or state, especially after they have been damaged or
   * ill.","mean_id":"30058","posp":[{"label":"PHRASE"}]}]},{"type":"mean","entry_id":"31404","value":[{"mean_type":[{"info_type":"example","info_id":"41185","example":[{"example_id":"39471","tts_size":"15.0","tran":"亲爱的哈里。永远值得信赖。","ex":"Good
   * old Harry. Reliable to the end...","tts_mp3":"7/2/a/72a2d8659993709713ad9cd5b9669950.mp3"}]},{"info_type":"example","info_id":"41186","example":[{"example_id":"39472","tts_size":"15.0","tran":"这道令人喜爱的芝士菜花没有什么问题。","ex":"There
   * is nothing wrong with good old cauliflower cheese.","tts_mp3":"c/9/c/c9cdb12dcf73a8c7b4dd920803ac960a.mp3"}]}],"gramarinfo":[{"tran":"","type":"hdgr","label":"PHR
   * n"},{"tran":"","type":"boxe","label":"feelings"}],"tran":"（用于人名、地名或事物名前表示喜爱）亲爱的，可爱的","def":"You use <b>good
   * old<\/b> before the name of a person, place, or thing when you are referring to them in an affectionate
   * way.","mean_id":"30059","posp":[{"label":"PHRASE"}]}]},{"type":"mean","entry_id":"31405","value":[{"mean_type":[],"gramarinfo":[],"tran":"优裕的生活；奢华安逸的生活","def":"If
   * you say that someone is living <b>the good life<\/b>, you mean that they are living in comfort and luxury with
   * few problems or worries.","mean_id":"30060","posp":[{"label":"PHRASE"}]}]},{"type":"mean","entry_id":"31406","value":[{"mean_type":[{"info_type":"xrse","info_id":"41187","xrse":[{"xrse_see":"book","defx":[],"posc":[],"def":"to
   * <b>be in<\/b> someone's <b>good books<\/b>","xrse_id":"875"}]},{"info_type":"xrse","info_id":"41188","xrse":[{"xrse_see":"deal","defx":[],"posc":[],"def":"good
   * deal","xrse_id":"876"}]},{"info_type":"xrse","info_id":"41189","xrse":[{"xrse_see":"faith","defx":[],"posc":[],"def":"in
   * good faith","xrse_id":"877"}]},{"info_type":"xrse","info_id":"41190","xrse":[{"xrse_see":"far","defx":[],"posc":[],"def":"so
   * far so good","xrse_id":"878"}]},{"info_type":"xrse","info_id":"41191","xrse":[{"xrse_see":"few","defx":[],"posc":[],"def":"a
   * good few","xrse_id":"879"}]},{"info_type":"xrse","info_id":"41192","xrse":[{"xrse_see":"gold","defx":[],"posc":[],"def":"good
   * as gold","xrse_id":"880"}]},{"info_type":"xrse","info_id":"41193","xrse":[{"xrse_see":"gracious","defx":[],"posc":[],"def":"good
   * gracious","xrse_id":"881"}]},{"info_type":"xrse","info_id":"41194","xrse":[{"xrse_see":"grief","defx":[],"posc":[],"def":"good
   * grief","xrse_id":"882"}]},{"info_type":"xrse","info_id":"41195","xrse":[{"xrse_see":"heaven","defx":[],"posc":[],"def":"good
   * heavens","xrse_id":"883"}]},{"info_type":"xrse","info_id":"41196","xrse":[{"xrse_see":"ill","defx":[],"posc":[],"def":"for
   * good or ill","xrse_id":"884"}]},{"info_type":"xrse","info_id":"41197","xrse":[{"xrse_see":"job","defx":[],"posc":[],"def":"good
   * job","xrse_id":"885"}]},{"info_type":"xrse","info_id":"41198","xrse":[{"xrse_see":"lord","defx":[],"posc":[],"def":"good
   * lord","xrse_id":"886"}]},{"info_type":"xrse","info_id":"41199","xrse":[{"xrse_see":"measure","defx":[],"posc":[],"def":"for
   * good measure","xrse_id":"887"}]},{"info_type":"xrse","info_id":"41200","xrse":[{"xrse_see":"old","defx":[],"posc":[],"def":"the
   * good old days","xrse_id":"888"}]},{"info_type":"xrse","info_id":"41201","xrse":[{"xrse_see":"question","defx":[],"posc":[],"def":"good
   * question","xrse_id":"889"}]},{"info_type":"xrse","info_id":"41202","xrse":[{"xrse_see":"shape","defx":[],"posc":[],"def":"in
   * good shape","xrse_id":"890"}]},{"info_type":"xrse","info_id":"41203","xrse":[{"xrse_see":"stead","defx":[],"posc":[],"def":"to
   * stand someone in good stead","xrse_id":"891"}]},{"info_type":"xrse","info_id":"41204","xrse":[{"xrse_see":"time","defx":[],"posc":[],"def":"in
   * good time","xrse_id":"892"}]},{"info_type":"xrse","info_id":"41205","xrse":[{"xrse_see":"true","defx":[],"posc":[],"def":"too
   * good to be true","xrse_id":"893"}]},{"info_type":"xrse","info_id":"41206","xrse":[{"xrse_see":"word","defx":[],"posc":[],"def":"to
   * be as good as  one's word","xrse_id":"894"}]}],"gramarinfo":[],"tran":"","def":"","mean_id":"30061","posp":[]}]}]
   * word_name : good
   * word_id : 14381
   * word_emphasize : good
   * frequence : 5
   */

  private CollinsBean collins;
  private String lang;
}
