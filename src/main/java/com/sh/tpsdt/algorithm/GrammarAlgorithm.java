package com.sh.tpsdt.algorithm;

import com.sh.tpsdt.constants.CommandConstants;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @program: tpsdt
 * @description:
 * @author: yi.sun
 * @create: 2019-03-14 13:54
 **/
@Order(2)
@Component
public class GrammarAlgorithm implements CommandAlgorithm {

    @Override
    public String validateCommand(String command) {
        return CommandConstants.COMMAND_GRAMMAR_TITLE + "";
    }

}
