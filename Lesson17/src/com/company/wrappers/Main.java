package com.company.wrappers;

public class Main {
    public static void main(String[] args) {
        Human h = new Human();
        System.out.println(h.getWeight());

        HumanV2 humanV2 = new HumanV2();
        System.out.println(humanV2.getWeight());

        Integer i = new Integer(42);//класс-обертка
        Integer j = 42;//autoboxing - оборачиваем примитивное значение 42 в объект типа Integer
        int r = j;//unboxing

        Boolean t = true;

        Integer a = 1000;
        Integer b = 1000;
        System.out.println(a == b);

        Integer x = 5;
        Integer y = 5;
        System.out.println(x == y);

        System.out.println(x.equals(y));//корректный способ сравнить два Integer'a независимо от их значения



    }
}







