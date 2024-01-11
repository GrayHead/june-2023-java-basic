package com.okten.homeworks.lesson3.part2;

public class Main {
    public static void main(String[] args) {

        PrintHelper printHelperA = new PrinterHelperA();
        PrintHelper helperB = new PrinterHelperB();

        Printer printer = new Printer("lorem ipsum");
        printer.printSomeData(printHelperA);
        printer.printSomeData(helperB);

        printer.printSomeData(data -> data.toUpperCase());
        PrintHelper helper = new PrintHelperTwoImpl();
        printer.printSomeData(helper);




    }
}


