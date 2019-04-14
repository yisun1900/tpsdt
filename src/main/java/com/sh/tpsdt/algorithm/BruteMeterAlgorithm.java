package com.sh.tpsdt.algorithm;

import com.sh.tpsdt.constants.CommandConstants;
import com.sh.tpsdt.model.brute_meter.BruteMeterRule;

public class BruteMeterAlgorithm implements CommandAlgorithm {

    @Override
    public String validateCommand(String command) {
        BruteMeterRule result = CommandConstants.bruteMeterRule.stream().filter(bruteMeterRule ->
                (bruteMeterRule.getLength().equals(command.length()) || bruteMeterRule.getLength() == 0)
                        && command.matches(bruteMeterRule.getRulePattern())).findFirst().get();
        return CommandConstants.COMMAND_BRUTE_METER + result.getPasswordLevel().name() + "," +
                CommandConstants.COMMAND_SYNTACTIC_CONTENT + result.getRulePattern();
    }
}
