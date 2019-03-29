package com.sh.tpsdt.service;

import com.sh.tpsdt.algorithm.CommandAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: tpsdt
 * @description:
 * @author: yi.sun
 * @create: 2019-03-14 13:48
 **/
@Service
public class ValidateCommandService {

    @Autowired
    private List<CommandAlgorithm> commandAlgorithmList;

    public List<String> validateCommand(String command) {
        return commandAlgorithmList.stream()
                .map(commandAlgorithm -> commandAlgorithm.validateCommand(command))
                .collect(Collectors.toList());
    }
}
