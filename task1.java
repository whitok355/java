// Формат сдачи: ссылка на подписанный git-проект.

// Задание

// 1) Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
// 1 Расширение файла: txt
// 2 Расширение файла: pdf
// 3 Расширение файла:
// 4 Расширение файла: jpg

// 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.


/**
 * program
 */
import java.io.File;
import java.util.List;
import java.util.ArrayList;

public class task1 {

    public static void main(String[]args) {
        List<String> files = get_files();
        for(String file : files){
            String extension = get_extension(file);
            System.out.printf(" формат файла: %s ", extension == "" ? "отвутствует" : extension);
        }
    }   


    public static String get_extension(String file_name) {
        int index = file_name.lastIndexOf(".");
        if(index == - 1){
            return "";
        }
        return file_name.substring(index + 1);
    }

    public static List<String> get_files () {
        File pathProject = new File ("user.dir");
        File[] files;
        try{
            files = pathProject.listFiles();
        } catch(Exception ex) {
            ex.printStackTrace();
            return null;
        }

        if(files == null){
            return null;
        }

        List<String> fileList = new ArrayList<String>();

        for (File file : files){
            if(file.isFile()){
                fileList.add(file.getName());
            }
        }
        return fileList;
    }
}
