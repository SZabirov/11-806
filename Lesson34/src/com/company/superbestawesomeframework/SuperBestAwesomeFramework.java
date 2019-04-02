package com.company.superbestawesomeframework;

import java.util.ArrayList;
import java.util.List;

public class SuperBestAwesomeFramework {
    static <T> List<T> getMany(Class<T> c, int count) {
        List<T> l = new ArrayList<>();
        try {
            for (int i = 0; i < count; i++) {
                T o = c.newInstance();
                l.add(o);
            }
        } catch (InstantiationException | IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
        return l;
    }

    //создает список экземпляров переданного класс (count штук)
    //в качестве параметров конструктора передает params
    //можно пользоваться getConstructors()
    //можно пользоваться getParameterTypes() у конструктора
    //можно вызывать getClass() у любого параметра из переданных params
    static <T> List<T> getManyWithCons(Class<T> c, int count, Object... params) {
        return null;
    }

}
