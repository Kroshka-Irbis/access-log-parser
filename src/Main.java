import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int firstNumber = new Scanner(System.in).nextInt();

        System.out.println("Введите второе число: ");
        int secondNumber = new Scanner(System.in).nextInt();

        //Расчет вычислений
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        double quotient = (double) firstNumber / secondNumber;

        //Вывод результатов
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);
    }
}
