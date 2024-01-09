package com.okten.homeworks.lesson2.part2.pc;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Processor {
    private int clock;
    private int freq;
    private String model;

}
