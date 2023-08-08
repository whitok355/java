public class Toy {
    private int id;
    private String name;
    private int quantity;
    private double weight;

    public Toy(int id, String name, int quantity, double weight){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }

    public int get_id(){
        return this.id;
    }
    public String get_name(){
        return this.name;
    }
    public int get_quantity(){
        return this.quantity;
    }
    public double get_weight(){
        return this.weight;
    }

    public void set_id(int value){
        this.id = value;
    }
    public void set_name(String value){
        this.name = value;
    }
    public void set_quantity(int value){
        this.quantity = value;
    }
    public void set_weight(double value){
        this.weight = value;
    }
}
