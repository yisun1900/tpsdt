package com.sh.tpsdt.algorithm;

import com.sh.tpsdt.constants.CommandConstants;
import com.sh.tpsdt.constants.PasswordLevel;

/**
 * @program: tpsdt
 * @description:
 * @author:
 * @create: 2019-03-14 14:47
 **/
public class PointAlgorithm implements CommandAlgorithm {

    RecommendAlogrithm recommendAlogrithm = new RecommendAlogrithm();

    @Override
    public String validateCommand(String command) {
        PasswordLevel level = PasswordLevel.LOW;
        return CommandConstants.COMMAND_POINT_TITLE + "&&" +
                (level.equals(PasswordLevel.LOW) ? recommendAlogrithm.recommendPassword() : "");
    }
}
