package lesson_37.ClassWork37;

import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream { // делает для работы копию не изменяя оригинал использованный для работы
    public static void main(String[] args){
        List<String> cars = List.of("volvo","bmw","ford","mazda","bentley","merсedes");
        List <String> result = cars.stream().filter(carname -> carname.startsWith("b") )
                .collect(Collectors.toList());
        System.out.println(result);

        String [] carsArray = {"volvo","bmw","ford","mazda","bentley","merсedes" };
        // начинается на букву
        List <String> resultArray = Arrays.stream(carsArray).filter(carname -> carname.startsWith("b") )
                .collect(Collectors.toList());
        System.out.println(resultArray);

        // состоит из количества 5 букв
        List <String> resultArrayLength = Arrays.stream(carsArray).filter(carname -> carname.length() == 5 )
                .collect(Collectors.toList());
        System.out.println(resultArray);

        // можно объединять по буквам и длинне слова в цифрах
        List <String> resultArrayFinisch = Arrays.stream(carsArray).filter(carname -> carname.startsWith("b") )
                .filter(carname -> carname.length() == 5).collect(Collectors.toList());

        // поиск четных чисел в созданном массиве
        List<Integer> integerList = List.of(1,5,8,12,26,23,90,67);
        List<Integer> evenNumbers = integerList.stream().filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);
    }

} // klass ended
