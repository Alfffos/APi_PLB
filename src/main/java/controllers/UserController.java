package controllers;


import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

@RestController
@RequestMapping("/user")                //mapeo del endpoint
public class UserController {

    @Autowired
    UserService userService;                            //con esto puedo usar los metedos del service.
    @PostMapping("/create")
    public void create(@RequestBody User user){              //Este metodo recibe un User y para poder crearlo
        userService.newUser(user);                  //Aca extiende desde userService y con el metodo newUser le doy el User para crearlo
    }

}
