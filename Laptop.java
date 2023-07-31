// Урок 6. Хранение и обработка данных ч3: множество коллекций Set
// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ

// 2 - Объем ЖД

// 3 - Операционная система

// 4 - Цвет …

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

/**
 * Laptop
 */
public class Laptop {

    private Double price;
    private Integer quantity;
    private String os;
    private String processor;
    private String motherboard;
    private Integer memory;
    private String color;
    private Integer ram;

    public Laptop(Double price, Integer quantity, String os, String processor, String motherboard, Integer memory, String color, Integer ram){
        this.price = price;
        this.quantity = quantity;
        this.os = os;
        this.processor = processor;
        this.motherboard = motherboard;
        this.memory = memory;
        this.color = color;
        this.ram = ram;
    }

    public Double get_price(){
        return this.price;
    }

    public Integer get_quantity(){
        return this.quantity;
    }

    public String get_os(){
        return this.os;
    }

    public String get_processor(){
        return this.processor;
    }

    public String get_motherboard(){
        return this.motherboard;
    }

    public Integer get_memory(){
        return this.memory;
    }
    public String get_color(){
        return this.color;
    }
    public Integer get_ram(){
        return this.ram;
    }

    

}