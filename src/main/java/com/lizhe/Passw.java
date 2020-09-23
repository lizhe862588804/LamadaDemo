package com.lizhe;


import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * @Auther: lizhe
 * @Date: 2020/9/14 - 09 - 14 - 14:40
 * @Description:com.lizhe
 * @version: 1.0
 */
public class Passw {

    public static void main(String[] args) {
        char x='A';
        String s="今天是个好日子";
        byte[] bytes = s.getBytes();
        for (byte aByte : bytes) {
            int t=aByte;
            System.out.println(t);
        }

        String s1 = new String(bytes);
        System.out.println(s1);

    }

    private static void meth() {
        int a=65;
        char aa= (char) a;
        System.out.println(aa);
    }
}
