package com.sh.tpsdt.service;

import com.sh.tpsdt.algorithm.CommandAlgorithm;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: tpsdt
 * @description:
 * @author:
 * @create: 2019-03-14 13:48
 **/
public class ValidateCommandService {

    private List<CommandAlgorithm> commandAlgorithmList;

    public List<String> validateCommand(String command) {
        return commandAlgorithmList.stream()
                .map(commandAlgorithm -> commandAlgorithm.validateCommand(command))
                .collect(Collectors.toList());
    }
}
