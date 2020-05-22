package src.ReflectionAndAnnotationsLab.ReflectionLab;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<Reflection> clazz = Reflection.class;

        //  int modifiers = clazz.getModifiers();
        //  System.out.println(Modifier.isFinal(clazz.getModifiers()));

        //  int [] arr= (int[]) Array.newInstance(int.class,3);

        //  Array.set(arr,1,5);

        //  for (int i : arr) {
        //      System.out.println(i);
        //  }
        //

      Field[] declaredFields = clazz.getDeclaredFields();
      Arrays.stream(declaredFields)
              .filter(field -> !Modifier.isPrivate(field.getModifiers()))
              .sorted(Comparator.comparing(Field::getName))
              .forEach(field -> System.out.printf("%s must be private!%n",field.getName()));

      Method[] methods = clazz.getDeclaredMethods();
      Arrays.stream(methods)
              .filter(method -> method.getName().startsWith("get"))
              .filter(method -> !Modifier.isPublic(method.getModifiers()))
              .sorted(Comparator.comparing(Method::getName))
              .forEach(e-> System.out.printf("%s have to be public!%n",e.getName()));

      Arrays.stream(methods)
             .filter(method -> method.getName().startsWith("set"))
             .filter(method -> method.getParameterTypes().length==1)
             .filter(method -> !Modifier.isPrivate(method.getModifiers()))
             .sorted(Comparator.comparing(Method::getName))
             .forEach(method -> System.out.printf("%s have to be private!",method.getName()));


      for (Method method : methods) {
          System.out.println(method.getName());}

      System.out.println(clazz);

       Class<? super Reflection>superClazz=clazz.getSuperclass();
       System.out.println(superClazz);

       Class<?>[] interfaces = clazz.getInterfaces();

       for (Class<?> anInterface : interfaces) {
           System.out.println(anInterface);
       }

       Constructor<?>[] constructors = clazz.getDeclaredConstructors();

       for (Constructor<?> constructor : constructors) {
           System.out.println(constructor);
       }

       Constructor<?>ctor=clazz.getDeclaredConstructor();
       ctor.setAccessible(true);//хакване на access- модификаторите за достъп
       System.out.println(ctor.newInstance());
       clazz.getMethod("getEmail");


    }
}
