package com.okten.homeworks.lesson2.part2;

import com.okten.homeworks.lesson2.part2.laptop.Battery;
import com.okten.homeworks.lesson2.part2.laptop.Laptop;
import com.okten.homeworks.lesson2.part2.laptop.WiFi;
import com.okten.homeworks.lesson2.part2.laptop.WifiType;
import com.okten.homeworks.lesson2.part2.pc.*;
import com.okten.homeworks.lesson2.part2.ultrabook.BodyType;
import com.okten.homeworks.lesson2.part2.ultrabook.MotherBoard_Type;
import com.okten.homeworks.lesson2.part2.ultrabook.Ultrabook;
import com.okten.homeworks.lesson2.part2.workstation.Dock;
import com.okten.homeworks.lesson2.part2.workstation.Port;
import com.okten.homeworks.lesson2.part2.workstation.Port_Type;
import com.okten.homeworks.lesson2.part2.workstation.Workstation;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        PC-Laptop-Ultrabook
//        PC-Laptop- Workstation
//        Загальна кількість вкористаних класів - 4!

        PC pc = new PC(
                new Processor(123, 1231, "i19"),
                new Monitor("acer", 23.5),
                new Ram(12324, Type.DDR3));
        Laptop laptop = new Laptop(
                new Processor(123123, 12312321, "asfhasfdh"),
                new Monitor("LyudmilaGarba", 771.71),
                new Ram(123123, Type.DDR4),
                new WiFi("6LKj352c", WifiType.TYPE_5Hz),
                new Battery(646, "MinLima"));

        Ultrabook ultrabook = new Ultrabook(
                new Processor(123123, 12312321, "asfhasfdh"),
                new Monitor("Alfredodo Nascimento", 86),
                new Ram(12424, Type.DDR5),
                new WiFi("BNtp9Rg", WifiType.TYPE_2Hz),
                new Battery(11342, "HajiZaman"),
                BodyType.ALIMINIUM,
                MotherBoard_Type.UNIBODY);


//        ArrayList<Port> ports = new ArrayList<>();
//        ports.add(new Port(Type.C, "vJRtiByZSiv"));
//        ports.add(new Port(Type.RJ45, "vJRtiByZSiv"));
//        ports.add(new Port(Type.USB, "vJRtiByZSiv"));


        Workstation workstation = new Workstation(
                new Processor(),
                new Monitor(),
                new Ram(),
                new WiFi(),
                new Battery(),
                new Dock("JoaoIto",
                        new Port(Port_Type.C, "SantoshMai"),
                        new Port(Port_Type.RJ45, "rnFs2HR"),
                        new Port(Port_Type.USB, "2006"))
        );


//                Cтворити клас ланцюг наслідування:
//        Папірус-Кинга-Журнал
//        Папірус-Книга-Комікс
//        Кількість полів довільна.

    }
}
