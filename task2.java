// 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.logging.*;

public class task2 {

    public static void main(String[] args) throws IOException{
        Logger logger = Logger.getLogger(task2.class.getName());
        FileHandler fh = new FileHandler("logTask2.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        int [] arr = {1,2,5,7,8,3,1,4,6,8,3,2,4,6};
        for(int k = 0; k < arr.length-1; k++){
                    for(int i = k+1; i < arr.length - 1; i++){
                        if(arr[k] > arr[i]){
                            int temp = arr[i];
                            arr[i] = arr[k];
                            arr[k] = temp;

                            logger.info("Sort item in array");
                        }
                    }
                } 

    }

}
