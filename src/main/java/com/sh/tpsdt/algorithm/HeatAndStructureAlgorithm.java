package com.sh.tpsdt.algorithm;

import com.sh.tpsdt.constants.CommandConstants;
import com.sh.tpsdt.constants.PasswordLevel;

public class HeatAndStructureAlgorithm implements CommandAlgorithm, EstimateAlgorithm {

    @Override
    public String validateCommand(String command) {
        return CommandConstants.COMMAND_HEAT_STRUCTURE_TITLE;
    }

    @Override
    public PasswordLevel estimatePasswordLevel(String command) {
        return PasswordLevel.LOW;
    }
}
