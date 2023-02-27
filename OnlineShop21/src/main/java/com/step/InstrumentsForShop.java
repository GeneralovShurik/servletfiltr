package com.step;

import java.math.BigDecimal;
import java.util.ArrayList;

public class InstrumentsForShop {
        static ArrayList<String> MyList = new ArrayList<>();

        public static String AddSelectItems(String element) {
            if (element == null) {
                if (MyList.isEmpty()) {
                    return "Select an element from the list";
                }
            } else {
                MyList.add(element);
            }
            StringBuilder sb = new StringBuilder("<ol>");
            for (String i : MyList) {
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

        public static String getTheResult() {
            StringBuilder sb = new StringBuilder("<ol>");
            for (String i : MyList) {
                sb.append("<li>\n" + i + "</li>\n");
            }
            return sb.append("</ol>").toString();
        }

    }



