package com.liulin.examples.string;

/**
 * 以下实例使用了 String toUpperCase() 方法将字符串从小写转为大写
 * Create by DbL on 2020/3/16 0016
 */
public class StringToUpperCaseEmp {
    public static void main(String[] args) {
        String str = "string nowcoder";
        String strUpper = str.toUpperCase();
        System.out.println("原始字符串: " + str);
        System.out.println("转换为大写: " + strUpper);
    }
}
