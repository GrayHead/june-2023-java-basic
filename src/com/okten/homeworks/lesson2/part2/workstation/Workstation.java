package com.okten.homeworks.lesson2.part2.workstation;

import com.okten.homeworks.lesson2.part2.laptop.Battery;
import com.okten.homeworks.lesson2.part2.laptop.Laptop;
import com.okten.homeworks.lesson2.part2.laptop.WiFi;
import com.okten.homeworks.lesson2.part2.pc.Monitor;
import com.okten.homeworks.lesson2.part2.pc.Processor;
import com.okten.homeworks.lesson2.part2.pc.Ram;

public class Workstation extends Laptop {

    private Dock dock;

    public Workstation(Processor processor, Monitor monitor, Ram ram, WiFi wiFi, Battery battery, Dock dock) {
        super(processor, monitor, ram, wiFi, battery);
        this.dock = dock;
    }


}

