import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Params {
    
    public Map <String, String> set_param(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите параметры для фильтрации \n 1 - ОЗУ\n 2 - Объем ЖД\n 3 - Операционная система\n 4 - Цвет");
        System.out.println();
        String line = scan.nextLine();

        String[] line_arr = line.split("");

        Map <String, String> params= new HashMap<>();
        
        for(int i = 0; i < line_arr.length; i++){
            String min_value;
            if(Integer.parseInt((line_arr[i])) == 1){
                System.out.print("\nУкажите минимальное значение ОЗУ для фильтрации : ");
                min_value = scan.nextLine();
                params.put("ram", min_value);
            } else if(Integer.parseInt((line_arr[i])) == 2){
                System.out.print("\nУкажите минимальное значение Объема памяти жесткого диска для фильтрации : ");
                min_value = scan.nextLine();
                params.put("memory", min_value);
            } else if(Integer.parseInt((line_arr[i])) == 3){
                System.out.print("\nУкажите os - операционную систему для фильтрации : ");
                min_value = scan.nextLine();
                params.put("os", min_value);
            } else if(Integer.parseInt((line_arr[i])) == 4){
                System.out.print("\nУкажите цвет для фильтрации : ");
                min_value = scan.nextLine();
                params.put("color", min_value);
            } else{
                System.out.printf("\n%s параметра с таким номером нет", line_arr[i]);
            }
        }
        return params;
    }
}
