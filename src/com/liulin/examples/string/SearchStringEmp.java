package com.liulin.examples.string;

/**
 * Create by DbL on 2020/3/16 0016
 */
public class SearchStringEmp {
    public static void main(String[] args) {
        String strOrig = "Google Nowcoder Taobao";
        int intIndex = strOrig.indexOf("Nowcoder");
        if (intIndex == -1) {
            System.out.println("没有找到字符串 Nowcoder");
        } else {
            System.out.println("Nowcoder 字符串位置 " + intIndex);
        }
    }
}
