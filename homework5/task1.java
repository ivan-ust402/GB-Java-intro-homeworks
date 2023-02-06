package homework5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Задание 1.
// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "Cp866");
        Map<String, ArrayList<Integer>> phoneBook = new HashMap<String, ArrayList<Integer>>();
        while(true) {
            System.out.println("Введите имя и фамилию:");
            String name = scan.nextLine();
            ArrayList<Integer> phoneArr = new ArrayList<Integer>();
            while(true) {
                System.out.println("Введите номер телефона:");
                String phone = scan.nextLine();
                phoneArr.add(Integer.parseInt(phone));
                System.out.println("Добавить еще номер телефона? Если нет введите: нет");
                String confirm2 = scan.nextLine().trim().toLowerCase();
                System.out.println(confirm2);
                if (confirm2.equals("нет")) {
                    break;
                }
            }
            phoneBook.put(name, phoneArr);
            System.out.println("Добавить еще контакт? Если нет введите: нет");
            String confirm1 = scan.nextLine().trim().toLowerCase();
            if (confirm1.equals("нет")) {
                break;
            }
        }
        System.out.println("Ваша телефонная книга:");
        for (String item : phoneBook.keySet()) {
            System.out.printf("\n%s: \n", item);
            for (int i = 0; i < phoneBook.get(item).size(); i++) {
                System.out.println(phoneBook.get(item).get(i));
            }
        }
        scan.close();
    }
}
