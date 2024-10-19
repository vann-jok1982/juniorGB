package Lesson2;

import java.lang.reflect.Method;
import java.util.Arrays;

//Используя Reflection API, напишите программу, которая выводит на экран все методы класса String.
public class ReflectionAPI {
    public static void main(String[] args) {

        Class<String> classString = String.class;
        Method[] methodsString = classString.getMethods();
        for (Method method:methodsString) {
            System.out.println(method.getName()+ "," + method.getReturnType() + "," + Arrays.toString(method.getParameterTypes()));
        }
    }
}
