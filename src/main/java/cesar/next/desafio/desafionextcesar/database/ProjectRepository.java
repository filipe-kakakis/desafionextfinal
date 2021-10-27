package cesar.next.desafio.desafionextcesar.database;

import org.springframework.data.jpa.repository.JpaRepository;

import cesar.next.desafio.desafionextcesar.Ententies.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>{
    
}
