package homework3;

import java.util.ArrayList;
// import java.util.Collections;
import java.util.Random;

// Задание 1.
// Создать список целых чисел (заполнить случайными числами), удалить из списка четные числа.

public class task1 {
    public static void main(String[] args) {
        int initialCapacity = 20;
        ArrayList<Integer> initList = new ArrayList<Integer>(initialCapacity);
        Random randomNumber = new Random();
        for (int i = 0; i < initialCapacity; i++) {
            initList.add(randomNumber.nextInt(100));
        }
        System.out.println(initList);
        // Collections.sort(initList);
        // System.out.println(initList);

        for (int i = 0; i < initList.size(); i++) {
            if (initList.get(i) % 2 == 0) {
                initList.remove(i);
                i--;
            }
        }

        System.out.println(initList);
    }
}
