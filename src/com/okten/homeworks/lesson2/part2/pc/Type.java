package com.okten.homeworks.lesson2.part2.pc;

public enum Type {

    DDR3("LaxmiLai",451),
    DDR4("SS0bA9t",186),
    DDR5("KyawI",498);

    private String brand;
    private int freq;

    Type() {
    }

    Type(String brand, int freq) {
        this.brand = brand;
        this.freq = freq;
    }
}
