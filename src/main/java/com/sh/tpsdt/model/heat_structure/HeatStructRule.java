package com.sh.tpsdt.model.heat_structure;

import com.sh.tpsdt.constants.PasswordLevel;
import com.sh.tpsdt.model.CommonRule;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HeatStructRule extends CommonRule {

    public HeatStructRule(Integer length, String rulePattern, Double totalSpace, Integer order) {
        this.order = order;
        this.length = length;
        this.rulePattern = rulePattern;
        this.totalSpace = totalSpace;
        this.evaluatePasswordLevel();
    }

    protected void evaluatePasswordLevel() {
        if (this.totalSpace < HeatStructStandard.SUPER_LOW) {
            this.passwordLevel = PasswordLevel.SUPER_LOW;
        } else if (this.totalSpace >= HeatStructStandard.SUPER_LOW && this.totalSpace < HeatStructStandard.LOW) {
            this.passwordLevel = PasswordLevel.LOW;
        } else if (this.totalSpace >= HeatStructStandard.LOW && this.totalSpace < HeatStructStandard.MEDIUM) {
            this.passwordLevel = PasswordLevel.MEDIUM;
        } else if (this.totalSpace >= HeatStructStandard.MEDIUM && this.totalSpace < HeatStructStandard.HIGH) {
            this.passwordLevel = PasswordLevel.HIGH;
        } else if (this.totalSpace >= HeatStructStandard.HIGH && this.totalSpace < HeatStructStandard.SUPER_HIGH) {
            this.passwordLevel = PasswordLevel.SUPER_HIGH;
        } else {
            this.passwordLevel = PasswordLevel.SUPER_HIGH;
        }
    }
}
