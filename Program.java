import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;

public class Program{
    public static void main(String[] args) {
        Queue<Integer> qu1 = new LinkedList<>();
        Queue<Integer> qu2 = new LinkedList<>();

        qu1.add(get_random_numb(-10,10));
        qu2.add(get_random_numb(-10,10));

        System.out.print(task1(qu1, qu2));
        System.out.print(task2(qu1, qu2));
    }

    public static Integer get_random_numb(Integer min, Integer max){
        Random rnd = new Random();
        return rnd.nextInt(min, max);
    }

    //1) Умножьте два числа и верните произведение в виде связанного списка.
    public static LinkedList<Integer> task1(Queue<Integer> val1, Queue<Integer> val2){
        LinkedList<Integer> res = new LinkedList<>();
        res.add(val1.peek() * val2.peek());
        return res;
    }

    //2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными.

    public static LinkedList<Integer> task2(Queue<Integer> val1, Queue<Integer> val2){
        LinkedList<Integer> res = new LinkedList<>();
        res.add(val1.peek() + val2.peek());
        return res;
    }
}