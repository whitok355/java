import java.util.ArrayList;
import java.util.List;

/**
 * task2
 *2) Вывести все простые числа от 1 до 1000
 */

public class task2 {

    public static void main(String[] args) {
        int max = 1000;
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= max; i++) {
            boolean isPrime = true;

            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                primes.add(i);
            }
        }
        System.out.println("Простые числа: " + primes);
    }
}