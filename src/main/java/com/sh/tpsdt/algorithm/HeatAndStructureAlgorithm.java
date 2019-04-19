package com.sh.tpsdt.algorithm;

import com.sh.tpsdt.constants.CommandConstants;
import com.sh.tpsdt.constants.PasswordLevel;
import com.sh.tpsdt.model.heat_structure.HeatStructureRule;

public class HeatAndStructureAlgorithm implements CommandAlgorithm, EstimateAlgorithm {

    @Override
    public String validateCommand(String command) {
        HeatStructureRule result = CommandConstants.heatStructureRule.stream().filter(heatStructureRule ->
                (heatStructureRule.getLength().equals(command.length()) || heatStructureRule.getLength() == 0)
                        && command.matches(heatStructureRule.getRulePattern())).findFirst().get();
        return CommandConstants.COMMAND_HEAT_STRUCTURE_TITLE + result.getPasswordLevel().name() + "," +
                CommandConstants.COMMAND_SYNTACTIC_CONTENT + result.getRulePattern();
    }

    @Override
    public PasswordLevel estimatePasswordLevel(String command) {
        return PasswordLevel.LOW;
    }
}
