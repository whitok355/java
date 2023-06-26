import java.util.Scanner;

/**
 * task1
 * 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */

public class task1 {

    public static void main(String[] args) {

        Scanner isScanner = new Scanner(System.in);

        System.out.printf("Введите первое число:");

        int number = isScanner.nextInt();

        System.out.printf("Треугольное число: %d\n", getTriangleNumber(number));
    
        isScanner.close();
    }

    public static int getTriangleNumber(int numb) {
        return (numb * (numb + 1)) / 2;
    }
}