package homework5;
// Задание 2.
// Пусть дан список сотрудников:
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Иван Савин
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

// Иван 4, ...
public class task2 {
    public static void main(String[] args) {
        Map<String, Integer> repeatName = new HashMap<String, Integer>();
        ArrayList<String> onlyNames = new ArrayList<String>();
        Set<String> nameSet = new HashSet<String>();
        ArrayList<String> employees = new ArrayList<String>();
        employees.add("Светлана Петрова");
        employees.add("Кристина Белова");
        employees.add("Анна Мусина");
        employees.add("Анна Крутова");
        employees.add("Иван Юрин");
        employees.add("Петр Лыков");
        employees.add("Павел Чернов");
        employees.add("Петр Чернышов");
        employees.add("Мария Федорова");
        employees.add("Марина Светлова");
        employees.add("Иван Савин");
        employees.add("Мария Рыкова");
        employees.add("Марина Лугова");
        employees.add("Анна Владимирова");
        employees.add("Иван Мечников");
        employees.add("Петр Петин");
        employees.add("Иван Ежов");

        for (int i = 0; i < employees.size(); i++) {
            String[] temp = employees.get(i).split(" ");
            onlyNames.add(temp[0]);
            nameSet.add(temp[0]);
        }
        for (String name : nameSet) {
            int count = 0;
            for (String eachName : onlyNames) {
                if(name.equals(eachName)) {
                    count++;
                }
            }
            repeatName.put(name, count);
        }
        for (String item : repeatName.keySet()) {
            System.out.println(item + " " + repeatName.get(item));
        }
        System.out.println("\nРейтинг по популярности имени: ");
        
        // Сортировка по популярности
        List<Map.Entry<String, Integer>> list = new ArrayList<>(repeatName.entrySet());
       

        list
            .stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .forEach(System.out::println);
    }
   

}
