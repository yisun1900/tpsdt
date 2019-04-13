package com.sh.tpsdt;

import com.sh.tpsdt.algorithm.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class TpsdtApplication {

    public static List<CommandAlgorithm> commandAlgorithmList = Arrays.asList(
            new LengthAlgorithm(),
            new GrammarAlgorithm(),
            new SyntacticAlgorithm(),
            new PersonPreferAlgorithm(),
            new PointAlgorithm()
    );

    public static void main(String[] args) {
        while (true) {
            try {
                String password = new BufferedReader(new InputStreamReader(System.in)).readLine();
                commandAlgorithmList.stream().forEachOrdered(commandAlgorithm ->
                        System.out.println(commandAlgorithm.validateCommand(password)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
