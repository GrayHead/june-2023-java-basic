package com.okten.homeworks.lesson4.part1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        Set<User> users = new TreeSet<>();
        users.add(new User(1, "asd1", new Skill(), new Skill(), new Skill(), new Skill()));
        users.add(new User(2, "asd2", new Skill()));
        users.add(new User(3, "asd3", new Skill(), new Skill(), new Skill()));
        users.add(new User(4, "asd4", new Skill(), new Skill()));

        users.forEach(System.out::println);


    }
}


@Data
@AllArgsConstructor
@NoArgsConstructor
class User implements Comparable<User> {

    private int id;
    private String name;
    private List<Skill> skills = new ArrayList<>();

    public User(int id, String name, Skill... skill) {
        this.id = id;
        this.name = name;
        for (Skill skillItem : skill) {
            skills.add(skillItem);
        }
    }

    @Override
    public int compareTo(User o) {
        return this.skills.size() - o.skills.size();
    }
}


@Data
@AllArgsConstructor
@NoArgsConstructor
class Skill {
    private String title;
    private int exp;
}
