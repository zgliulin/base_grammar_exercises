package com.liulin.examples.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 以下实例演示了如何通过 List 类的 Arrays.toString () 方法和 List 类的 list.Addall(array1.asList(array2) 方法将两个数组合并为一个数组：
 * Create by DbL on 2020/3/17 0017
 */
public class Merge {
    public static void main(String args[]) {
        String a[] = {"A", "E", "I"};
        String b[] = {"O", "U"};
        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));
    }
}
