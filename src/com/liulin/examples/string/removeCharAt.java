package com.liulin.examples.string;

/**
 * 以下实例中我们通过字符串函数 substring() 函数来删除字符串中的一个字符，
 * 我们将功能封装在 removeCharAt 函数中。
 * Create by DbL on 2020/3/16 0016
 */
public class removeCharAt {
    public static void main(String args[]) {
        String str = "this is Java";
        System.out.println(removeCharAt(str, 3));
    }
    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
