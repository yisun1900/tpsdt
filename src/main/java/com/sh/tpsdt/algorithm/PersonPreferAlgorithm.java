package com.sh.tpsdt.algorithm;

import com.sh.tpsdt.constants.CommandConstants;

/**
 * @program: tpsdt
 * @description:
 * @author:
 * @create: 2019-03-14 13:53
 **/
public class PersonPreferAlgorithm implements CommandAlgorithm {

    @Override
    public String validateCommand(String command) {
        return CommandConstants.COMMAND_PERSON_PREFER_TITLE + "";
    }
}
