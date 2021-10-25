package nextdesafio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nextdesafio.database.RepositoryAProjeto;
import nextdesafio.entity.AProjeto;

@RestController
@RequestMapping("/projeto")
public class AProjetoRest {
    @Autowired
    private RepositoryAProjeto repositoryAProjeto;
    
    @GetMapping ("/projeto")
    public List<AProjeto> list(){
        return repositoryAProjeto.findAll();
    }
    @PostMapping ("/projeto")
    public void salvar(@RequestBody AProjeto aprojeto){
        repositoryAProjeto.save(aprojeto);
    }
}
