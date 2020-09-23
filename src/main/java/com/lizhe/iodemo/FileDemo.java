package com.lizhe.iodemo;

import com.sun.xml.internal.ws.util.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * @Auther: lizhe
 * @Date: 2020/9/10 - 09 - 10 - 9:52
 * @Description:com.lizhe.iodemo
 * @version: 1.0
 */
public class FileDemo {
    public static void main(String[] args) {
        String name = "";
         Objects.nonNull(name);

        File txt = new File("./src/main/java/com/lizhe/iodemo/abc.txt");
        File excel = new File("abc.xls");
        File  pakege = new File("pakege");
        File  image = new File("./src/main/java/com/lizhe/iodemo/static/imag.png");
        File src = new File("src");

        try {
            txt.createNewFile();
            excel.createNewFile();
            pakege.mkdir();
            image.createNewFile();
            System.out.println(src.isDirectory());
            File[] files = src.listFiles();
            Stream.of(files).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }

    }
}
