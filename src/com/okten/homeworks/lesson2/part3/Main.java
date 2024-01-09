package com.okten.homeworks.lesson2.part3;

import com.okten.homeworks.lesson1.Car;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Skill> skills = new ArrayList<>();
        skills.add(new Skill("asda,", 12313));
        skills.add(new Skill("asda,", 12313));
        skills.add(new Skill("asda,", 12313));
        User user = new User(123,
                "asdasd",
                "ewfdfs",
                "dad",
                123,
                Gender.FEMALE,
                skills,
                new Car("TimothyYun", 399, 66, true));

    }
}


//                Створити клас котрий відповідає наступній моделі
//        {
//            id: 1,
//            name: 'vasya',
//            surname: 'pupkin',
//            email: 'asd@asd.com',
//            age: 31,
//            gender: 'MALE',
//            skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//            car: {model: 'toyota', year: 2021, power: 250}
//        }
//        Використати композицію/агрегацію та енуми в потрібному місці.
