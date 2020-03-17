package com.liulin.examples.array;

import java.util.Arrays;
import java.util.Collections;

/**
 * 以下实例演示了如何通过 Collections 类的 Collections.max() 和 Collections.min() 方法来查找数组中的最大和最小值：
 * Create by DbL on 2020/3/17 0017
 */
public class MaxMin {
    public static void main(String[] args) {
        Integer[] numbers = {8, 2, 7, 1, 4, 9, 5};
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));
        System.out.println("最小值: " + min);
        System.out.println("最大值: " + max);
    }
}
