package com.jifeng.fitness.utils;

import java.util.ArrayList;
import java.util.List;

public class SymbolUtils {

    public static List getNumbers(String old) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < old.length(); i++) {
            if (old.charAt(i) >= 48 && old.charAt(i) <= 57) {
                list.add(old.charAt(i));
            }
        }
        return list;
    }

}
