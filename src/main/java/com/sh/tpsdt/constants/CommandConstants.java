package com.sh.tpsdt.constants;

import com.sh.tpsdt.model.brute_meter.BruteMeterRule;
import com.sh.tpsdt.model.brute_meter.BruteMeterStandard;
import com.sh.tpsdt.model.heat_structure.HeatStructureRule;

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

    List<BruteMeterRule> bruteMeterRule = Arrays.asList(
            //SUPER LOW =================================================================================================================
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
            new BruteMeterRule(5, AZ_HIGH + AZ_VOWEL + AZ_HIGH + AZ_VOWEL + AZ_HIGH,BruteMeterStandard.LOW, 35),
            new BruteMeterRule(3, AZ_HIGH + AZ_VOWEL + "{2}", BruteMeterStandard.LOW, 36),
            new BruteMeterRule(2, AZ_HIGH + AZ_LOW, BruteMeterStandard.LOW, 37),
            new BruteMeterRule(2, AZ_VOWEL + AZ_LOW, BruteMeterStandard.LOW, 38),
            new BruteMeterRule(3, NUM09 + "{2}", BruteMeterStandard.LOW, 39),
            new BruteMeterRule(3, AZ_LOW + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.LOW, 40),
            //MEDIUM===================================================================================================================
            new BruteMeterRule(1, NUM09, BruteMeterStandard.MEDIUM, 41),
            new BruteMeterRule(1, AZ_VOWEL, BruteMeterStandard.MEDIUM, 42),
            new BruteMeterRule(1, AZ_HIGH, BruteMeterStandard.MEDIUM, 43),
            new BruteMeterRule(1, AZ_LOW, BruteMeterStandard.MEDIUM, 44),
            new BruteMeterRule(4, NUM09 + "{4}", BruteMeterStandard.MEDIUM, 45),
            new BruteMeterRule(2, AZ_HIGH + AZ_VOWEL, BruteMeterStandard.MEDIUM, 46),
            new BruteMeterRule(2, NUM09 + "{2}", BruteMeterStandard.MEDIUM, 47),
            new BruteMeterRule(5, NUM09 + "{5}", BruteMeterStandard.MEDIUM, 48),
            new BruteMeterRule(3, AZ_HIGH + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.MEDIUM, 49),
            new BruteMeterRule(2, AZ_LOW + AZ_VOWEL, BruteMeterStandard.MEDIUM, 50),
            new BruteMeterRule(6, NUM09 + "{6}", BruteMeterStandard.MEDIUM, 51),
            new BruteMeterRule(4, AZ_HIGH + AZ_VOWEL + AZ_HIGH + AZ_VOWEL, BruteMeterStandard.MEDIUM, 52),
            new BruteMeterRule(2, AZ_HIGH + "{2}", BruteMeterStandard.MEDIUM, 53),
            new BruteMeterRule(3, AZ_VOWEL + AZ_HIGH + AZ_VOWEL, BruteMeterStandard.MEDIUM, 54),
            new BruteMeterRule(5, AZ_HIGH + AZ_VOWEL + AZ_HIGH + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.MEDIUM, 55),
            new BruteMeterRule(3, AZ_HIGH + AZ_VOWEL + "{2}", BruteMeterStandard.MEDIUM, 56),
            new BruteMeterRule(2, AZ_HIGH + AZ_LOW, BruteMeterStandard.MEDIUM, 57),
            new BruteMeterRule(2, AZ_VOWEL + AZ_LOW, BruteMeterStandard.MEDIUM, 58),
            new BruteMeterRule(3, NUM09 + "{2}", BruteMeterStandard.MEDIUM, 59),
            new BruteMeterRule(3, AZ_LOW + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.MEDIUM, 60),
            //HIGH======================================================================================================================
            new BruteMeterRule(1, NUM09, BruteMeterStandard.HIGH, 71),
            new BruteMeterRule(1, AZ_VOWEL, BruteMeterStandard.HIGH, 72),
            new BruteMeterRule(1, AZ_HIGH, BruteMeterStandard.HIGH, 73),
            new BruteMeterRule(1, AZ_LOW, BruteMeterStandard.HIGH, 74),
            new BruteMeterRule(4, NUM09 + "{4}", BruteMeterStandard.HIGH, 75),
            new BruteMeterRule(2, AZ_HIGH + AZ_VOWEL, BruteMeterStandard.HIGH, 76),
            new BruteMeterRule(2, NUM09 + "{2}", BruteMeterStandard.HIGH, 77),
            new BruteMeterRule(5, NUM09 + "{5}", BruteMeterStandard.HIGH, 78),
            new BruteMeterRule(3, AZ_HIGH + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.HIGH, 79),
            new BruteMeterRule(2, AZ_LOW + AZ_VOWEL, BruteMeterStandard.HIGH, 80),
            new BruteMeterRule(6, NUM09 + "{6}", BruteMeterStandard.HIGH, 81),
            new BruteMeterRule(4, AZ_HIGH + AZ_VOWEL + AZ_HIGH + AZ_VOWEL, BruteMeterStandard.HIGH, 82),
            new BruteMeterRule(2, AZ_HIGH + "{2}", BruteMeterStandard.HIGH, 83),
            new BruteMeterRule(3, AZ_VOWEL + AZ_HIGH + AZ_VOWEL, BruteMeterStandard.HIGH, 84),
            new BruteMeterRule(5, AZ_HIGH + AZ_VOWEL + AZ_HIGH + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.HIGH, 85),
            new BruteMeterRule(3, AZ_HIGH + AZ_VOWEL + "{2}", BruteMeterStandard.HIGH, 86),
            new BruteMeterRule(2, AZ_HIGH + AZ_LOW, BruteMeterStandard.HIGH, 87),
            new BruteMeterRule(2, AZ_VOWEL + AZ_LOW, BruteMeterStandard.HIGH, 88),
            new BruteMeterRule(3, NUM09 + "{2}", BruteMeterStandard.HIGH, 89),
            new BruteMeterRule(3, AZ_LOW + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.HIGH, 90),
            //SUPER HIGH==================================================================================================================
            new BruteMeterRule(1, NUM09, BruteMeterStandard.SUPER_HIGH, 91),
            new BruteMeterRule(1, AZ_VOWEL, BruteMeterStandard.SUPER_HIGH, 92),
            new BruteMeterRule(1, AZ_HIGH, BruteMeterStandard.SUPER_HIGH, 93),
            new BruteMeterRule(1, AZ_LOW, BruteMeterStandard.SUPER_HIGH, 94),
            new BruteMeterRule(4, NUM09 + "{4}", BruteMeterStandard.SUPER_HIGH, 95),
            new BruteMeterRule(2, AZ_HIGH + AZ_VOWEL, BruteMeterStandard.SUPER_HIGH, 96),
            new BruteMeterRule(2, NUM09 + "{2}", BruteMeterStandard.SUPER_HIGH, 97),
            new BruteMeterRule(5, NUM09 + "{5}", BruteMeterStandard.SUPER_HIGH, 98),
            new BruteMeterRule(3, AZ_HIGH + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.SUPER_HIGH, 99),
            new BruteMeterRule(2, AZ_LOW + AZ_VOWEL, BruteMeterStandard.SUPER_HIGH, 100),
            new BruteMeterRule(6, NUM09 + "{6}", BruteMeterStandard.SUPER_HIGH, 101),
            new BruteMeterRule(4, AZ_HIGH + AZ_VOWEL + AZ_HIGH + AZ_VOWEL, BruteMeterStandard.SUPER_HIGH, 102),
            new BruteMeterRule(2, AZ_HIGH + "{2}", BruteMeterStandard.SUPER_HIGH, 103),
            new BruteMeterRule(3, AZ_VOWEL + AZ_HIGH + AZ_VOWEL, BruteMeterStandard.SUPER_HIGH, 104),
            new BruteMeterRule(5, AZ_HIGH + AZ_VOWEL + AZ_HIGH + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.SUPER_HIGH, 105),
            new BruteMeterRule(3, AZ_HIGH + AZ_VOWEL + "{2}", BruteMeterStandard.SUPER_HIGH, 106),
            new BruteMeterRule(2, AZ_HIGH + AZ_LOW, BruteMeterStandard.SUPER_HIGH, 107),
            new BruteMeterRule(2, AZ_VOWEL + AZ_LOW, BruteMeterStandard.SUPER_HIGH, 108),
            new BruteMeterRule(3, NUM09 + "{2}", BruteMeterStandard.SUPER_HIGH, 109),
            new BruteMeterRule(3, AZ_LOW + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.SUPER_HIGH, 120)
    );


    List<HeatStructureRule> heatStructureRule = Arrays.asList(
            //SUPER LOW =================================================================================================================
            new HeatStructureRule(1, NUM09, 10d, 1),
            new HeatStructureRule(1, AZ_VOWEL, 15d, 2),
            new HeatStructureRule(1, AZ_HIGH, 24d, 3),
            new HeatStructureRule(1, AZ_LOW, 36d, 4),
            new HeatStructureRule(4, NUM09 + "{4}", 10036d, 5),
            new HeatStructureRule(2, AZ_HIGH + AZ_VOWEL, 10081d, 6),
            new HeatStructureRule(2, NUM09 + "{2}", 10181d, 7),
            new HeatStructureRule(5, NUM09 + "{5}", 110181d, 8),
            new HeatStructureRule(3, AZ_HIGH + AZ_VOWEL + AZ_HIGH, 110586d, 9),
            new HeatStructureRule(2, AZ_LOW + AZ_VOWEL, 110646d, 10),
            new HeatStructureRule(6, NUM09 + "{6}", 1.11 * Math.pow(10, 6), 11),
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
            new HeatStructureRule(3, "([\\d])\\1{3}", BruteMeterStandard.LOW, 21),
            new HeatStructureRule(5, AZ_VOWEL + "{5}", BruteMeterStandard.LOW, 22),
            new HeatStructureRule(5, AZ_HIGH + "{5}", BruteMeterStandard.LOW, 23),
            new HeatStructureRule(5, AZ_LOW + "{5}", BruteMeterStandard.LOW, 24),
            new HeatStructureRule(4, NUM09 + "{4}", BruteMeterStandard.LOW, 25),
            new HeatStructureRule(2, AZ_HIGH + AZ_VOWEL, BruteMeterStandard.LOW, 26),
            new HeatStructureRule(2, NUM09 + "{2}", BruteMeterStandard.LOW, 27),
            new HeatStructureRule(5, NUM09 + "{5}", BruteMeterStandard.LOW, 28),
            new HeatStructureRule(3, AZ_HIGH + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.LOW, 29),
            new HeatStructureRule(2, AZ_LOW + AZ_VOWEL, BruteMeterStandard.LOW, 30),
            new HeatStructureRule(6, NUM09 + "{6}", BruteMeterStandard.LOW, 31),
            new HeatStructureRule(4, AZ_HIGH + AZ_VOWEL + AZ_HIGH + AZ_VOWEL, BruteMeterStandard.LOW, 32),
            new HeatStructureRule(2, AZ_HIGH + "{2}", BruteMeterStandard.LOW, 33),
            new HeatStructureRule(3, AZ_VOWEL + AZ_HIGH + AZ_VOWEL, BruteMeterStandard.LOW, 34),
            new HeatStructureRule(5, AZ_HIGH + AZ_VOWEL + AZ_HIGH + AZ_VOWEL + AZ_HIGH,BruteMeterStandard.LOW, 35),
            new HeatStructureRule(3, AZ_HIGH + AZ_VOWEL + "{2}", BruteMeterStandard.LOW, 36),
            new HeatStructureRule(2, AZ_HIGH + AZ_LOW, BruteMeterStandard.LOW, 37),
            new HeatStructureRule(2, AZ_VOWEL + AZ_LOW, BruteMeterStandard.LOW, 38),
            new HeatStructureRule(3, NUM09 + "{2}", BruteMeterStandard.LOW, 39),
            new HeatStructureRule(3, AZ_LOW + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.LOW, 40),
            //MEDIUM===================================================================================================================
            new HeatStructureRule(1, NUM09, BruteMeterStandard.MEDIUM, 41),
            new HeatStructureRule(1, AZ_VOWEL, BruteMeterStandard.MEDIUM, 42),
            new HeatStructureRule(1, AZ_HIGH, BruteMeterStandard.MEDIUM, 43),
            new HeatStructureRule(1, AZ_LOW, BruteMeterStandard.MEDIUM, 44),
            new HeatStructureRule(4, NUM09 + "{4}", BruteMeterStandard.MEDIUM, 45),
            new HeatStructureRule(2, AZ_HIGH + AZ_VOWEL, BruteMeterStandard.MEDIUM, 46),
            new HeatStructureRule(2, NUM09 + "{2}", BruteMeterStandard.MEDIUM, 47),
            new HeatStructureRule(5, NUM09 + "{5}", BruteMeterStandard.MEDIUM, 48),
            new HeatStructureRule(3, AZ_HIGH + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.MEDIUM, 49),
            new HeatStructureRule(2, AZ_LOW + AZ_VOWEL, BruteMeterStandard.MEDIUM, 50),
            new HeatStructureRule(6, NUM09 + "{6}", BruteMeterStandard.MEDIUM, 51),
            new HeatStructureRule(4, AZ_HIGH + AZ_VOWEL + AZ_HIGH + AZ_VOWEL, BruteMeterStandard.MEDIUM, 52),
            new HeatStructureRule(2, AZ_HIGH + "{2}", BruteMeterStandard.MEDIUM, 53),
            new HeatStructureRule(3, AZ_VOWEL + AZ_HIGH + AZ_VOWEL, BruteMeterStandard.MEDIUM, 54),
            new HeatStructureRule(5, AZ_HIGH + AZ_VOWEL + AZ_HIGH + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.MEDIUM, 55),
            new HeatStructureRule(3, AZ_HIGH + AZ_VOWEL + "{2}", BruteMeterStandard.MEDIUM, 56),
            new HeatStructureRule(2, AZ_HIGH + AZ_LOW, BruteMeterStandard.MEDIUM, 57),
            new HeatStructureRule(2, AZ_VOWEL + AZ_LOW, BruteMeterStandard.MEDIUM, 58),
            new HeatStructureRule(3, NUM09 + "{2}", BruteMeterStandard.MEDIUM, 59),
            new HeatStructureRule(3, AZ_LOW + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.MEDIUM, 60),
            //HIGH======================================================================================================================
            new HeatStructureRule(1, NUM09, BruteMeterStandard.HIGH, 71),
            new HeatStructureRule(1, AZ_VOWEL, BruteMeterStandard.HIGH, 72),
            new HeatStructureRule(1, AZ_HIGH, BruteMeterStandard.HIGH, 73),
            new HeatStructureRule(1, AZ_LOW, BruteMeterStandard.HIGH, 74),
            new HeatStructureRule(4, NUM09 + "{4}", BruteMeterStandard.HIGH, 75),
            new HeatStructureRule(2, AZ_HIGH + AZ_VOWEL, BruteMeterStandard.HIGH, 76),
            new HeatStructureRule(2, NUM09 + "{2}", BruteMeterStandard.HIGH, 77),
            new HeatStructureRule(5, NUM09 + "{5}", BruteMeterStandard.HIGH, 78),
            new HeatStructureRule(3, AZ_HIGH + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.HIGH, 79),
            new HeatStructureRule(2, AZ_LOW + AZ_VOWEL, BruteMeterStandard.HIGH, 80),
            new HeatStructureRule(6, NUM09 + "{6}", BruteMeterStandard.HIGH, 81),
            new HeatStructureRule(4, AZ_HIGH + AZ_VOWEL + AZ_HIGH + AZ_VOWEL, BruteMeterStandard.HIGH, 82),
            new HeatStructureRule(2, AZ_HIGH + "{2}", BruteMeterStandard.HIGH, 83),
            new HeatStructureRule(3, AZ_VOWEL + AZ_HIGH + AZ_VOWEL, BruteMeterStandard.HIGH, 84),
            new HeatStructureRule(5, AZ_HIGH + AZ_VOWEL + AZ_HIGH + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.HIGH, 85),
            new HeatStructureRule(3, AZ_HIGH + AZ_VOWEL + "{2}", BruteMeterStandard.HIGH, 86),
            new HeatStructureRule(2, AZ_HIGH + AZ_LOW, BruteMeterStandard.HIGH, 87),
            new HeatStructureRule(2, AZ_VOWEL + AZ_LOW, BruteMeterStandard.HIGH, 88),
            new HeatStructureRule(3, NUM09 + "{2}", BruteMeterStandard.HIGH, 89),
            new HeatStructureRule(3, AZ_LOW + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.HIGH, 90),
            //SUPER HIGH==================================================================================================================
            new HeatStructureRule(1, NUM09, BruteMeterStandard.SUPER_HIGH, 91),
            new HeatStructureRule(1, AZ_VOWEL, BruteMeterStandard.SUPER_HIGH, 92),
            new HeatStructureRule(1, AZ_HIGH, BruteMeterStandard.SUPER_HIGH, 93),
            new HeatStructureRule(1, AZ_LOW, BruteMeterStandard.SUPER_HIGH, 94),
            new HeatStructureRule(4, NUM09 + "{4}", BruteMeterStandard.SUPER_HIGH, 95),
            new HeatStructureRule(2, AZ_HIGH + AZ_VOWEL, BruteMeterStandard.SUPER_HIGH, 96),
            new HeatStructureRule(2, NUM09 + "{2}", BruteMeterStandard.SUPER_HIGH, 97),
            new HeatStructureRule(5, NUM09 + "{5}", BruteMeterStandard.SUPER_HIGH, 98),
            new HeatStructureRule(3, AZ_HIGH + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.SUPER_HIGH, 99),
            new HeatStructureRule(2, AZ_LOW + AZ_VOWEL, BruteMeterStandard.SUPER_HIGH, 100),
            new HeatStructureRule(6, NUM09 + "{6}", BruteMeterStandard.SUPER_HIGH, 101),
            new HeatStructureRule(4, AZ_HIGH + AZ_VOWEL + AZ_HIGH + AZ_VOWEL, BruteMeterStandard.SUPER_HIGH, 102),
            new HeatStructureRule(2, AZ_HIGH + "{2}", BruteMeterStandard.SUPER_HIGH, 103),
            new HeatStructureRule(3, AZ_VOWEL + AZ_HIGH + AZ_VOWEL, BruteMeterStandard.SUPER_HIGH, 104),
            new HeatStructureRule(5, AZ_HIGH + AZ_VOWEL + AZ_HIGH + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.SUPER_HIGH, 105),
            new HeatStructureRule(3, AZ_HIGH + AZ_VOWEL + "{2}", BruteMeterStandard.SUPER_HIGH, 106),
            new HeatStructureRule(2, AZ_HIGH + AZ_LOW, BruteMeterStandard.SUPER_HIGH, 107),
            new HeatStructureRule(2, AZ_VOWEL + AZ_LOW, BruteMeterStandard.SUPER_HIGH, 108),
            new HeatStructureRule(3, NUM09 + "{2}", BruteMeterStandard.SUPER_HIGH, 109),
            new HeatStructureRule(3, AZ_LOW + AZ_VOWEL + AZ_HIGH, BruteMeterStandard.SUPER_HIGH, 120)
    );
}
