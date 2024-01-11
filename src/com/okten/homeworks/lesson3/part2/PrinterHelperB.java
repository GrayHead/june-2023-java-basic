package com.okten.homeworks.lesson3.part2;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class PrinterHelperB implements PrintHelper {


    public String reverse(String s) {
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        byte[] res = new byte[s.length()];
        for (int i = bytes.length - 1, j = 0; i >= 0; i--, j++) {
            res[j] = bytes[i];
        }
        return String.valueOf(Arrays.toString(res));


    }

    @Override
    public void print(String data) {
        System.out.println(reverse(data));

    }

}

