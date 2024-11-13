package main.java.reflection;

import java.lang.reflect.Field;

public class ReflectionTutorial {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat("Stella", 6);
        Field[] catFields = cat.getClass().getDeclaredFields();
        for (Field field : catFields) {
            if (field.getName().equals("name")) {
                field.set(cat, "Jimmy McGill");
            }
//            System.out.println(field.getName());
        }
    }
}
