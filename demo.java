/*
Реализуйте класс Cat, включающий в себя от трех полей и от двух методов, 
определяющих базовый функционал класса(за основу можно взять наработки с семинара). 
Создать два экземпляра класса Cat и вывести информацию о них на экран.
 * 
 * Поля
 * Кличка - String
 * Возраст - Integer
 * Пол - String
 * Вес - Double
 * Окрас - String
 * Награды - Boolean
 * 
 * Методы
 * Поздароваться с котом
 * Погладить кота, чтобы он мяукнул
 */

public class demo {

    public static void main(String[] args) {

        Cat[] cats = {
            new Cat("Барсик", 12, "мальчик", 12.3, "белый", false),
            new Cat("Мурзик", 3, "девочка", 5.2, "черный", true),
        };

        for(int i = 0; i < cats.length; i++){
            if(cats[i].awards){
                System.out.printf("\nЭтого кота зовут %s, пол %s, его возраст %s и окрас %s. Мы  участвуем в соревнованиях и у нас есть награды", cats[i].nickname, cats[i].gender, cats[i].age, cats[i].color, cats[i].weight, cats[i].awards);
            } else {
                System.out.printf("\nЭтого кота зовут %s, пол %s, его возраст %s и окрас %s. Мы не участвуем в соревнованиях и у нас нет наград", cats[i].nickname, cats[i].gender, cats[i].age, cats[i].color, cats[i].weight, cats[i].awards);
            }

        }
    }
    
}

class Cat{
    String nickname;
    Integer age;
    String gender;
    Double weight;
    String color;
    Boolean awards;

    public Cat(String nickname, Integer age, String gender, Double weight, String color, Boolean awards){
        this.nickname = nickname;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.color = color;
        this.awards = awards;
    }

    public void hello(){
        System.out.printf("Hello my pretty cat %s", this.nickname);
    }

    public void meow(){
        System.out.printf("котик по кличке %s - Meow Meow Meow.....", this.nickname);
    }

    public void show_awards(){
        if(this.awards){
            System.out.printf("Да, ты прав у кота %s имеются награды", this.nickname);
        } else{
            System.out.printf("нет, у кота %s нет наград", this.nickname);            
        }
    }
}
