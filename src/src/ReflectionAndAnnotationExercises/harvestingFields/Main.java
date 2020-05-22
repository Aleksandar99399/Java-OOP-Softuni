package src.ReflectionAndAnnotationExercises.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		String input=scanner.nextLine();

		Field[] fields = RichSoilLand.class.getDeclaredFields();

		while (!input.equals("HARVEST")){

			for (Field field : fields) {

				int modifiers = field.getModifiers();
				String modifier= Modifier.toString(modifiers);

				if (modifier.equals(input)||input.equals("all")){

					System.out.printf("%s %s %s%n",
							modifier,
							field.getType().getSimpleName(),
							field.getName());
				}
			}


			input=scanner.nextLine();
		}

	}
}
