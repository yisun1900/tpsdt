package com.sh.tpsdt.constants;

import com.sh.tpsdt.model.brute_meter.BruteMeterRule;
import com.sh.tpsdt.model.brute_meter.BruteMeterStandard;
import com.sh.tpsdt.model.heat_structure.HeatStructureRule;
import com.sh.tpsdt.model.heat_structure.HeatStructureStandard;

import java.util.Arrays;
import java.util.List;

/**
 * @program: tpsdt
 * @description:
 * @author:
 * @create: 2019-03-14 14:21
 **/
public interface CommandConstants {

    String COMMAND_BRUTE_METER = "==== 频度划分的暴力攻击算法评估：";

    String COMMAND_LENGTH_TITLE = "==== 口令长度：";

    String COMMAND_GRAMMAR_TITLE = "==== 语法结构：";

    String COMMAND_GRAMMAR_CONTENT = "语法结构：";

    String COMMAND_SYNTACTIC_TITLE = "==== 句法结构：";

    String COMMAND_SYNTACTIC_CONTENT = "句法结构：";

    String COMMAND_PERSON_PREFER_TITLE = "==== 个人信息相关：";

    String COMMAND_POINT_TITLE = "==== 综合口令强弱：";

    String COMMAND_RECOMMEND = "推荐口令：";

    String COMMAND_HEAT_STRUCTURE_TITLE = "==== 基于热词与结构攻击算法评估：";

    String AZ_VOWEL = "[aoeiu]";

    String AZ_HIGH = "[nlrstmcdy]";

    String AZ_LOW = "[hbkgpvjfzwxq]";

    String AZ = "[A-Z]";

    String NUM09 = "[0-9]";

    String AZ_UPPER = "[ABCDEFGHIJKLMNOPQRSTUVWXYZ]";

    String AZ_LOWER = "[abcdefghijklmnopqrstuvwxyz]";

    String SP = "[._!-*@#/$,+&\\)=?(';]%<~[:^`\">{}|]";

    String SP_HIGH = "[._!-*@#/]";

    String SP_LOW = "[$,+&\\)=?(';]%<~[:^`\">{}|]";

    String AZ_VOWEL_TITLE = "元音字母";

    String AZ_HIGH_TITLE = "高频小写字母";

    String AZ_LOW_TITLE = "低频小写字母";

    String AZ_TITLE = "大写字母";

    String NUM09_TITLE = "数字";

    String SP_TITLE = "键盘特殊字符";

    String CHINESE_WORD = "/^[\\u4e00-\\u9fa5]+$/";

    String DATE = "/((?!0000)[0-9]{4}-((0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-8])|(0[13-9]|1[0-2])-(29|30)|(0[13578]|1[02])-31)|([0-9]{2}(0[48]|[2468][048]|[13579][26])|(0[48]|[2468][048]|[13579][26])00)-02-29)/";

    String EMAIL = "/[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?/";

    String MAC = "/([A-Fa-f0-9]{2}-){5}[A-Fa-f0-9]{2}/";

    String ID_CARD = "/^(\\d{6})(\\d{4})(\\d{2})(\\d{2})(\\d{3})([0-9]|X)$/";

    String IP = "/((25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.){3}(25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))/";

    String TIMER_24 = "^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9](:[0-5][0-9])?$";

    String TIMER_12 = "0[0-9]:[0-5][0-9]|1[0-1]:[0-5][0-9]";

