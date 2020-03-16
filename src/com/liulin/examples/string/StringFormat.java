package com.liulin.examples.string;

import java.util.Locale;

/**
 * 以下实例演示了通过 format() 方法来格式化字符串，还可以指定地区来格式化
 * Create by DbL on 2020/3/16 0016
 */
public class StringFormat {
    public static void main(String[] args) {
        double e = Math.E;
        System.out.format("%f%n", e);
        System.out.format(Locale.CHINA, "%-10.5f%n%n", e);  //指定本地为中国（CHINA）
    }
}
