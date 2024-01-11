package com.okten.homeworks.lesson3.part2;

public class Printer {

    private String data;

    public Printer() {
    }

    public Printer(String data) {
        this.data = data;
    }

    public void printSomeData(PrintHelper helper) {

        helper.print(this.data);

    }
}
