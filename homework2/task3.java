package homework2;
// Задание 3 *.
// К калькулятору из предыдущего дз добавить логирование.

import java.io.IOError;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Logger logger = Logger.getLogger(task3.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler info = new ConsoleHandler();
        logger.addHandler(info);
        SimpleFormatter sFormat = new SimpleFormatter();
        info.setFormatter(sFormat);
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
                    System.out.printf("Cумма %d + %d = %d\n", number1, number2, sum(number1, number2));
                    logger.info(number1 + " + " + number2 + " = " + sum(number1, number2));
                    break;
                case "-":
                    System.out.printf("Вычитание чисел %d - %d = %d\n", number1, number2, diff(number1, number2));
                    logger.info(number1 + " - " + number2 + " = " + diff(number1, number2));
                    break;
                case "/":
                    System.out.printf("Деление %d / %d = %.2f\n", number1, number2, div(number1, number2));
                    logger.info(number1 + " / " + number2 + " = " + div(number1, number2));
                    break;
                case "*":
                    System.out.printf("Умножение %d * %d = %d\n", number1, number2, mult(number1, number2));
                    logger.info(number1 + " * " + number2 + " = " + mult(number1, number2));
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
    public static double div(int a, int b) {
        return (double)a / (double)b;
    }
    public static int mult(int a, int b) {
        return a * b;
    }
}

