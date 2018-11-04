package com.zw.designpattern.decorator.myextension;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Test {

    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("C:\\IDEAProject\\DesignPattern\\src\\decorator\\myextension\\test.txt")));
            while ((c=in.read())>0){
                System.out.println((char)c);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
