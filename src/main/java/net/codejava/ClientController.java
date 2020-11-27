package net.codejava;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ClientController {
	@Autowired
	private ClientService service;
	@GetMapping("/clients")
	public List<Clientinfo> list(){
		return service.listAll();
	}
}
