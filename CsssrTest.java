package ru.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class CsssrTest {

    public Map sort(String s) {
        return Arrays.stream(s.split(" ")).sorted().
                collect(Collectors.groupingBy(a -> a.charAt(0))).
                entrySet().stream().
                filter(b -> b.getValue().size() > 1).
                collect(toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public static void main(String[] args) {
        String s = "сапог сарай арбуз болт бокс биржа";
        System.out.println(new CsssrTest().sort(s));
    }
}
