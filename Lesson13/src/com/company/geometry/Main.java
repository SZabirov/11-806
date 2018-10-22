package com.company.geometry;

public class Main {
    public static void main(String[] args) {
       // Shape c = new Shape();//Экземпляры Shape не нужны!
        Rectangle r = new Rectangle();
        r.area();
        r.setX(16);
        r.setY(-10);

        Circle c = new Circle(1);
        Shape s = new Circle(12);
        Shape s1 = new Rectangle();
        //System.out.println(s.radius); неверно
        Circle cir = (Circle) s; //приведение типа
        s.perimeter();

        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(12);
        shapes[1] = new Rectangle();
        for (int i = 0; i < 10; i++) {
            shapes[i].setX(shapes[i].x + 2);
        }
    }
}









