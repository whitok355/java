import java.util.Scanner;

/**
 * task3
 * 3) Реализовать простой калькулятор
 */

public class task3 {
    public static void main(String[] args) {
        Scanner isScanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int first = isScanner.nextInt();

        System.out.print("Введите первое операцию + - * /: ");
        char operation = isScanner.next().charAt(0);

        System.out.print("Введите первое число: ");
        int second = isScanner.nextInt();
        int sum = 0;
        isScanner.close();

        switch(operation){
            case '+':
                sum = first + second;
                break;
            case '-':
                sum = first - second;
                break;
            case '*':
                sum = first * second;
                break;
            case '/':
                sum = first / second;
                break;
        };
        System.out.printf("Результат вычисления = %d", sum);
    }
}