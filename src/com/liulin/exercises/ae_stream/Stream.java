package com.liulin.exercises.ae_stream;

import java.io.*;

/**
 * 使用 BufferedReader 在控制台读取字符
 * Create by DbL on 2020/3/15 0015
 */
public class Stream {
    public static void main(String[] args) throws IOException {
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));

        // 可以使用字符串类型的文件名来创建一个输入流对象来读取文件：
        InputStream f = new FileInputStream("C:/java/hello");
        // 也可以使用一个文件对象来创建一个输入流对象来读取文件。我们首先得使用 File() 方法来创建一个文件对象
        File file = new File("C:/java/hello");
        InputStream out = new FileInputStream(file);
        // 使用字符串类型的文件名来创建一个输出流对象
        OutputStream f1 = new FileOutputStream("C:/java/hello");
        // 也可以使用一个文件对象来创建一个输出流来写文件。我们首先得使用File()方法来创建一个文件对象
        File f2 = new File("C:/java/hello");
        OutputStream f3 = new FileOutputStream(f2);

    }

    public static void fileStreamTest(){
        try {
            byte bWrite[] = { 11, 21, 3, 40, 5 };
            OutputStream os = new FileOutputStream("test.txt");
            for (int x = 0; x < bWrite.length; x++) {
                os.write(bWrite[x]); // writes the bytes
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.print((char) is.read() + "  ");
            }
            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