    List<BruteMeterRule> bruteMeterRule = Arrays.asList(
            //SUPER LOW =================================================================================================================
            new BruteMeterRule(8, NUM09 + "{1,8}", Math.pow(10, 6), 1),
            new BruteMeterRule(8, AZ_LOWER + "{1,8}", Math.pow(10, 6), 1),
            new BruteMeterRule(8, AZ_VOWEL + "{1,8}", Math.pow(10, 6), 1),
            new BruteMeterRule(8, AZ_HIGH + "{1,8}", Math.pow(10, 6), 1),
            new BruteMeterRule(8, SP + "{1,8}", Math.pow(10, 6), 1),
            new BruteMeterRule(0, CHINESE_WORD + "+", 10d, 1),
            new BruteMeterRule(0, EMAIL, 10d, 1),
            new BruteMeterRule(0, MAC, 10d, 1),
            new BruteMeterRule(0, ID_CARD, 10d, 1),
            new BruteMeterRule(0, IP, 10d, 1),
            new BruteMeterRule(0, DATE, 10d, 1),
            new BruteMeterRule(0, TIMER_24, 10d, 1),
            new BruteMeterRule(0, TIMER_12, 10d, 1),
            new BruteMeterRule(1, AZ_VOWEL, 15d, 2),
            new BruteMeterRule(1, AZ_HIGH, 24d, 3),
            new BruteMeterRule(1, AZ_LOW, 36d, 4),
            new BruteMeterRule(4, NUM09 + "{4}", 10036d, 5),
            new BruteMeterRule(2, AZ_HIGH + AZ_VOWEL, 10081d, 6),
            new BruteMeterRule(2, NUM09 + "{2}", 10181d, 7),
            new BruteMeterRule(5, NUM09 + "{5}", 110181d, 8),
            new BruteMeterRule(3, AZ_HIGH + AZ_VOWEL + AZ_HIGH, 110586d, 9),
            new BruteMeterRule(2, AZ_LOW + AZ_VOWEL, 110646d, 10),
            new BruteMeterRule(6, NUM09 + "{6}", 1.11 * Math.pow(10, 6), 11),
            new BruteMeterRule(4, AZ_HIGH + AZ_VOWEL + AZ_HIGH + AZ_VOWEL, 1.11 * Math.pow(10, 6), 12),
            new BruteMeterRule(2, AZ_HIGH + "{2}", 1.11 * Math.pow(10, 6), 13),
            new BruteMeterRule(3, AZ_VOWEL + AZ_HIGH + AZ_VOWEL, 1.11 * Math.pow(10, 6), 14),
            new BruteMeterRule(5, AZ_HIGH + AZ_VOWEL + AZ_HIGH + AZ_VOWEL + AZ_HIGH, 1.13 * Math.pow(10, 6), 15),
            new BruteMeterRule(3, AZ_HIGH + AZ_VOWEL + "{2}", 1.13 * Math.pow(10, 6), 16),
            new BruteMeterRule(2, AZ_HIGH + AZ_LOW, 1.13 * Math.pow(10, 6), 17),
            new BruteMeterRule(2, AZ_VOWEL + AZ_LOW, 1.13 * Math.pow(10, 6), 18),
            new BruteMeterRule(3, NUM09 + "{2}", 1.13 * Math.pow(10, 6), 19),
            new BruteMeterRule(3, AZ_LOW + AZ_VOWEL + AZ_HIGH, 1.13 * Math.pow(10, 6), 20),
            //LOW =====================================================================================================================
            new BruteMeterRule(3, "([\\d])\\1{3}", BruteMeterStandard.LOW, 21),
            new BruteMeterRule(5, AZ_VOWEL + "{5}", BruteMeterStandard.LOW, 22),
            new BruteMeterRule(5, AZ_HIGH + "{5}", BruteMeterStandard.LOW, 23),
            new BruteMeterRule(5, AZ_LOW + "{5}", BruteMeterStandard.LOW, 24),
            new BruteMeterRule(4, NUM09 + "{4}", BruteMeterStandard.LOW, 25),
            new BruteMeterRule(2, AZ_HIGH + AZ_VOWEL, BruteMeterStandard.LOW, 26),
            new BruteMeterRule(2, NUM09 + "{2}", BruteMeterStandard.LOW, 27),
            new BruteMeterRule(5, NUM09 + "{5}", BruteMeterStandard.LOW, 28),
            new BruteMeterRule(3, AZ_HIGH + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.LOW, 29),
            new BruteMeterRule(2, AZ_LOW + AZ_VOWEL, BruteMeterStandard.LOW, 30),
            new BruteMeterRule(6, NUM09 + "{6}", BruteMeterStandard.LOW, 31),
            new BruteMeterRule(4, AZ_HIGH + AZ_VOWEL + AZ_HIGH + AZ_VOWEL, BruteMeterStandard.LOW, 32),
            new BruteMeterRule(2, AZ_HIGH + "{2}", BruteMeterStandard.LOW, 33),
            new BruteMeterRule(3, AZ_VOWEL + AZ_HIGH + AZ_VOWEL, BruteMeterStandard.LOW, 34),
            new BruteMeterRule(5, AZ_HIGH + AZ_VOWEL + AZ_HIGH + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.LOW, 35),
            new BruteMeterRule(3, AZ_HIGH + AZ_VOWEL + "{2}", BruteMeterStandard.LOW, 36),
            new BruteMeterRule(2, AZ_HIGH + AZ_LOW, BruteMeterStandard.LOW, 37),
            new BruteMeterRule(2, AZ_VOWEL + AZ_LOW, BruteMeterStandard.LOW, 38),
            new BruteMeterRule(3, NUM09 + "{2}", BruteMeterStandard.LOW, 39),
            new BruteMeterRule(3, AZ_LOW + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.LOW, 40),
            //MEDIUM===================================================================================================================
            new BruteMeterRule(5, NUM09, BruteMeterStandard.MEDIUM, 41),
            new BruteMeterRule(5, AZ_VOWEL, BruteMeterStandard.MEDIUM, 42),
            new BruteMeterRule(5, AZ_HIGH, BruteMeterStandard.MEDIUM, 43),
            new BruteMeterRule(5, AZ_LOW, BruteMeterStandard.MEDIUM, 44),
            new BruteMeterRule(5, NUM09 + "{5}", BruteMeterStandard.MEDIUM, 45),
            new BruteMeterRule(5, AZ_HIGH + "{4}" + AZ_VOWEL, BruteMeterStandard.MEDIUM, 46),
            new BruteMeterRule(5, NUM09 + AZ_VOWEL + "{4}", BruteMeterStandard.MEDIUM, 47),
            new BruteMeterRule(5, NUM09 + AZ_LOW + "{4}", BruteMeterStandard.MEDIUM, 48),
            new BruteMeterRule(5, AZ_HIGH + "{3}" + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.MEDIUM, 49),
            new BruteMeterRule(5, AZ_LOW + AZ_VOWEL + "{4}", BruteMeterStandard.MEDIUM, 50),
            new BruteMeterRule(6, NUM09 + "{6}", BruteMeterStandard.MEDIUM, 51),
            new BruteMeterRule(6, AZ_HIGH + AZ_VOWEL + AZ_HIGH + "{3}" + AZ_VOWEL, BruteMeterStandard.MEDIUM, 52),
            new BruteMeterRule(5, NUM09 + AZ_HIGH + "{4}", BruteMeterStandard.MEDIUM, 53),
            new BruteMeterRule(5, AZ_VOWEL + AZ_HIGH + AZ_VOWEL + "{3}", BruteMeterStandard.MEDIUM, 54),
            new BruteMeterRule(5, AZ_HIGH + AZ_VOWEL + AZ_HIGH + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.MEDIUM, 55),
            new BruteMeterRule(5, AZ_HIGH + "{3}" + AZ_VOWEL + "{2}", BruteMeterStandard.MEDIUM, 56),
            new BruteMeterRule(5, AZ_HIGH + AZ_LOW + NUM09 + "{3}", BruteMeterStandard.MEDIUM, 57),
            new BruteMeterRule(5, AZ_VOWEL + "{3}" + AZ_LOW + NUM09, BruteMeterStandard.MEDIUM, 58),
            new BruteMeterRule(5, NUM09 + "{2}" + AZ_VOWEL + "{3}", BruteMeterStandard.MEDIUM, 59),
            new BruteMeterRule(5, AZ_LOW + AZ_VOWEL + "{3}" + AZ_HIGH, BruteMeterStandard.MEDIUM, 60),
            //HIGH======================================================================================================================
            new BruteMeterRule(7, NUM09, BruteMeterStandard.HIGH, 71),
            new BruteMeterRule(7, AZ_VOWEL, BruteMeterStandard.HIGH, 72),
            new BruteMeterRule(7, AZ_HIGH, BruteMeterStandard.HIGH, 73),
            new BruteMeterRule(7, AZ_LOW, BruteMeterStandard.HIGH, 74),
            new BruteMeterRule(7, NUM09 + "{4}" + SP + "{3}", BruteMeterStandard.HIGH, 75),
            new BruteMeterRule(7, AZ_HIGH + AZ_VOWEL + "{3}" + SP + "{3}", BruteMeterStandard.HIGH, 76),
            new BruteMeterRule(7, NUM09 + "{2}" + SP + "{5}", BruteMeterStandard.HIGH, 77),
            new BruteMeterRule(7, NUM09 + "{5}" + SP + "{2}", BruteMeterStandard.HIGH, 78),
            new BruteMeterRule(7, AZ_HIGH + AZ_VOWEL + AZ_HIGH + SP + "{4}", BruteMeterStandard.HIGH, 79),
            new BruteMeterRule(7, AZ_LOW + AZ_VOWEL + SP + "{5}", BruteMeterStandard.HIGH, 80),
            new BruteMeterRule(7, NUM09 + "{6}" + SP + "{1}", BruteMeterStandard.HIGH, 81),
            new BruteMeterRule(7, AZ_HIGH + AZ_VOWEL + AZ_HIGH + AZ_VOWEL + SP + "{3}", BruteMeterStandard.HIGH, 82),
            new BruteMeterRule(7, AZ_HIGH + "{2}" + SP + "{5}", BruteMeterStandard.HIGH, 83),
            new BruteMeterRule(7, AZ_VOWEL + AZ_HIGH + AZ_VOWEL + SP + "{4}", BruteMeterStandard.HIGH, 84),
            new BruteMeterRule(7, AZ_HIGH + AZ_VOWEL + AZ_HIGH + SP + "{2}" + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.HIGH, 85),
            new BruteMeterRule(7, AZ_HIGH + AZ_VOWEL + "{2}" + SP + "{4}", BruteMeterStandard.HIGH, 86),
            new BruteMeterRule(7, AZ_HIGH + AZ_LOW + SP + "{5}", BruteMeterStandard.HIGH, 87),
            new BruteMeterRule(7, AZ_VOWEL + AZ_LOW + SP + "{5}", BruteMeterStandard.HIGH, 88),
            new BruteMeterRule(7, SP + "{2}" + NUM09 + "{2}" + SP + "{2}" + AZ_VOWEL, BruteMeterStandard.HIGH, 89),
            new BruteMeterRule(7, AZ_LOW + SP + "{2}" + AZ_VOWEL + AZ_HIGH + SP + "{2}", BruteMeterStandard.HIGH, 90),
            //SUPER HIGH==================================================================================================================
            new BruteMeterRule(0, "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z._!-\\*@#/$,+&\\)=?(';]%<~[:^`\">{}|]{8,16}$", BruteMeterStandard.SUPER_HIGH, 91)
    );

