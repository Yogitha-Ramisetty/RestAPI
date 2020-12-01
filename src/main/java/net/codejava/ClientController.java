package net.codejava;
import java.util.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class ClientController {
	
	@Autowired
	private ClientService service;
	

	// RESTful API method for Create operation
	@PostMapping("/clientinfo")
	public void add(@RequestBody Clientinfo clientinfo) {
	    service.save(clientinfo);
	}
	
	// RESTful API methods for Retrieval operations
	@GetMapping("/clientinfo")
	public List<Clientinfo> list(){
		return service.listAll();
	}
	
	// RESTful API methods for Retrieval operation based on Id
	@GetMapping("/clientinfo/{id}")
	public ResponseEntity<Clientinfo> get(@PathVariable Integer id) {
	    try {
	        Clientinfo clientinfo = service.get(id);
	        return new ResponseEntity<Clientinfo>(clientinfo, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Clientinfo>(HttpStatus.NOT_FOUND);
	    }      
	}
	    
    // RESTful API method for Delete operation
	@DeleteMapping("/clientinfo/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
}
