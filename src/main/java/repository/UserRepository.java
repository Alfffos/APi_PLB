package repository;

import entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    //En el repository no hay nada hardcoeado ya uso los metodos extendidos de JPARepository para usarlos en el service.
}
