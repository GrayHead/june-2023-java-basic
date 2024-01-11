package com.okten.homeworks.lesson3.part2;

public class PrinterHelperA implements PrintHelper {


    public void foo() {


    }
    public String bar() {
        return "Ultricesat";
    }

    @Override
    public void print(String data) {
        byte[] bytes = data.getBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }
    }
}
