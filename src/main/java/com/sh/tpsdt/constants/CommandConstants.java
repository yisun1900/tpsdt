package com.sh.tpsdt.constants;

import com.sh.tpsdt.model.brute_meter.BruteMeterRule;

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

    String COMMAND_POINT_TITLE = "==== 口令强弱：";

    String COMMAND_RECOMMEND = "==== 推荐口令：";

    String AZ_VOWEL = "[aoeiu]";

    String AZ_HIGH = "[nlrstmcdy]";

    String AZ_LOW = "[hbkgpvjfzwxq]";

    String AZ = "[A-Z]";

    String NUM09 = "[0-9]";

    String SP = "[._!-*@#/$,+&\\)=?(';]%<~[:^`\">{}|]";

    List<BruteMeterRule> bruteMeterRule = Arrays.asList(
            new BruteMeterRule(1, NUM09, 10d, 1),
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
            new BruteMeterRule(0, ".+", Math.pow(10, 15), 21)
    );
}
