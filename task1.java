/**
 * program
 * Задание 1
    1.Пусть дан произвольный список целых чисел.
    1) Нужно удалить из него чётные числа + 
    2) Найти минимальное значение +
    3) Найти максимальное значение +
    4) Найти среднее значение
 */

import java.util.ArrayList;
import java.util.Random; 
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan  = new Scanner(System.in);

        System.out.print("Введите длину списка ");

        int length_list = scan.nextInt();

        scan.close();

        for(int i = 0; i < length_list; i++){
            list.add(get_random_number());
        }
        show_method("Список до ", list);
        search_min(list);
        search_max(list);
        search_arithmetic_mean(list);
        list = del(list);
        show_method("Список после", list);
    }

    public static void search_min(ArrayList<Integer> list){
        int min = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if(list.get(i) < min){
                min = list.get(i);
            }
        }
        System.out.printf("\nМинимальное значение: %s ", min);
    }
    public static void search_max(ArrayList<Integer> list){
        int max = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        System.out.printf("\nМаксимальное значение: %s ", max);
    }

    public static void search_arithmetic_mean(ArrayList<Integer> list){
        int sum = list.get(0); 
        for(int i = 1; i < list.size(); i++){
            sum = sum + list.get(i);
        }

        System.out.printf("\nСреднее значение списка = %s ", sum / list.size());
    }

    public static int get_random_number(){
        Random rnd = new Random();
        return rnd.nextInt(0, 100);
    }

    public static ArrayList<Integer> del(ArrayList<Integer> numb_list){
        for(int i = 0; i < numb_list.size(); i++){
            if( i % 2 == 0){
                numb_list.remove(i);
            }
        }
        return numb_list;
    }

    public static void show_method(String str, ArrayList<Integer> list){
        System.out.printf("\n%s %s", str, list);
    }

}