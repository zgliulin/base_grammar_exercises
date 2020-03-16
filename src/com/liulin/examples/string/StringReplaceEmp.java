package com.liulin.examples.string;

/**
 * 以下实例中我们使用 java String 类的 replace 方法来替换字符串中的字符：
 * Create by DbL on 2020/3/16 0016
 */
public class StringReplaceEmp {
    public static void main(String[] args) {
        String str="Hello World";
        System.out.println( str.replace( 'H','W' ) );
        System.out.println( str.replaceFirst("He", "Wa") );
        System.out.println( str.replaceAll("He", "Ha") );
    }
}
