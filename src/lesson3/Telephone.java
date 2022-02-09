package lesson3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;


 public class Telephone {
     private Map<String, List<String>> Telephone_hm = new HashMap<>();

    private List<String> phone_number_list;

    public void add(String name, String phone_number) {
        if (Telephone_hm.containsKey(name)) {
            phone_number_list = Telephone_hm.get(name);
            phone_number_list.add(phone_number);
            Telephone_hm.put(name, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            Telephone_hm.put(name, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return Telephone_hm.get(surname);
    }

}

