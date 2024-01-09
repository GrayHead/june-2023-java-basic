package com.okten.homeworks.lesson2.part2.laptop;

import com.okten.homeworks.lesson2.part2.pc.Monitor;
import com.okten.homeworks.lesson2.part2.pc.PC;
import com.okten.homeworks.lesson2.part2.pc.Processor;
import com.okten.homeworks.lesson2.part2.pc.Ram;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Laptop extends PC {
    private WiFi wiFi;
    private Battery battery;

    public Laptop(Processor processor, Monitor monitor, Ram ram, WiFi wiFi, Battery battery) {
        super(processor, monitor, ram);
        this.wiFi = wiFi;
        this.battery = battery;
    }
}
