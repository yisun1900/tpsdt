package com.sh.tpsdt.model.brute_meter;

import com.sh.tpsdt.constants.PasswordLevel;
import com.sh.tpsdt.model.CommonRule;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BruteMeterRule extends CommonRule {

    public BruteMeterRule() {
    }

    public BruteMeterRule(Integer length, String rulePattern, Double totalSpace, Integer order) {
        this.order = order;
        this.length = length;
        this.rulePattern = rulePattern;
        this.totalSpace = totalSpace;
        this.evaluatePasswordLevel();
    }

    protected void evaluatePasswordLevel() {
        if (this.totalSpace < BruteMeterStandard.SUPER_LOW) {
            this.passwordLevel = PasswordLevel.SUPER_LOW;
        } else if (this.totalSpace >= BruteMeterStandard.SUPER_LOW && this.totalSpace < BruteMeterStandard.LOW) {
            this.passwordLevel = PasswordLevel.LOW;
        } else if (this.totalSpace >= BruteMeterStandard.LOW && this.totalSpace < BruteMeterStandard.MEDIUM) {
            this.passwordLevel = PasswordLevel.MEDIUM;
        } else if (this.totalSpace >= BruteMeterStandard.MEDIUM && this.totalSpace < BruteMeterStandard.HIGH) {
            this.passwordLevel = PasswordLevel.HIGH;
        } else if (this.totalSpace >= BruteMeterStandard.HIGH && this.totalSpace < BruteMeterStandard.SUPER_HIGH) {
            this.passwordLevel = PasswordLevel.SUPER_HIGH;
        } else {
            this.passwordLevel = PasswordLevel.SUPER_HIGH;
        }
    }
}
