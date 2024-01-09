package com.okten.homeworks.lesson2.part2.workstation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Port {
    private Port_Type type;
    private String version;
}
