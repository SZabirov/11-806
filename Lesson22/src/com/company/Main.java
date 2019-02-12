package com.company;

import com.company.simplemap.Map;
import com.company.simplemap.SimpleMap;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> map = new SimpleMap<>(10);
        map.put("Болконский", 4);
        map.put("Салават", 5);
        Integer number = map.get("Салават");
        System.out.println(number);
    }
}
