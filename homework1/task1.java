import java.util.Scanner;

// Задание 1.
// Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n
public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "Cp866");
        try {
            System.out.println("Введите число: ");
            int number = scan.nextInt();
            int result = factorial(number);
            System.out.println(result);
        }
        finally {
            scan.close();
        }
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}