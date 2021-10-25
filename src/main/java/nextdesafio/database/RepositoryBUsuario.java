package nextdesafio.database;

import org.springframework.data.jpa.repository.JpaRepository;

import nextdesafio.entity.BUsuario;

public interface RepositoryBUsuario extends JpaRepository<BUsuario, Integer>{
    
}
