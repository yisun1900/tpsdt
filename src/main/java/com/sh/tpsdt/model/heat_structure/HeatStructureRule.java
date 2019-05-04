package com.sh.tpsdt.model.heat_structure;

import com.sh.tpsdt.constants.PasswordLevel;
import com.sh.tpsdt.model.CommonRule;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HeatStructureRule extends CommonRule {

    public HeatStructureRule(Integer length, String rulePattern, Double totalSpace, Integer order) {
        this.order = order;
        this.length = length;
        this.rulePattern = rulePattern;
        this.totalSpace = totalSpace;
        this.evaluatePasswordLevel();
    }

    protected void evaluatePasswordLevel() {
        if (this.totalSpace < HeatStructureStandard.SUPER_LOW) {
            this.passwordLevel = PasswordLevel.SUPER_LOW;
        } else if (this.totalSpace >= HeatStructureStandard.SUPER_LOW && this.totalSpace < HeatStructureStandard.LOW) {
            this.passwordLevel = PasswordLevel.LOW;
        } else if (this.totalSpace >= HeatStructureStandard.LOW && this.totalSpace < HeatStructureStandard.MEDIUM) {
            this.passwordLevel = PasswordLevel.MEDIUM;
        } else if (this.totalSpace >= HeatStructureStandard.MEDIUM && this.totalSpace < HeatStructureStandard.HIGH) {
            this.passwordLevel = PasswordLevel.HIGH;
        } else if (this.totalSpace >= HeatStructureStandard.HIGH && this.totalSpace < HeatStructureStandard.SUPER_HIGH) {
            this.passwordLevel = PasswordLevel.SUPER_HIGH;
        } else {
            this.passwordLevel = PasswordLevel.SUPER_HIGH;
        }
    }
}
