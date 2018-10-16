package com.company.geometry;
//реализовать Круг, Квадрат, Прямоугольник
public abstract class Shape {//Если abstract, то нельзя создать экземпляр
    int x = 0;
    int y = 0;
    /**
     * Возвращает площадь фигуры
     */
    abstract double area();//не имеет реализации. Должен быть переопределен в наследниках

    /**
     * Возвращает периметр фигуры
     */
    abstract double perimeter();

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }
}
