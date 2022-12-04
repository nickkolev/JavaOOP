package L06Reflection.Lab.P01Reflection;

import L06Reflection.Lab.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.Ref;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<Reflection> clazz = Reflection.class;

        System.out.println(clazz);

        Class<?> superClazz = clazz.getSuperclass();

        System.out.println(superClazz);

        Class<?>[] interfaces = clazz.getInterfaces();

        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }

        Constructor<Reflection> constructor = clazz.getDeclaredConstructor();
        Reflection newInstance = constructor.newInstance();
        System.out.println(newInstance);
    }
}
