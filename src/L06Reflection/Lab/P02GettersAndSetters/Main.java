package L06Reflection.Lab.P02GettersAndSetters;

import L06Reflection.Lab.Reflection;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Class<Reflection> clazz = Reflection.class;

        Method[] methods = clazz.getDeclaredMethods();

        TreeSet<Method> getters = filterMethodsBy(methods, "get");
        TreeSet<Method> setters = filterMethodsBy(methods, "set");
        
        getters.forEach(getter -> printGetter(getter.getName(), getter.getReturnType()));
        setters.forEach(setter -> printSetter(setter.getName(), setter.getParameterTypes()));
    }

    private static void printSetter(String name, Class<?>[] parameterTypes) {
        //"{name} and will set field of class {Parameter Type}"
        System.out.println(name + " and will set field of class " + Arrays.toString(parameterTypes));
    }

    private static void printGetter(String name, Class<?> returnType) {
        //"{name} will return class {Return Type}"
        System.out.println(name + " will return class " + returnType);
    }

    private static TreeSet<Method> filterMethodsBy(Method[] methods, String filter) {
        return Arrays.stream(methods)
                .filter(method -> method.toString().contains(filter))
                .collect(Collectors.toCollection( () -> new TreeSet<>(Comparator.comparing(Method::getName))));
    }
}