    String NA_3 = "(Abe|Aly|Ann|Ben|Bob|Dan|Eva|Eve|Fox|Gus|Guy|Hal|Jim|Job|Joe|Kit|Law|Lee|Lew|Max|May|Meg|Peg|Poe|Rob|Roy|Sam|Ted|Tom|Van|Wat)";
    String NA_4 = "(Adam|Anna|Anne|Bach|Bart|Beck|Bell|Bert|Bess|Bill|Bray|Buck|Camp|Carl|Davy|Den|Dick|Dodd|Dora|Dutt|Eden|Edie|Ella|Emma|Evan|Fast|Finn|Ford|Fred|Funk|Gill|Gold|Gray|Grey|Hart|Hill|Holt|Hood|Hope|Hugh|Hume|Hutt|Ivan|Jack|Jane|Jean|Joan|Joel|John|Josh|Judd|Lamb|Lena|Lily|Lou|Lucy|Luke|Lyly|Lynd|Mark|Mary|Maud|Mike|Mill|Moll|Mond|More|Nell|Nick|Noah|Noel|Nora|Owen|Paul|Penn|Pope|Reed|Rhys|Rosa|Rose|Rusk|Ruth|Saul|Shaw|Snow|Tate|Toby|Tony|Tout|Vogt|Ward|Watt|Webb|Whit|Wild|Will|Wolf|Wood|Yale|Yule)";
    String NA_5 = "(Adams|Adela|Agnes|Aled|Alice|Alick|Bacon|Bauer|Beard|Becky|Belle|Betsy|Betty|Billy|Black|Blake|Bloor|Blume|Bobby|Bowen|Boyle|Broad|Brown|Bruce|Bruno|Bryan|Bryce|Burke|Burns|Byron|Carey|Child|Clara|Clare|Conan|Cook|Crane|Croft|Curme|Daisy|David|Defoe|Delia|Dewar|Dewey|Dolly|Donne|Doris|Doyle|Eddie|Edith|Effie|Eliot|Ellen|Ellis|Elsie|Emily|Eugen|Evans|Fanny|Felix|Field|Flynn|Frank|Gard|Giles|Gosse|Grace|Grant|Green|Grote|Hardy|Harry|Harte|Haydn|Henry|Herty|Hicks|Hodge|Hosea|House|Hoyle|Isaac|Jacob|James|Jenny|Jerry|Jimmy|Jonah|Jones|Joule|Joyce|Julia|Katte|Keats|Kell|Kitto|Kitty|Leigh|Lewis|Lloyd|Locke|Louis|Lucas|Lucia|Lynch|Madge|Malan|Maltz|Maria|Micah|Milne|Moore|Morse|Moses|Nahum|Nancy|Nelly|Nico|Nixon|North|Noyes|Occam|Oscar|Pansy|Pater|Peggy|Pepys|Peter|Petty|Piers|Pigou|Polly|Pound|Price|Pritt|Ralph|Raman|Reade|Robin|Roger|Romeo|Sally|Sandy|Sapir|Sara|Scott|Sharp|Silas|Simon|Smith|Sophy|Stone|Stowe|Susan|Sweet|Swift|Terry|Titus|Tommy|Tours|Tracy|Twain|Tyler|Walsh|Wells|Whyet|Wilde|Woolf|Wyat|Wyld|Young)";
    String NA_6 = "(Abbot|Adolph|Albert|Alcott|Alfred|Alsop|Amelia|Andrew|Arnold|Arthur|Attlee|Austen|Austin|Barney|Barrie|Barton|Becher|Belloc|Benson|Bernal|Bertha|Bertie|Bessie|Bowman|Bright|Bronte|Brooke|Browne|Buckle|Bulwer|Bunyan|Butler|Carmen|Carrie|Carter|Childe|Christ|Church|Cissie|Clark|Cocker|Coffey|Connie|Connor|Conrad|Cooper|Cotton|Cowper|Crofts|Cronin|Dalton|Daniel|Darwin|Dickey|Dillon|Dobbin|Dryden|DuBois|Dulles|Dunbar|Duncan|Dunlop|Dupont|Edison|Edmund|Edward|Elinor|Emmie|Ernest|Esther|Eugene|Felton|Flower|Foster|Fowler|Gallup|Garcia|Garden|George|Gibbon|Gibson|Godwin|Gracie|Graham|Gunter|Haggai|Hamlet|Hansen|Hansom|Harold|Harper|Harrod|Harvey|Hearst|Helin|Henley|Hobbes|Hobson|Holmes|Hoover|Horace|Hornby|Howard|Hudson|Hughes|Huxley|Irving|Isabel|Isaiah|Jasper|Jeames|Jeremy|Jerome|Jessie|Johnny|Jonson|Jordan|Joseph|Joshua|Judith|Judson|Julian|Juliet|Julius|Kelsen|Kelvin|Kennan|Keppel|Keynes|Landon|Larkin|Laurie|Lawson|Lizzie|London|Louisa|Louise|Lowell|Lucius|Lytton|Maggie|Malory|Marcus|Marion|Marner|Martha|Martin|Milton|Minnie|Monroe|Morgan|Morley|Morris|Morton|Motley|Murray|Nelson|Newman|Newton|Norris|Norton|Oliver|O’Neil|Onions|Palmer|Parker|Perkin|Philip|Pitman|Powell|Pullan|Raglan|Rhodes|Robert|Roland|Ruskin|Salome|Samson|Samuel|Sander|Sawyer|Saxton|Senior|Sidney|Sophia|Steele|Stella|Strong|Stuart|Surrey|Symons|Taylor|Temple|Thomas|Tobias|Toland|Truman|Turner|Tuttle|Veblen|Victor|Violet|Wagner|Walker|Wallis|Walter|Walton|Warner|Warren|Waters|Wesley|Wilcox|Wilson|Wright|Yeates|Yerkes)";
    String NA_7 = "(Abraham|Acheson|Addison|Anthony|Antonia|Babbitt|Baldwin|Barnard|Barrett|Bellamy|Bennett|Bentham|Bernard|Bertram|Bethune|Birrell|Bloomer|Boswell|Bradley|Bridges|Camilla|Carroll|Chaplin|Chapman|Charles|Charley|Charles|Chaucer|Christy|Clapham|Clemens|Clement|Collins|Commons|Craigie|Daniell|Dickens|Doherty|Dorothy|Dierser|Eleanor|Electra|Emerson|Evelina|Ezekiel|Faraday|Forster|Frances|Francis|Freeman|Gabriel|Gaskell|Geordie|Gilbert|Gissing|Gregory|Gresham|Gunther|Halifax|Haywood|Hazlitt|Herbert|Hewlett|Hodgson|Hopkin|Horatio|Housman|Houston|Howell|Hubbard|Huggins|Humphr|Jackson|Jenkin|Johnson|Juliana|Katrine|Kellogg|Kennedy|Kipling|Lambert|Leacock|Leonard|Leopold|Lincoln|Lindsay|Longman|MacAdam|Malachi|Malthus|Margery|Marjory|Marlowe|Matthew|Maugham|Maurice|Maxwell|Michael|Moulton|Needham|Nichol|Obadiah|O’Casey|Orlando|Patrick|Peacock|Pearson|Pollitt|Pullman|Quiller|Raleign|Ramsden|Raphael|Raymond|Rebecca|Ricardo|Richard|Robbins|Robeson|Russell|Saroyan|Sassoon|Scripps|Service|Shelley|Simpson|Smedley|Southey|Spencer|Spender|Spenser|Stephen|Susanna|Thodore|Theresa|Thomson|Thoreau|Timothy|Toynbee|Ulysses|Vaughan|Vincent|Walkley|Wallace|Walpole|Webster|Wheeler|Whitman|Willard|William|Wilmot|Windsor|Woolley|Wyclif)";
    String NA_8 = "(Adelaide|Aldridge|Anderson|Arabella|Augustus|Bartlett|Beaufort|Beerbohm|Benedict|Benjamin|Berkeley|Bessemer|Brewster|Browning|Carllyle|Carnegie|Caroline|Cecillia|Christie|Clarissa|Congreve|Crichton|Cromwell|Dorothea|Douglas|Eipstein|Euphemia|Eveline|Faulkner|Ferguson|Fielding|Franklin|Geoffrey|Grantham|Habakkuk|Hamilton|Harriman|Harrison|Jennings|Jeremiah|Jonathan|Kathleen|Kingsley|Lancelot|Lawrence|Leighton|Macaulay|Margaret|Marshall|Mathilda|McCarthy|McDonald|Melville|Meredith|Morrison|Nehemiah|Nicholas|O’Connor|Patience|Philemon|Pulitzer|Rayleign|Reynolds|Richards|Robinson|Rosalind|Rossetti|Rudolph|Sheridan|Sherwood|Sinclair|Smollett|Stephens|Stilwell|Strachey|Tennyson|Thompson|Trollpoe|Virginia|Wheatley|Whittier|Winifred|Wodehous|Zangwill)";
    String NA_9 = "(Ackerman|Aldington|Alexander|Archibald|Armstrong|Augustine|Carpenter|Charlotte|Christian|Churchill|Colclough|Coleridge|Constance|Coverdale|DeQuincey|Edgeworth|Elizabeth|Ferdinand|Frederick|Galbraith|Gallacher|Gladstone|Goldsmith|Hawthorne|Hemingway|Henrietta|Ingersoll|Jefferson|Johnston|Katharine|Lattimore|Lindberg|MacArthur|Mansfield|Marcellus|Masefield|Michelson|Middleton|Nathaniei|Partridge|Priestley|Roosevelt|Sainsbury|Sailsbury|Steinbeck|Stevenson|Swinburne|Thackeray|Thorndike|Tomlinson|Trevelyan|Valentine|Whitehead|Wollaston|Zacharias|Zechariah|Zephaniah|Zimmerman)";
    String NA_10 = "(Antoinette|Bloomfield|Catharine|Chesterton|Christiana|Cumberland|Eisenhower|FitzGerald|Galsworthy|Harrington|Huntington|Longfellow|MacDonald|Mackintosh|MacMillan|Montgomery|Richardson|Rutherford|Springhall|Washington|Wilhelmina|Wordsworth)";
    String NA_11 = "(Bartholomew|Burne-Jones|Chamberlain|Christopher|Copperfield|MacPherson|Rockefeller|Shakespeare|Sonmerfield)";

