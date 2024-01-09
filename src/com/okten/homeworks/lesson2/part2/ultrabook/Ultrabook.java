package com.okten.homeworks.lesson2.part2.ultrabook;

import com.okten.homeworks.lesson2.part2.laptop.Battery;
import com.okten.homeworks.lesson2.part2.laptop.Laptop;
import com.okten.homeworks.lesson2.part2.laptop.WiFi;
import com.okten.homeworks.lesson2.part2.pc.Monitor;
import com.okten.homeworks.lesson2.part2.pc.Processor;
import com.okten.homeworks.lesson2.part2.pc.Ram;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ultrabook extends Laptop {
    private BodyType bodyType;
    private MotherBoard_Type motherBoardType;

    public Ultrabook(Processor processor,
                     Monitor monitor,
                     Ram ram,
                     WiFi wiFi,
                     Battery battery,
                     BodyType bodyType,
                     MotherBoard_Type motherBoardType) {
        super(processor, monitor, ram, wiFi, battery);
        this.bodyType = bodyType;
        this.motherBoardType = motherBoardType;
    }
}
