package exper.jdbc.OracleExperiment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {
    @Autowired
    Repos rep;
    @PostMapping("/")
    public String added(@RequestBody Hai hai){
        return rep.save(hai).getName()+" has added";
    }
    @GetMapping("/")
    public List<Hai> show(){
        return rep.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Hai> getOne(@PathVariable("id") int id){
        return rep.findById(id);
    }
}
