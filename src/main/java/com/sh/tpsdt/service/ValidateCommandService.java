package com.sh.tpsdt.service;

import com.sh.tpsdt.algorithm.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/**
 * @program: tpsdt
 * @description:
 * @author:
 * @create: 2019-03-14 13:48
 **/
public class ValidateCommandService {

    private LengthAlgorithm lengthAlgorithm = new LengthAlgorithm();

    private BruteMeterAlgorithm bruteMeterAlgorithm = new BruteMeterAlgorithm();

    private HeatAndStructureAlgorithm heatAndStructureAlgorithm = new HeatAndStructureAlgorithm();

    private PointAlgorithm pointAlgorithm = new PointAlgorithm();

    private RecommendAlgorithm recommendAlgorithm =
            new RecommendAlgorithm(pointAlgorithm, bruteMeterAlgorithm, heatAndStructureAlgorithm);

    private List<CommandAlgorithm> commandAlgorithmList = Arrays.asList(
            lengthAlgorithm, bruteMeterAlgorithm, heatAndStructureAlgorithm, pointAlgorithm, recommendAlgorithm
    );

    public void printTpsdtWelcome() {
        System.out.print("==================================================\n");
        System.out.print("==== 当前为文本口令强度评估工具！\n");
        System.out.print("==== 请在此输入您要评测文本口令: ");
    }

    public List<String> validateCommand() {
        while (true) {
            try {
                this.printTpsdtWelcome();
                String password = new BufferedReader(new InputStreamReader(System.in)).readLine();
                this.commandAlgorithmList.stream().forEachOrdered(
                        commandAlgorithm -> System.out.println(commandAlgorithm.validateCommand(password)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
