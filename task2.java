/**
 * task2.
 * Задание 2
    Для списка из задачи про Солнечную систему удалить все повторяющиеся элементы.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;
public class task2 {

    public static void main(String[] args) {
        planetsCounter(9);
    }

    public static void planetsCounter(int n){
        List<String> list_planets = List.of("Mercury", "venus", "Mars", "Eatrh", "Saturn", "Jupiter" );
        List<String> rand_planets = new ArrayList<String>(n);

        int[] counts = new int[list_planets.size()];

        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
                rand_planets.add(list_planets.get(rnd.nextInt(list_planets.size())));
                System.out.print(rand_planets.get(i) + " ");
                counts[list_planets.indexOf(rand_planets.get(i))]++;
            }
        System.out.println();
           
        for (int i = 0; i < counts.length; i++) {
            System.out.printf(" %s - %s\n", list_planets.get(i), counts[i]);
        }
        rand_planets = remove_replay(rand_planets);
        System.out.print(rand_planets);
    }

    public static List<String> remove_replay (List<String> planets) {
        Set<String> set = new HashSet<>(planets);
        planets.clear();
        planets.addAll(set);
        return planets;
    }
}