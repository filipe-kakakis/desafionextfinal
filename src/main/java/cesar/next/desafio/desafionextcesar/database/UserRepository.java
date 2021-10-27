package cesar.next.desafio.desafionextcesar.database;

import org.springframework.data.jpa.repository.JpaRepository;

import cesar.next.desafio.desafionextcesar.Ententies.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
