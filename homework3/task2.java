package homework3;

import java.util.ArrayList;
import java.util.Random;

// Задание 2:
// Создать список целых чисел (заполнить случайными числами).
// Найти минимальное, максимальное и среднее из этого списка.

public class task2 {
    public static void main(String[] args) {
        int initialCapacity = 20;
        ArrayList<Integer> numberList = new ArrayList<>(initialCapacity);
        Random randomNumber = new Random();
        for (int i = 0; i < initialCapacity; i++) {
            numberList.add(randomNumber.nextInt(100));
        }

        System.out.println(numberList);

        int maxValue = numberList.get(0);
        int minValue = numberList.get(0);
        for (int i = 0; i < numberList.size(); i++) {
            int currentValue = numberList.get(i);
            if (currentValue > maxValue) {
                maxValue = currentValue;
            }
            if (currentValue < minValue) {
                minValue = currentValue;
            }
        }
        int averageValue = (maxValue - minValue) / 2;

        System.out.printf("maxValue = %d\n", maxValue);
        System.out.printf("minValue = %d\n", minValue);
        // System.out.printf("averageValue = %d\n", averageValue);

        if (numberList.contains(averageValue)) {
            System.out.printf("averageValue = %d\n", averageValue);
        } else {
            int firstAvVal = averageValue;
            int secondAvVal = averageValue;
            for (int i = averageValue; i < maxValue; i++) {
                if (numberList.contains(i)) {
                    firstAvVal = i;
                    break;
                }
            }
            for (int i = averageValue; i > minValue; i--) {
                if (numberList.contains(i)) {
                    secondAvVal = i;
                    break;
                }
            }

            int diffFirst = firstAvVal - averageValue;
            // System.out.println(diffFirst);
            int diffSecond = averageValue - secondAvVal;
            // System.out.println(diffSecond);
            if (diffFirst > diffSecond) {
                System.out.printf("averageValue = %d\n",secondAvVal);
            } else {
                System.out.printf("averageValue = %d\n",firstAvVal);
            }
            
            
        }
    }
}
