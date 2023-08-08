import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyStore {

    private List<Toy> list;
    private List<Toy> prizeToys;

    public ToyStore(){
        this.list = new ArrayList<>();
        this.prizeToys = new ArrayList<>();
    }
    public void addToy(int id, String name, int quantity, double weight){
        Toy toy = new Toy(id, name, quantity, weight);
        this.list.add(toy);
    }

    public void show_toys(){
        for(Toy toy: this.list){
            System.out.printf("\n%s %s %s %s", toy.get_id(), toy.get_name(), toy.get_quantity(), toy.get_weight());
        }
    }

    public void play() {
        // calculate total weight
        double totalWeight = 0;
        for (Toy toy : this.list) {
            totalWeight += toy.get_weight();
        }

        // generate random number
        Random rand = new Random();
        double randomNumber = rand.nextDouble() * totalWeight;

        // find the prize toy
        Toy prizeToy = null;
        for (Toy toy : this.list) {
            if (randomNumber < toy.get_weight()) {
                prizeToy = toy;
                break;
            }
            randomNumber -= toy.get_weight();
        }

        // add the prize toy to the list of prize toys
        if (prizeToy != null && prizeToy.get_quantity() > 0) {
            prizeToys.add(prizeToy);

            // decrement the quantity of the prize toy
            prizeToy.set_quantity(prizeToy.get_quantity() - 1);
        }
    }

    public void getPrizeToy() throws IOException {
        if (prizeToys.size() > 0) {
            // remove the first prize toy from the list of prize toys
            Toy prizeToy = prizeToys.remove(0);

            // write the prize toy to a file
            FileWriter writer = new FileWriter("prize_toys.txt", true);
            writer.write(prizeToy.get_id() + "," + prizeToy.get_name() + "\n");
            writer.close();
        }
    }

}
