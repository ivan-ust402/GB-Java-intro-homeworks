package homework3;

import java.util.ArrayList;
import java.util.Random;

// Задание 3 *.
// Реализовать алгоритм сортировки пузырьком

public class task3 {
    public static void main(String[] args) {
        int initialCapacity = 20;
        ArrayList<Integer> numberList = new ArrayList<>(initialCapacity);
        Random randomNumber = new Random();

        for (int i = 0; i < initialCapacity; i++) {
            numberList.add(randomNumber.nextInt(100));
        }

        System.out.println(numberList);

        for (int j = numberList.size(); j > 0; j--) {
            for (int i = 0; i < numberList.size() - 1; i++) {
                if (numberList.get(i) > numberList.get(i+1)) {
                    int temp = numberList.get(i);
                    numberList.set(i, numberList.get(i+1));
                    numberList.set(i+1, temp);
                }
            }
        }
        
        System.out.println(numberList);
    }
}
