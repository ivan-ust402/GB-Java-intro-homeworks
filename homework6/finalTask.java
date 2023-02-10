package homework6;

import java.util.HashSet;
import java.util.Scanner;


public class finalTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "Cp866"); 
        HashSet<Laptop> laptopDB = new HashSet<>();

        // Создаем экземпляры класса
        Laptop laptop0 = new Laptop(0, "DEXP", "Aquilon", "silver", "Intel Celeron N4020",  2, 1.1, 4, "SSD", 128, "Win10", 14, "1920X1080", "IPS", 15999);
        Laptop laptop1 = new Laptop(1, "Irbis", "NB257", "black", "Intel Celeron 3350", 2, 1.1, 4, "eMMC", 64, "Win10", 14, "1366X768", "IPS", 15999);
        Laptop laptop2 = new Laptop(2, "Digma", "EVE 14 C414", "black", "Intel Celeron N4020", 2, 1.1, 4, "eMMC", 64, "Win10", 14.1, "1920X1080", "IPS", 17999);
        Laptop laptop3 = new Laptop(3, "DEXP", "Aquilon", "silver", "Intel Celeron N4020", 2, 1.1, 8, "SSD", 128, "Win11", 15.6, "1920X1080", "IPS", 18499);
        Laptop laptop4 = new Laptop(4, "Asus", "Laptop 15 D543MA-DM1368", "white", "Intel Celeron N4020", 2, 1.1, 4, "HDD", 1000, "", 15.6, "1920X1080", "IPS", 21999);
        Laptop laptop5 = new Laptop(5, "Acer", "Extensa 15 EX215-31-C3FF", "black", "Intel Celeron N4020", 2, 1.1, 4, "SSD", 128, "", 15.6, "1920X1080", "TN+film", 22999);
        Laptop laptop6 = new Laptop(6, "HP", "255 G8", "silver", "AMD Athlon Gold 3150U", 2, 2.4, 4, "HDD", 1000, "", 15.6, "1366X768", "TN+film", 22999);
        Laptop laptop7 = new Laptop(7, "Asus", "Laptop 15 F515KA-BR110W", "silver", "Intel Celeron N4500", 2, 1.1, 4, "SSD", 128, "Win11", 15.6, "1366X768", "TN+film", 27999);
        Laptop laptop8 = new Laptop(8, "Apple", "MacBook Air", "silver", "Apple M1", 8, 3.2, 16, "SSD", 1000, "MacOS", 13.3, "2560X1600", "IPS", 151999);
        Laptop laptop9 = new Laptop(9, "Apple", "MacBook Pro 16", "silver", "Apple M2 Pro 12C", 12, 3.2, 16, "SSD", 512, "MacOS", 16, "3456X2234", "IPS", 259999);

        laptopDB.add(laptop0);
        laptopDB.add(laptop1);
        laptopDB.add(laptop2);
        laptopDB.add(laptop3);
        laptopDB.add(laptop4);
        laptopDB.add(laptop5);
        laptopDB.add(laptop6);
        laptopDB.add(laptop7);
        laptopDB.add(laptop8);
        laptopDB.add(laptop9);

        try {
            while (true) {
                // Меню пользователя:
                System.out.println("Добро пожаловать в каталог ноутбуков!");
                System.out.println("Выберите действие:");
                System.out.println("1 - Печать всех товаров");
                System.out.println("2 - Поиск по каталогу");
                System.out.println("0 - Выход");
                int firstInput;
                String fInput = scan.nextLine();
                if (fInput.isEmpty() || !fInput.matches("[-+]?\\d+")){
                    firstInput = 3;
                } else {
                    firstInput = Integer.parseInt(fInput);
                }
                if (firstInput == 1) {
                    System.out.println(laptopDB);
                } else if (firstInput == 2) {
                    while (true) {
                        System.out.println("Введите цифру, соответствующую критерию поиска:");
                        System.out.println("1 - Производитель");
                        System.out.println("2 - Цвет");
                        System.out.println("3 - Количество ядер");
                        System.out.println("4 - RAM");
                        System.out.println("5 - Вид памяти");
                        System.out.println("6 - Объем HD");
                        System.out.println("7 - ОС");
                        System.out.println("8 - Размер экрана");
                        System.out.println("9 - Цена");
                        System.out.println("0 - Выход в предыдущее меню");
                        String sInput = scan.nextLine();
                        int secondInput;
                        if (sInput.isEmpty() || !sInput.matches("[-+]?\\d+")){
                            secondInput = 10;
                        } else {
                            secondInput = Integer.parseInt(sInput);
                        }
                        
                        String filter = new String();
    
                        switch(secondInput) {
                            case 0: filter = "-1";
                                    break;
                            case 1: System.out.println("Введите производителя: ");
                                    filter = scan.nextLine();
                                    break;
                            case 2: System.out.println("Введите цвет: ");
                                    filter = scan.nextLine();
                                    break;
                            case 3: System.out.println("Введите кол-во ядер: ");
                                    filter = scan.nextLine();
                                    break;
                            case 4: System.out.println("Введите размер RAM: ");
                                    filter = scan.nextLine();
                                    break;
                            case 5: System.out.println("Введите вид HD: ");
                                    filter = scan.nextLine();
                                    break;
                            case 6: System.out.println("Введите объем HD: ");
                                    filter = scan.nextLine();
                                    break;
                            case 7: System.out.println("Введите ОС: ");
                                    filter = scan.nextLine();
                                    break;
                            case 8: System.out.println("Введите размер диагонали: ");
                                    filter = scan.nextLine();
                                    break;
                            case 9: System.out.println("Введите цену: ");
                                    filter = scan.nextLine();
                                    break;
                            default: filter = "-2";
    
                        }
    
                        if (filter.equals("-1")) {
                            System.out.println("Выходим в предыдущее меню...");
                            break;
                        } else if (filter.equals("-2")) {
                            System.out.println("Вы ввели некорректное значение!");
                            System.out.println("Попробуйте снова.");
                            continue;
                        } else {
                            HashSet<Laptop> res = Laptop.findLaptopByParam(laptopDB, secondInput, filter.trim().toLowerCase());
                            if (res.isEmpty()) {
                                System.out.println("Ничего не найдено по вашему критерию!");
                            } else {
                                for (Laptop item : res) {
                                    System.out.println("Производитель: " + 
                                        item.manufacturer 
                                        + ", Модель: " + item.model
                                        + ", Цена: " + item.price);
                                }
                                
                            }
                        }

                        System.out.println("Хотите попробовать снова? (да/нет)");
                        String thirdInput = scan.nextLine().trim().toLowerCase();
                        if (thirdInput.equals("нет")) {
                            break;
                        } else {
                            continue;
                        }
                    }

                } else if (firstInput == 0) {
                    System.out.println("Выход из программы...");
                    break;
                } else {
                    System.out.println("Вы ввели невалидное значение!");
                    System.out.println("Попробуйте снова.");
                    continue;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            scan.close();
        }

    }
}
