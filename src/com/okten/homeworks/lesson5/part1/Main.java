package com.okten.homeworks.lesson5.part1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<String> strings = new ArrayList<>();
        List<String> collect = strings
                .stream()
                .sorted(Comparator.naturalOrder())
                .filter(s -> s.length() < 4)
                .toList();

        List<Integer> integers = new ArrayList<>();


        integers
                .stream()
                .sorted()
                .filter(integer -> integer % 3 == 0)
                .filter(integer -> integer % 3 == 0)
                .map(integer -> integer * 3)
                .forEach(System.out::println);


    }
}
