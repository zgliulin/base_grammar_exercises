package com.liulin.exercises;

/**
 * Create by DbL on 2020/3/16 0016
 */
public class Test {
    public static void main(String[] args) {
        printOut(123456789);
        /*TestA a1 = new TestA();
        TestA a2 = new TestA();
        System.out.println(a1.i == a2.i);
        System.out.println(a1.j == a2.j);*/
    }

    public  static void printOut(int n){
        if(n>10) printOut(n/10);
        System.out.println(n%10);
    }

}
