package com.company.v2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Application {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        NotepadUser user = new NotepadUser();
        Class<NotepadUser> userClass = NotepadUser.class;
        Field[] fields = userClass.getDeclaredFields();
        for (Field field : fields) {
            Annotation[] annotations =
                    field.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                Class annotationClass = annotation.annotationType();
                if (annotationClass.equals(InjectImpl.class)) {
                    String interfaceName = field.getType().getName();
                    String className = interfaceName + "Impl";
                    Class c = Class.forName(className);
                    Object instance = c.newInstance();
                    field.setAccessible(true);
                    field.set(user, instance);
                }
            }
        }
        user.takeNotes(5);
    }
}
