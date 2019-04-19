package com.sh.tpsdt.service;

import com.sh.tpsdt.algorithm.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: tpsdt
 * @description:
 * @author:
 * @create: 2019-03-14 13:48
 **/
public class ValidateCommandService {

    private List<CommandAlgorithm> commandAlgorithmList = Arrays.asList(
            new LengthAlgorithm(),
            new BruteMeterAlgorithm(),
            new HeatAndStructureAlgorithm(),
//            new GrammarAlgorithm(),
//            new SyntacticAlgorithm(),
//            new PersonPreferAlgorithm(),
            new PointAlgorithm()
    );

    public void printTpsdtWelcome() {
        System.out.println("==================================================");
        System.out.println("==== 当前为文本口令强度评估工具！");
        System.out.print("==== 请在此输入您要评测文本口令: ");
    }

    public List<String> validateCommand() {
/*        while (true) {
            try {
                this.printTpsdtWelcome();
                String password = new BufferedReader(new InputStreamReader(System.in)).readLine();
                this.commandAlgorithmList.stream().forEachOrdered(
                        commandAlgorithm -> System.out.println(commandAlgorithm.validateCommand(password)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/
//                while (true)
        return null;

    }

    public static void main(String... args){
//        System.out.println("11111".matches("([0-9a-zA-Z])$1{5}"));
        Pattern pattern1 = Pattern.compile("(\\d)\\1{5}");
        Pattern pattern2 = Pattern.compile("([\\d])\\1{3}");
        Matcher matcher = pattern1.matcher("11111");
        System.out.println(matcher.matches()); //true
    }
}
