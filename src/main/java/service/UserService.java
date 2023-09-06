package service;

import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;                  //creo que esto seria como la inyeccion de dependencia en .net

    public void newUser(User user){                 // este metodo recibe un User
        userRepository.save(user);                 // uso el metodo save(que esta en el repository para guardar el usuario en la base de datos.
    }
}
