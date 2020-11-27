package net.codejava;
 
import java.util.List;
 
import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
@Transactional
public class ClientService {
 
    @Autowired
    private ClientRepository repo;
     
    public List<Clientinfo> listAll() {
        return repo.findAll();
    }
     
    public void save(Clientinfo product) {
        repo.save(product);
    }
     
    public Clientinfo get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}