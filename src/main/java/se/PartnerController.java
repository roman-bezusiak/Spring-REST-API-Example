package se;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PartnerController {
	@Autowired
	private PartnerRepository repository;

    // TEST method
    @RequestMapping("/test")
    public String test (@RequestParam(value = "name", defaultValue = "World") String name) {
        return "{\"id\":\"hello\"}";
    }
    
    // FIND_ALL method
    @RequestMapping("/partners")
    public Iterable<Partner> partners (@RequestParam(value = "name", defaultValue = "World") String name) {
        return repository.findAll();
    }

    // GET method (get)
    @RequestMapping("/partner/{id}")
    public Partner get (@PathVariable("id") int id) {
        return repository.findOne(id);
    }

    // POST method (create)
    @RequestMapping(value = "/partner", method = RequestMethod.POST)
    public @ResponseBody Partner create (@RequestBody Partner item) {
    	return repository.save(item);
    }

    // PUT method (update)
    @RequestMapping(value = "/partner", method = RequestMethod.PUT)
    public @ResponseBody Partner update (@RequestBody Partner item) {
    	return repository.save(item);
    }

    // DELETE method (delete)
    @RequestMapping(value = "/partner", method = RequestMethod.DELETE)
    public void delete (@RequestBody Partner item) {
    	repository.delete(item);
    }
}
