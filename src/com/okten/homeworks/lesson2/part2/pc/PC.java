package com.okten.homeworks.lesson2.part2.pc;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PC {
    private Processor processor;
    private Monitor monitor;
    private Ram ram;
}
