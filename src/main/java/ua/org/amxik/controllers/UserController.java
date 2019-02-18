package ua.org.amxik.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ua.org.amxik.models.Role;
import ua.org.amxik.models.UserEntity;
import ua.org.amxik.repositories.UserRepository;

/**
 * Created by amxik on 18.02.2019.
 */

@Controller
@RequestMapping(path = "/usr")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/add")
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String login,
                                           @RequestParam String password, @RequestParam String email,
                                           @RequestParam Role role){

        UserEntity usr = new UserEntity();
        usr.setName(name);
        usr.setLogin(login);
        usr.setPassword(password);
        usr.setEmail(email);
        usr.setRole(role);
        userRepository.save(usr);
        return "Saved";
    }
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<UserEntity> getAllUsers(){
        return userRepository.findAll();
    }
}
