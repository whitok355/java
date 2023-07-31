import java.util.Set;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Program {
    public static void main(String[] args) {

        Double[] arr_price = {400.32, 123.45, 43.41, 900.32};
        String[] arr_os = {"Windows", "Astra linux", "Linux", "Debian"};
        String[] arr_processor = {"INTEL PENTIUM", "Intel Core", "AMD Ryzen", "No brand"};
        String[] arr_motherboard = {"MSI B450-A PRO MAX AM4, ATX", "ASRock B450M-HDV R4.0", "MSI H510M-A PRO", "No brand"};
        String[] arr_color = {"blue", "red", "orange", "green"};
        Integer[] arr_memory = {512, 4056, 2048, 16224};
        Integer[] arr_ram = {128, 256, 512, 1024};

        Set<Laptop> set_laptop = new HashSet<>();

        for(int i = 0; i < 10; i++){
            Laptop lapt = new Laptop(
                arr_price[get_random(arr_price.length)], 
                get_random(arr_price.length),
                arr_os[get_random(arr_price.length)], 
                arr_processor[get_random(arr_price.length)], 
                arr_motherboard[get_random(arr_price.length)], 
                arr_memory[get_random(arr_price.length)], 
                arr_color[get_random(arr_price.length)], 
                arr_ram[get_random(arr_price.length)]
            );
            set_laptop.add(lapt);
        }

        Params params = new Params();

        Filter filter_set = new Filter(params.set_param(), set_laptop);
        filter_set.filtering();
        filter_set.get_filt_laptops();
    }

    public static Integer get_random(Integer max){
        Random rand = new Random();
        return rand.nextInt(max);
    }
    

}
