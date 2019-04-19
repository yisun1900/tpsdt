package com.sh.tpsdt.algorithm;

import com.sh.tpsdt.constants.CommandConstants;
import com.sh.tpsdt.constants.PasswordLevel;
import com.sh.tpsdt.model.brute_meter.BruteMeterRule;

public class BruteMeterAlgorithm extends AbstractRuleAlgorithm implements CommandAlgorithm, EstimateAlgorithm {

    @Override
    public BruteMeterRule hitTheTarget(String command) {
        return CommandConstants.bruteMeterRule.stream().filter(bruteMeterRule ->
                (bruteMeterRule.getLength().equals(command.length()) || bruteMeterRule.getLength() == 0)
                        && command.matches(bruteMeterRule.getRulePattern())).findFirst().get();
    }

    @Override
    public String validateCommand(String command) {
        BruteMeterRule result = this.hitTheTarget(command);
        return CommandConstants.COMMAND_BRUTE_METER + result.getPasswordLevel().name() + "," +
                CommandConstants.COMMAND_SYNTACTIC_CONTENT + result.getRulePattern();
    }

    @Override
    public PasswordLevel estimatePasswordLevel(String command) {
        return PasswordLevel.LOW;
    }
}
