package src.ReflectionAndAnnotationsLab.AnnotationsLab;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Foo> reflectionFoo = Foo.class;



        Foo fooInstance=reflectionFoo.getConstructor().newInstance();

        Arrays.stream(reflectionFoo.getMethods())
                .filter(method -> method.getDeclaredAnnotation(Test.class) != null)
                .filter(method -> method.getParameterCount() == 0)
                .forEach(method -> {
                    try {
                        String name= !method.getDeclaredAnnotation(Test.class).value().equals("")
                                ? method.getDeclaredAnnotation(Test.class).value()
                                : method.getName();
                        System.out.println("Invoking: "+name );
                        method.invoke(fooInstance);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
    }
}
