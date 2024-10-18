package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

//Напишите программу, которая использует Stream API для обработки списка чисел.
//        Программа должна вывести на экран среднее значение всех четных чисел в списке.
public class StreamApi {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(2,5,7,22,34,55,3,87,9,12,14,13));
        OptionalDouble optionalDouble = list.stream().filter(l -> l%2==0).mapToInt(Integer::intValue).average();

        if (optionalDouble.isPresent()) System.out.println("Среднее значение всех четных чисел в списке: " +optionalDouble.getAsDouble());
        else System.out.println("В списке нет четных чисел.");

    }
}
