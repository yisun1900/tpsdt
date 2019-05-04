package com.sh.tpsdt.model;

import com.sh.tpsdt.constants.PasswordLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonRule {

    protected String rulePattern;

    protected Integer length;

    protected Double space;

    protected Double frequent;

    protected Double frequency;

    protected Double efficiency;

    protected Double totalSpace;

    protected Double totalFrequent;

    protected Integer order;

    protected PasswordLevel passwordLevel;

    protected String desc;
}
