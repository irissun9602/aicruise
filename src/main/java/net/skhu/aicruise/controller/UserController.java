package net.skhu.aicruise.controller;

import net.skhu.aicruise.repository.UserRepository;
import net.skhu.aicruise.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class UserController {
    @GetMapping("/get")
    public String getTest(){
        return "success";
    }
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    public User create(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("/user/{id}")
    public List<Optional<User>> read(@PathVariable Long id){
        List<Optional<User>> user= new ArrayList<>();
        Optional<User> userOptional =userRepository.findById(id);
        userOptional.ifPresent(System.out::println);
        user.add(userOptional);
        return user;
    }
}
