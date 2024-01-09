package org.example;

import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class<String> clazz = String.class;
        System.out.println(clazz.getName());
        System.out.println(clazz.getCanonicalName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getPackage());

        int mods = clazz.getModifiers();
        System.out.println("Check isAbstract " + Modifier.isAbstract(mods));
        System.out.println("Check Final " + Modifier.isFinal(mods));
        System.out.println("Check Static " + Modifier.isStatic(mods));
        System.out.println("Check Public " + Modifier.isPublic(mods));

        System.out.println(clazz);

        Class<?> parent = clazz.getSuperclass();
        System.out.println(parent.getSimpleName());

        Class[] interfaces = clazz.getInterfaces();
        System.out.println(Arrays.stream(interfaces).map(Class::getSimpleName).toList());

    }
}