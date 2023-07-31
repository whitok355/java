import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Filter {
    
    private Map<String, String> params;
    private Set<Laptop> set_laptop;
    private Set<Laptop> set_filter = new HashSet<>();

    public Filter(Map<String, String> params, Set<Laptop> set_laptop){
        this.params = params;
        this.set_laptop = set_laptop;
    }

    public void filtering(){
        for(Laptop laptop : set_laptop){
            Boolean final_res = false;
            for (Map.Entry<String, String> param : params.entrySet()) {
                String value = param.getValue();
                Boolean res = false;               
                switch(param.getKey()){
                case "ram":
                    if(laptop.get_ram() == Integer.parseInt(value)){
                        res = true;
                    }
                case "memory":
                    if(laptop.get_memory() == Integer.parseInt(value)){
                        res = true;
                    }
                case "os":
                    if(laptop.get_os().equals(value)){
                        res = true;
                    }
                case "color":
                    if(laptop.get_color().equals(value)){
                        res = true;
                    }
              }
              if(res){
                final_res = true;
              } else{
                break;
              }
            }
            if(final_res){
                set_filter.add(laptop);
            }
        }
    }

    public void get_filt_laptops(){
        if(this.set_filter.isEmpty()){
            System.out.print("По Вашим критериям ноутбуки не найдены");
        } else{
            for (Laptop el : this.set_filter) {
                System.out.println();
                System.out.printf("Laptop:  quantity - %s \n price - %s \n os - %s \n processor - %s \n motherboard - %s \n memory - %s Mb\n color - %s \n ram - %s Mb", el.get_quantity(), el.get_price(), el.get_os(), el.get_processor(), el.get_motherboard(), el.get_memory(), el.get_color(), el.get_ram());
            }
        }

    }
}
