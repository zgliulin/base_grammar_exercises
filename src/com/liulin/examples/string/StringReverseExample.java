package com.liulin.examples.string;

/**
 * Create by DbL on 2020/3/16 0016
 */
public class StringReverseExample {
    public static void main(String[] args) {
        String string="nowcoder";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("字符串反转前:"+string);
        System.out.println("字符串反转后:"+reverse);
    }
}