    String HeatWord_4 = "(.com|.com|0000|0123|1111|1212|1234|1234|1313|1314|1969|1973|1975|1976|1977|1978|1979|1980|1981|1982|1982|1983|1983|1984|1984|1985|1985|1986|1986|1987|1987|1988|1988|1989|1989|1990|1990|1991|1991|1992|1993|1994|1995|1996|1997|1998|2000|2000|2001|2002|2003|2004|2005|2005|2006|2006|2007|2007|2008|2008|2009|2009|2010|2010|2012|2345|3000|3344|4321|4eva|4lyf|6969|8888|Abcd|Alex|Amor|Asdf|Babe|Baby|Baby|Blue|CSDN|Chao|Chen|Cool|Cute|Dong|Ever|Fang|Feng|Fuck|Girl|Gurl|Haha|Hong|Java|Jian|Jing|John|Juan|King|King|LOVE|Life|Ling|Long|Love|Love|Ming|Peng|Ping|Pink|Pogi|Qing|Quan|Rock|Rong|Rose|Ryan|Sexy|Song|Star|Tian|Ting|Xiao|Xing|Yang|Ying|Yong|Yuan|Zhao|Zhou|_123|bear|bebe|best|csdn|e123|fuck|head|jack|jade|jane|jose|lady|luis|mama|paul|rule|s123|wang)";
    String HeatWord_5 = "(12345|4ever|4life|Admin|Apple|Smile|TEAMO|Zhang|angel|bitch|james|jesus|lover|rocks|rules|teamo)";
    String HeatWord_6 = "(100200|112358|123123|123321|159357|159753|456852|666888|753951|789456|951753|abc123|beyond|dragon|hacker|shmily|woaini)";
    String HeatWord_7 = "(1314520|5201314|5211314|7758258|7758521|@qq.com|forever|windows)";
    String HeatWord_8 = "(31415926|88888888|@aol.com|dearbook|iloveyou|password)";
    String HeatWord_9 = "(123456789|987654321)";

