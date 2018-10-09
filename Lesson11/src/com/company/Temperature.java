package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("weather.txt"));
        int sumTemperature = 0;
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            int t = Integer.parseInt(arr[1]);
            sumTemperature += t;
        }
        double averageTemp = ((double) sumTemperature) / 7;
        System.out.println(averageTemp);
    }
}
