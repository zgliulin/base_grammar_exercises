package com.liulin.exercises.ac_character;

/**
 * Character 类用于对单个字符进行操作。
 * Character 类在对象中包装一个基本类型 char 的值
 * Create by DbL on 2020/3/15 0015
 */
public class Character {
    public static void main(String[] args) {
        java.lang.Character.isLetter('a');// 是否是一个字母
        java.lang.Character.isDigit('3');// 是否是一个数字字符
        java.lang.Character.isWhitespace(' ');// 是否是一个空白字符
        java.lang.Character.isUpperCase('A'); // 是否为一个大写字母
        java.lang.Character.toUpperCase('a');// 指定字母的大写形式
    }
}
