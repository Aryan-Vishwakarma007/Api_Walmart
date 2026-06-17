import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class Service {
    private List<Item_Entries> products = new ArrayList<>(List.of(
            new Item_Entries(1, "TV", "electronics", 499),
            new Item_Entries(2, "Shirt", "clothing", 29),
            new Item_Entries(3, "Laptop", "electronics", 999)
    ));

    public Item_Entries search_id(){

    }

}