    List<HeatStructureRule> HEAT_STRUCT_RULE = Arrays.asList(
            //SUPER LOW =================================================================================================================
            new HeatStructureRule(8, NUM09 + "{1,8}", Math.pow(10, 6), 1),
            new HeatStructureRule(8, AZ_LOWER + "{1,8}", Math.pow(10, 6), 1),
            new HeatStructureRule(8, AZ_VOWEL + "{1,8}", Math.pow(10, 6), 1),
            new HeatStructureRule(8, AZ_HIGH + "{1,8}", Math.pow(10, 6), 1),
            new HeatStructureRule(8, SP + "{1,8}", Math.pow(10, 6), 1),
            new HeatStructureRule(0, CHINESE_WORD + "+", 10d, 1),
            new HeatStructureRule(0, EMAIL, 10d, 1),
            new HeatStructureRule(0, MAC, 10d, 1),
            new HeatStructureRule(0, ID_CARD, 10d, 1),
            new HeatStructureRule(0, IP, 10d, 1),
            new HeatStructureRule(0, DATE, 10d, 1),
            new HeatStructureRule(0, TIMER_24, 10d, 1),
            new HeatStructureRule(0, TIMER_12, 10d, 1),
            new HeatStructureRule(3, NA_3, Math.pow(10, 7), 2),
            new HeatStructureRule(4, NA_4, Math.pow(10, 7), 2),
            new HeatStructureRule(5, NA_5, Math.pow(10, 7), 2),
            new HeatStructureRule(5, NA_7, Math.pow(10, 7), 2),
            new HeatStructureRule(5, NA_8, Math.pow(10, 7), 2),
            new HeatStructureRule(5, NA_9, Math.pow(10, 7), 2),
            new HeatStructureRule(5, NA_10, Math.pow(10, 7), 2),
            new HeatStructureRule(5, NA_11, Math.pow(10, 7), 2),
            new HeatStructureRule(5, HeatWord_4, Math.pow(10, 7), 2),
            new HeatStructureRule(5, HeatWord_5, Math.pow(10, 7), 2),
            new HeatStructureRule(5, HeatWord_6, Math.pow(10, 7), 2),
            new HeatStructureRule(5, HeatWord_7, Math.pow(10, 7), 2),
            new HeatStructureRule(5, HeatWord_8, Math.pow(10, 7), 2),
            new HeatStructureRule(5, HeatWord_9, Math.pow(10, 7), 2),
            new HeatStructureRule(5, HeatWord_7, Math.pow(10, 7), 2),
            new HeatStructureRule(7, AZ_LOWER + "{5}" + NUM09 + "{2} ", 2.984 * Math.pow(10, 5), 3),
            new HeatStructureRule(6, AZ_LOWER + "{2}" + NUM09 + "{4}", 6.67 * Math.pow(10, 6), 4),
            new HeatStructureRule(6, AZ_LOWER + "{4}" + NUM09 + "{2} ", 5.62 * Math.pow(10, 5), 5),
            new HeatStructureRule(8, NA_6 + "[09_1]{2}", 3.22 * Math.pow(10, 5), 6),
            new HeatStructureRule(6, AZ_LOWER + "{6}", 3.09 * Math.pow(10, 8), 7),
            new HeatStructureRule(6, AZ_LOWER + "{4}" + NUM09 + "{2} ", 4.57 * Math.pow(10, 7), 8),
            new HeatStructureRule(7, AZ_LOWER + "{3}" + NUM09 + "{4}", 1.76 * Math.pow(10, 8), 9),
            new HeatStructureRule(8, HeatWord_6 + NUM09 + "{2}", 1.25 * Math.pow(10, 5), 10),
            new HeatStructureRule(10, "[Time1-1_5]" + NUM09 + "{5}", 5.21 * Math.pow(10, 8), 11),
            new HeatStructureRule(4, AZ_HIGH + AZ_VOWEL + AZ_HIGH + AZ_VOWEL, 1.11 * Math.pow(10, 6), 12),
            new HeatStructureRule(2, AZ_HIGH + "{2}", 1.11 * Math.pow(10, 6), 13),
            new HeatStructureRule(3, AZ_VOWEL + AZ_HIGH + AZ_VOWEL, 1.11 * Math.pow(10, 6), 14),
            new HeatStructureRule(5, AZ_HIGH + AZ_VOWEL + AZ_HIGH + AZ_VOWEL + AZ_HIGH, 1.13 * Math.pow(10, 6), 15),
            new HeatStructureRule(3, AZ_HIGH + AZ_VOWEL + "{2}", 1.13 * Math.pow(10, 6), 16),
            new HeatStructureRule(2, AZ_HIGH + AZ_LOW, 1.13 * Math.pow(10, 6), 17),
            new HeatStructureRule(2, AZ_VOWEL + AZ_LOW, 1.13 * Math.pow(10, 6), 18),
            new HeatStructureRule(3, NUM09 + "{2}", 1.13 * Math.pow(10, 6), 19),
            new HeatStructureRule(3, AZ_LOW + AZ_VOWEL + AZ_HIGH, 1.13 * Math.pow(10, 6), 20),
            //LOW =====================================================================================================================
            new HeatStructureRule(3, "([\\d])\\1{3}", HeatStructureStandard.LOW, 21),
            new HeatStructureRule(7, NA_5 + NUM09 + "{2}", 2.593 * Math.pow(10, 5), 22),
            new HeatStructureRule(8, HeatWord_4 + NUM09 + "{4}", 5.62 * Math.pow(10, 18), 23),
            new HeatStructureRule(5, AZ_LOW + "{5}", HeatStructureStandard.LOW, 24),
            new HeatStructureRule(6, AZ_LOW + "{3}" + NUM09 + "{3}", HeatStructureStandard.LOW, 25),
            new HeatStructureRule(2, AZ_HIGH + AZ_VOWEL, HeatStructureStandard.LOW, 26),
            new HeatStructureRule(8, HeatWord_5 + NUM09 + "{3}", 5.213 * Math.pow(10, 7), 27),
            new HeatStructureRule(5, NUM09 + "{5}", HeatStructureStandard.LOW, 28),
            new HeatStructureRule(3, AZ_HIGH + AZ_VOWEL + AZ_HIGH, HeatStructureStandard.LOW, 29),
            new HeatStructureRule(2, AZ_LOW + AZ_VOWEL, HeatStructureStandard.LOW, 30),
            new HeatStructureRule(6, NUM09 + "{6}", HeatStructureStandard.LOW, 31),
            new HeatStructureRule(4, AZ_HIGH + AZ_VOWEL + AZ_HIGH + AZ_VOWEL, HeatStructureStandard.LOW, 32),
            new HeatStructureRule(2, AZ_HIGH + "{2}", HeatStructureStandard.LOW, 33),
            new HeatStructureRule(3, AZ_VOWEL + AZ_HIGH + AZ_VOWEL, HeatStructureStandard.LOW, 34),
            new HeatStructureRule(5, NA_4 + NUM09 + "{2}", HeatStructureStandard.LOW, 35),
            new HeatStructureRule(3, AZ_HIGH + AZ_VOWEL + "{2}", 3.65 * Math.pow(10, 5), 36),
            new HeatStructureRule(2, AZ_HIGH + AZ_LOW, HeatStructureStandard.LOW, 37),
            new HeatStructureRule(2, HeatWord_8 + AZ_LOW, HeatStructureStandard.LOW, 38),
            new HeatStructureRule(7, HeatWord_7, HeatStructureStandard.LOW, 39),
            new HeatStructureRule(3, AZ_LOW + AZ_VOWEL + AZ_HIGH, HeatStructureStandard.LOW, 40),
            //MEDIUM===================================================================================================================
            new HeatStructureRule(5, NUM09, HeatStructureStandard.MEDIUM, 41),
            new HeatStructureRule(5, AZ_VOWEL, HeatStructureStandard.MEDIUM, 42),
            new HeatStructureRule(5, AZ_HIGH, HeatStructureStandard.MEDIUM, 43),
            new HeatStructureRule(5, AZ_LOW, HeatStructureStandard.MEDIUM, 44),
            new HeatStructureRule(5, NUM09 + "{5}", HeatStructureStandard.MEDIUM, 45),
            new HeatStructureRule(5, AZ_HIGH + "{4}" + AZ_VOWEL, HeatStructureStandard.MEDIUM, 46),
            new HeatStructureRule(5, NUM09 + AZ_VOWEL + "{4}", HeatStructureStandard.MEDIUM, 47),
            new HeatStructureRule(5, NUM09 + AZ_LOW + "{4}", HeatStructureStandard.MEDIUM, 48),
            new HeatStructureRule(5, AZ_HIGH + "{3}" + AZ_VOWEL + AZ_HIGH, HeatStructureStandard.MEDIUM, 49),
            new HeatStructureRule(5, AZ_LOW + AZ_VOWEL + "{4}", HeatStructureStandard.MEDIUM, 50),
            new HeatStructureRule(6, NUM09 + "{6}", HeatStructureStandard.MEDIUM, 51),
            new HeatStructureRule(6, AZ_HIGH + AZ_VOWEL + AZ_HIGH + "{3}" + AZ_VOWEL, HeatStructureStandard.MEDIUM, 52),
            new HeatStructureRule(5, NUM09 + AZ_HIGH + "{4}", HeatStructureStandard.MEDIUM, 53),
            new HeatStructureRule(5, AZ_VOWEL + AZ_HIGH + AZ_VOWEL + "{3}", HeatStructureStandard.MEDIUM, 54),
            new HeatStructureRule(5, AZ_HIGH + AZ_VOWEL + AZ_HIGH + AZ_VOWEL + AZ_HIGH, HeatStructureStandard.MEDIUM, 55),
            new HeatStructureRule(5, AZ_HIGH + "{3}" + AZ_VOWEL + "{2}", HeatStructureStandard.MEDIUM, 56),
            new HeatStructureRule(5, AZ_HIGH + AZ_LOW + NUM09 + "{3}", HeatStructureStandard.MEDIUM, 57),
            new HeatStructureRule(5, AZ_VOWEL + "{3}" + AZ_LOW + NUM09, HeatStructureStandard.MEDIUM, 58),
            new HeatStructureRule(5, NUM09 + "{2}" + AZ_VOWEL + "{3}", HeatStructureStandard.MEDIUM, 59),
            new HeatStructureRule(5, AZ_LOW + AZ_VOWEL + "{3}" + AZ_HIGH, HeatStructureStandard.MEDIUM, 60),
            //HIGH======================================================================================================================
            new HeatStructureRule(7, NUM09, HeatStructureStandard.HIGH, 71),
            new HeatStructureRule(7, AZ_VOWEL, HeatStructureStandard.HIGH, 72),
            new HeatStructureRule(7, AZ_HIGH, HeatStructureStandard.HIGH, 73),
            new HeatStructureRule(7, AZ_LOW, HeatStructureStandard.HIGH, 74),
            new HeatStructureRule(7, NUM09 + "{4}" + SP + "{3}", HeatStructureStandard.HIGH, 75),
            new HeatStructureRule(7, AZ_HIGH + AZ_VOWEL + "{3}" + SP + "{3}", HeatStructureStandard.HIGH, 76),
            new HeatStructureRule(7, NUM09 + "{2}" + SP + "{5}", HeatStructureStandard.HIGH, 77),
            new HeatStructureRule(7, NUM09 + "{5}" + SP + "{2}", HeatStructureStandard.HIGH, 78),
            new HeatStructureRule(7, AZ_HIGH + AZ_VOWEL + AZ_HIGH + SP + "{4}", HeatStructureStandard.HIGH, 79),
            new HeatStructureRule(7, AZ_LOW + AZ_VOWEL + SP + "{5}", HeatStructureStandard.HIGH, 80),
            new HeatStructureRule(7, NUM09 + "{6}" + SP + "{1}", HeatStructureStandard.HIGH, 81),
            new HeatStructureRule(7, AZ_HIGH + AZ_VOWEL + AZ_HIGH + AZ_VOWEL + SP + "{3}", HeatStructureStandard.HIGH, 82),
            new HeatStructureRule(7, AZ_HIGH + "{2}" + SP + "{5}", HeatStructureStandard.HIGH, 83),
            new HeatStructureRule(7, AZ_VOWEL + AZ_HIGH + AZ_VOWEL + SP + "{4}", HeatStructureStandard.HIGH, 84),
            new HeatStructureRule(7, AZ_HIGH + AZ_VOWEL + AZ_HIGH + SP + "{2}" + AZ_VOWEL + AZ_HIGH, HeatStructureStandard.HIGH, 85),
            new HeatStructureRule(7, AZ_HIGH + AZ_VOWEL + "{2}" + SP + "{4}", HeatStructureStandard.HIGH, 86),
            new HeatStructureRule(7, AZ_HIGH + AZ_LOW + SP + "{5}", HeatStructureStandard.HIGH, 87),
            new HeatStructureRule(7, AZ_VOWEL + AZ_LOW + SP + "{5}", HeatStructureStandard.HIGH, 88),
            new HeatStructureRule(7, SP + "{2}" + NUM09 + "{2}" + SP + "{2}" + AZ_VOWEL, HeatStructureStandard.HIGH, 89),
            new HeatStructureRule(7, AZ_LOW + SP + "{2}" + AZ_VOWEL + AZ_HIGH + SP + "{2}", HeatStructureStandard.HIGH, 90),
            //SUPER HIGH==================================================================================================================
            new HeatStructureRule(0, "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z._!\\-\\*@#/$,+&\\)=?(';]%<~[:^`\">{}|]{8,16}$", HeatStructureStandard.SUPER_HIGH, 91)
    );
}
