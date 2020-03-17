package com.liulin.examples.array;

import java.util.HashSet;
import java.util.Set;

/**
 * 以下实例演示了如何使用 set的特性来计算两个数组的并集：
 * Create by DbL on 2020/3/17 0017
 */
public class Union {
    public static void main(String[] args) throws Exception {
        String[] arr1 = {"1", "2", "3", "4"};
        String[] arr2 = {"4", "5", "6"};
        String[] result_union = union(arr1, arr2);
        System.out.println("并集的结果如下：");

        for (String str : result_union) {
            System.out.println(str);
        }
    }

    // 求两个字符串数组的并集，利用set的元素唯一性
    public static String[] union(String[] arr1, String[] arr2) {
        Set<String> set = new HashSet<String>();

        for (String str : arr1) {
            set.add(str);
        }

        for (String str : arr2) {
            set.add(str);
        }

        String[] result = {};

        return set.toArray(result);
    }
}
