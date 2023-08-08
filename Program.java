import java.io.IOException;
import java.util.Random;

public class Program {
    public static void main(String[] args) throws IOException {
        String[] name = {"Кукла", "Машинка", "Лего", "Пистолекти", "Скакалка", "Пианино", "Барабан", "Самолетик", "Расскраска", "Попрыгунчик"};
        double[] weight = {10.3, 3.3, 5.6, 2.3, 5.7, 1.3, 2.3, 9.8, 2.1, 4.3};

        ToyStore store = new ToyStore();
        Integer max = 10;

        for(int i = 0; i < 10; i++){
            store.addToy(i, name[get_random(max)], get_random(max), weight[get_random(max)]);
        }
        
        //store.show_toys();

        for(int i = 0; i < 10; i++){
            store.play();
            store.getPrizeToy();
        }
    }

    public static Integer get_random(Integer max){
        Random rand = new Random();

        return rand.nextInt(max);
    }

}