package com.step;

import java.math.BigDecimal;

public class Result {
    public static String getTheResult(String[] arr) {
        StringBuilder sb = new StringBuilder("<ol>");
        for (String i : arr) {
            sb.append("<li>\n" + i + "</li>\n");
        }
        return sb.append("</ol>").toString();
    }

    public static String resultOutput(String[] arr) {
        BigDecimal sum = BigDecimal.ZERO;
        StringBuilder sb = new StringBuilder();
        for (String i : arr) {
            sum = sum.add(new BigDecimal(i.replaceAll("[\\D&&[^.]]", "")));
        }
        return sb.append(sum + "$").toString();
    }
}


