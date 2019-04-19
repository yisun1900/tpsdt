package com.sh.tpsdt.algorithm;

import com.sh.tpsdt.constants.CommandConstants;
import com.sh.tpsdt.constants.PasswordLevel;

/**
 * @program: tpsdt
 * @description:
 * @author:
 * @create: 2019-03-14 14:47
 **/
public class PointAlgorithm implements CommandAlgorithm, EstimateAlgorithm {

    RecommendAlgorithm recommendAlgorithm = new RecommendAlgorithm();

    @Override
    public String validateCommand(String command) {
        PasswordLevel level = this.estimatePasswordLevel(command);
        Boolean whetherRecommend = level.equals(PasswordLevel.LOW);
        return CommandConstants.COMMAND_POINT_TITLE + level.name() +
                (whetherRecommend ?
                        " ," + CommandConstants.COMMAND_RECOMMEND + recommendAlgorithm.recommendPassword() : "");

    }

    @Override
    public PasswordLevel estimatePasswordLevel(String command) {
        return PasswordLevel.LOW;
    }
}
