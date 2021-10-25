package nextdesafio.database;

import org.springframework.data.jpa.repository.JpaRepository;

import nextdesafio.entity.CCentroCusto;

public interface RepositoryCCentroCusto extends JpaRepository<CCentroCusto, Integer> {
    
}
