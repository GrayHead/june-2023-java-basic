package com.okten.homeworks.lesson2;

import com.okten.homeworks.lesson2.part1.Address;
import com.okten.homeworks.lesson2.part1.Company;
import com.okten.homeworks.lesson2.part1.Geo;
import com.okten.homeworks.lesson2.part1.User;

public class Main {
    public static void main(String[] args) {


        User user = new User(1,
                "ShankarMahmoud",
                "HaiLe",
                "KenjiSari@as.com",
                new Address(
                        "HusseinMolina",
                        "556",
                        "NiRodrigues",
                        "9d72ea71-8200-4f32-af6b-8fcfbd7a462b",
                        new Geo("1231", "1327")),
                "87794b7d-a008-4efe-b6d2-a57fc840afb4",
                "ChengAlves.com",
                new Company(
                        "CZnTGb22",
                        "LijuanRam",
                        "VladimirDuong"));
    }

}
