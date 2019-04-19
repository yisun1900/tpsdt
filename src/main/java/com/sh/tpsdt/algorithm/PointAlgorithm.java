package com.sh.tpsdt.algorithm;

import com.sh.tpsdt.constants.CommandConstants;
import com.sh.tpsdt.constants.PasswordLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * @program: tpsdt
 * @description:
 * @author:
 * @create: 2019-03-14 14:47
 **/
@Getter
@Setter
public class PointAlgorithm implements CommandAlgorithm, EstimateAlgorithm {

    private BruteMeterAlgorithm bruteMeterAlgorithm;

    private HeatAndStructureAlgorithm heatAndStructureAlgorithm;

    public PointAlgorithm() {
    }

    public PointAlgorithm(BruteMeterAlgorithm bruteMeterAlgorithm,
                              HeatAndStructureAlgorithm heatAndStructureAlgorithm) {
        this.bruteMeterAlgorithm = bruteMeterAlgorithm;
        this.heatAndStructureAlgorithm = heatAndStructureAlgorithm;
    }

    @Override
    public String validateCommand(String command) {
        return CommandConstants.COMMAND_POINT_TITLE + this.estimatePasswordLevel(command).name() ;

    }

    @Override
    public PasswordLevel estimatePasswordLevel(String command) {
        PasswordLevel bruteMeterLevel = bruteMeterAlgorithm.estimatePasswordLevel(command);
        PasswordLevel heatAndStructureLevel = heatAndStructureAlgorithm.estimatePasswordLevel(command);
        PasswordLevel estimatePasswordLevel;
        if ((bruteMeterLevel.equals(PasswordLevel.LOW) || bruteMeterLevel.equals(PasswordLevel.SUPER_LOW)) &&
                (heatAndStructureLevel.equals(PasswordLevel.LOW) ||
                        heatAndStructureLevel.equals(PasswordLevel.SUPER_LOW))) {
            estimatePasswordLevel = PasswordLevel.LOW;
        } else if (bruteMeterLevel.equals(PasswordLevel.MEDIUM) &&
                heatAndStructureLevel.equals(PasswordLevel.MEDIUM)) {
            estimatePasswordLevel = PasswordLevel.MEDIUM;
        } else {
            estimatePasswordLevel = PasswordLevel.HIGH;
        }
        return estimatePasswordLevel;
    }
}
