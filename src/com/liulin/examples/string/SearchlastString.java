package com.liulin.examples.string;

/**
 * 以下实例中我们通过字符串函数 strOrig.lastIndexOf(Stringname) 来查找子字符串 Stringname 在 strOrig 出现的位置
 * Create by DbL on 2020/3/16 0016
 */
public class SearchlastString {
    public static void main(String[] args) {
        String strOrig = "Hello world ,Hello Nowcoder";
        int lastIndex = strOrig.lastIndexOf("Nowcoder");
        if(lastIndex == - 1){
            System.out.println("没有找到字符串 Nowcoder");
        }else{
            System.out.println("Nowcoder 字符串最后出现的位置： "+ lastIndex);
        }
    }
}
