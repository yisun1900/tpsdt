package com.sh.tpsdt.algorithm;

import com.sh.tpsdt.constants.CommandConstants;
import org.apache.commons.lang3.RandomUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RecommendAlgorithm {

    public String trimBracket(String source) {
        return source.substring(1, source.length() - 1);
    }

    public int getSourceIndex(String[] source) {
        return RandomUtils.nextInt(0, source.length - 1);
    }

    public String recommendPassword() {
        String[] azLowList = trimBracket(CommandConstants.AZ_LOW).split("");
        String[] azHighList = trimBracket(CommandConstants.AZ_HIGH).split("");
        String[] azVowelList = trimBracket(CommandConstants.AZ_VOWEL).split("");
        String[] azUpperList = trimBracket(CommandConstants.AZ_UPPER).split("");
        String[] azLowerList = trimBracket(CommandConstants.AZ_LOWER).split("");
        String[] num09List = trimBracket(CommandConstants.NUM09).split("");
        String[] spHighList = trimBracket(CommandConstants.SP_HIGH).split("");
        String[] spLowList = trimBracket(CommandConstants.SP_LOW).split("");
        String azLowStr = azLowList[getSourceIndex(azLowList)];
        String azHighStr = azHighList[getSourceIndex(azHighList)];
        String azUpperStr = azUpperList[getSourceIndex(azUpperList)];
        String azLowerStr = azLowerList[getSourceIndex(azLowerList)];
        String azVowelStr = azVowelList[getSourceIndex(azVowelList)];
        String num09Str = num09List[getSourceIndex(num09List)];
        String spHighStr = spHighList[getSourceIndex(spHighList)];
        String spLowStr = spLowList[getSourceIndex(spLowList)];
        List<String> passwordList = Arrays.asList(azLowStr, azHighStr, azVowelStr +
                azUpperStr, azLowerStr, num09Str, spHighStr, spLowStr);
        Collections.shuffle(passwordList);
        return passwordList.stream().collect(Collectors.joining(""));
    }
}
