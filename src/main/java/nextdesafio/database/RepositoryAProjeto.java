package nextdesafio.database;

import org.springframework.data.jpa.repository.JpaRepository;

import nextdesafio.entity.AProjeto;

public interface RepositoryAProjeto extends JpaRepository<AProjeto, String> {
    
}
