import java.io.IOError;
import java.util.InputMismatchException;
import java.util.Scanner;

// Задание 3.
// Реализовать простой калькулятор (операции + - / * )
// Пример работы программы:

// Введите число 1: 2
// Введите число 2: 3
// Введите операцию: +
// Ответ: 5
// Введите число 1: 2
// Введите число 2: 3
// Введите операцию: а
// Ответ: Такой операции нет
public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Введите операцию(+, -, /, *): ");
            String operator = scan.nextLine();
            if (
                !operator.equals("+") 
                && !operator.equals("-") 
                && !operator.equals("/") 
                && !operator.equals("*")
                ) {
                throw new Error("Вы ввели некорректный оператор!");
            }
            System.out.println("Введите первое число:");
            int number1 = scan.nextInt();
            System.out.println("Введите второе число:");
            int number2 = scan.nextInt();
            if (operator.equals("/") && number2 == 0) {
                throw new Error("Вы ввели вторым числом ноль, а на ноль делить нельзя!");
            }

            switch(operator) {
                case "+":
                    System.out.printf("Cумма %d + %d = %d", number1, number2, sum(number1, number2));
                    break;
                case "-":
                    System.out.printf("Вычитание чисел %d - %d = %d", number1, number2, diff(number1, number2));
                    break;
                case "/":
                    System.out.printf("Деление %d / %d = %d", number1, number2, div(number1, number2));
                    break;
                case "*":
                    System.out.printf("Умножение %d * %d = %d", number1, number2, mult(number1, number2));
                    break;
            }
        } catch (IOError err) {
            System.out.println(err.getMessage());
        } catch (InputMismatchException h) {
            System.out.println(h);
            System.out.println("Вы ввели не число!");
        }
        finally {
            scan.close();
        }
    }
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int diff(int a, int b) {
        return a - b;
    }
    public static int div(int a, int b) {
        return a / b;
    }
    public static int mult(int a, int b) {
        return a * b;
    }
}
