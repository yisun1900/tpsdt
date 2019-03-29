package com.sh.tpsdt.algorithm;

import com.sh.tpsdt.constants.CommandConstants;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @program: tpsdt
 * @description:
 * @author: yi.sun
 * @create: 2019-03-14 14:47
 **/
@Order(5)
@Component
public class PointAlgorithm implements CommandAlgorithm {

    @Override
    public String validateCommand(String command) {
        return CommandConstants.COMMAND_POINT_TITLE + "";
    }

}
