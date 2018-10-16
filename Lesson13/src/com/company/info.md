#Наследование

* Один из принципов ООП.
* Наследование - механизм, позволяющий создать новый класс 
на основе имеющегося класса таким образом, что объекты
класса-наследника приобретут состояние и поведение объектов
класса-родителя (суперкласса). 
* В примере ниже класс `B` унаследован от класса `A`. Это 
значит, что объекты класса `B` будут иметь метод `m()` 
и поле `int a`.
```java
class A {
    int a;
    void m() {}
}

class B extends A {
}
```
* Ключевое слово **`super`**. Используется для обращения к членам
родительского класса: `super.m()`; а также для вызова 
конструктора родительского класса: `super()`.
* В конструкторе наследника первой строкой обязательно должен
вызываться один из конструкторов родительского класса.
```java
class Vehicle {
    String registrationNumber;
    Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}

class Bus extends Vehicle {
    int passengersNumber;
    Bus(String registrationNumber, int passengersNumber) {
        super(registrationNumber);
        this.passengersNumber = passengersNumber;
    }
}
```
Если же в классе родителе есть только конструктор
без параметров, то `super();` в потомке можно пропустить.\
Почему самый первый пример с классами `A` и `B` работал - 
потому что данный пример опирался на использование
конструкторов по умолчанию.
* Конструкторы класса не наследуются.\
Именно поэтому в примере ниже мы обязаны объявить конструктор
в классе B, нельзя просто оставить `class B extends A {}`
```java
class A {
    int a;
    A (int a) {
        this.a = a;
    }
}

class B extends A {
    B (int a) {
        super(a);
    }
}
```
* Переопределение методов. В классе-наследнике можно 
задать другую реализацию для методов, унаследованных 
от родителя - это называется переопределением.\
Переопределяемые методы помечаются аннотацией `@Override`,
чтобы при компиляции выполнилась проверка, что такой метод
с такой же сигнатурой действительно был объявлен в суперклассе.