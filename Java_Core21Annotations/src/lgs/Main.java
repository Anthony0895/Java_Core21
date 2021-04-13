package lgs;

import java.lang.reflect.Field;

public class Main {
	public static void main(String[] args)  {

		getAnnotation(Animal.class);
	}

	public static void getAnnotation(Class<?> inputClass)  {
		Field[] fields = inputClass.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			if (field.getAnnotation(MyAnnotation.class) instanceof MyAnnotation) {
				System.out.println(field.getName() + ": annotation = "
						+ field.getAnnotation(MyAnnotation.class).value() + ", type field = "
						+ field.getType().getName());

			}

		}
	}

}
