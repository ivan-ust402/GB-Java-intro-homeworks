import java.util.Scanner;

// Задание 1.
// Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n
public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "Cp866");
        try {
            System.out.println("Введите число: ");
            int number = scan.nextInt();
            int resultSum = sum(number);
            int resultFactorial = factorial(number);
            System.out.printf("Вы ввели число: %d\n", number);
            System.out.printf("Сумма чисел от 1 до %d = %d\n",number, resultSum);
            System.out.printf("Факториал числа %d! = %d\n", number, resultFactorial);
        }
        finally {
            scan.close();
        }
    }
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n-1);
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}