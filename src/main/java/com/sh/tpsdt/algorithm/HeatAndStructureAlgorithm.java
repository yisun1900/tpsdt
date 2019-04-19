package com.sh.tpsdt.algorithm;

import com.sh.tpsdt.constants.CommandConstants;
import com.sh.tpsdt.constants.PasswordLevel;
import com.sh.tpsdt.model.heat_structure.HeatStructRule;

import java.util.Optional;

public class HeatAndStructureAlgorithm extends AbstractRuleAlgorithm<HeatStructRule>
        implements CommandAlgorithm, EstimateAlgorithm {

    private HeatStructRule result;

    @Override
    public String validateCommand(String command) {
        result = this.hitTheTarget(command);
        return CommandConstants.COMMAND_HEAT_STRUCTURE_TITLE + result.getPasswordLevel().name() + "," +
                CommandConstants.COMMAND_SYNTACTIC_CONTENT + result.getRulePattern();
    }

    @Override
    public PasswordLevel estimatePasswordLevel(String command) {
        return PasswordLevel.LOW;
    }

    @Override
    protected HeatStructRule hitTheTarget(String command) {
        Optional<HeatStructRule> optional = CommandConstants.HEAT_STRUCT_RULE.stream().filter(heatStructRule ->
                (heatStructRule.getLength().equals(command.length()) || heatStructRule.getLength() == 0
                        || heatStructRule.getLength() > 8)
                        && command.matches(heatStructRule.getRulePattern())).findFirst();
        return optional.isPresent() ? optional.get() : new HeatStructRule(command.length(), "*", 0d, 0);
    }
}
