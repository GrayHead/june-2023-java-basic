package com.okten.homeworks.lesson2.part2.workstation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dock {
    private String brand;
    private ArrayList<Port> ports = new ArrayList<Port>();

    public Dock(String brand, Port... ports) {
        this.brand = brand;
//        this.ports = (ArrayList<Port>) Arrays.asList(ports);
        for (Port port : ports) {
            this.ports.add(port);
        }

    }
}
