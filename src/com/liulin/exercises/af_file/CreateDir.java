package com.liulin.exercises.af_file;

import java.io.File;

/**
 * Create by DbL on 2020/3/15 0015
 */
public class CreateDir {
    public static void main(String args[]) {
        String dirname = "/tmp/user/java/bin";
        File d = new File(dirname);
        // 现在创建目录
        // mkdir( )方法创建一个文件夹，成功则返回true，失败则返回false。失败表明File对象指定的路径已经存在，或者由于整个路径还不存在，该文件夹不能被创建。
        // mkdirs()方法创建一个文件夹和它的所有父文件夹
        d.mkdirs();
    }
}
