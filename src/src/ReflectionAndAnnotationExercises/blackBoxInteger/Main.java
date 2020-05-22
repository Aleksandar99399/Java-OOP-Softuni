package src.ReflectionAndAnnotationExercises.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);

        String input=scanner.nextLine();

        BlackBoxInt blackBoxInt;
        try {
            Constructor<BlackBoxInt> ctor= BlackBoxInt.class.getDeclaredConstructor(int.class);
            ctor.setAccessible(true);
            blackBoxInt=ctor.newInstance(0);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        Map<String,Method>methodByNames= Arrays.stream(
                blackBoxInt.getClass().getDeclaredMethods())
                .peek(m-> m.setAccessible(true))
                .collect(Collectors.toMap(Method::getName, m -> m));

        while (!input.equals("END")){
            String[] tokens=input.split("_");

            String command=tokens[0];
            int param=Integer.parseInt(tokens[1]);

            Method method = methodByNames.get(command);

            method.invoke(blackBoxInt,param);

            Field value = blackBoxInt.getClass()
                    .getDeclaredField("innerValue");

            value.setAccessible(true);

            int o = (int) value.get(blackBoxInt);
            System.out.println(o);

            input=scanner.nextLine();
        }
    }
}
