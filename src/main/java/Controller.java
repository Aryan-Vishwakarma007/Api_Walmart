import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("/search")
public class Controller {

    @Autowired
    private Service service;

    @GetMapping("id/{myId}")
    public Item_Entries get_by_id(@PathVariable int myId){
        return service.search_id(myId);
    }
    @GetMapping("/param")
    public Item_Entries get_by_category(@RequestParam String cat){
        return service.
    }
}
