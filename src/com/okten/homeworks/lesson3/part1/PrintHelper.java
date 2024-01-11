package com.okten.homeworks.lesson3.part1;

public class PrintHelper {

    public void print(String data) {
        byte[] bytes = data.getBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }

    }
}
