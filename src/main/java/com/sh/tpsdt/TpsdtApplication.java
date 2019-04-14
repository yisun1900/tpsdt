package com.sh.tpsdt;

import com.sh.tpsdt.algorithm.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class TpsdtApplication {

    public static List<CommandAlgorithm> commandAlgorithmList = Arrays.asList(
            new LengthAlgorithm(),
            new BruteMeterAlgorithm(),
            new GrammarAlgorithm(),
            new SyntacticAlgorithm(),
            new PersonPreferAlgorithm(),
            new PointAlgorithm()
    );

    public static void printTpsdtWelcome() {
        System.out.println("==================================================");
        System.out.println("==== 当前为文本口令强度评估工具！");
        System.out.print("==== 请在此输入您要评测文本口令: ");
    }

    public static void main(String[] args) {
        while (true) {
            try {
                printTpsdtWelcome();
                String password = new BufferedReader(new InputStreamReader(System.in)).readLine();
                commandAlgorithmList.stream().forEachOrdered(
                        commandAlgorithm -> System.out.println(commandAlgorithm.validateCommand(password)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
//System.out.println("31321".matches("[0-9]{5}"));
    }
}
