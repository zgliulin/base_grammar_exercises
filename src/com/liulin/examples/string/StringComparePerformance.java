package com.liulin.examples.string;

/**
 * 以下实例演示了通过两种方式创建字符串，并测试其性能
 * Create by DbL on 2020/3/16 0016
 */
public class StringComparePerformance {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            String s1 = "hello";
            String s2 = "hello";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("通过 String 关键词创建字符串"
                + " : " + (endTime - startTime)
                + " 毫秒");
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            String s3 = new String("hello");
            String s4 = new String("hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("通过 String 对象创建字符串"
                + " : " + (endTime1 - startTime1)
                + " 毫秒");
    }
}
