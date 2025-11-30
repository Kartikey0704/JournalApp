package ares.javaProject.journalApp.Controller;

import ares.javaProject.journalApp.Entity.User;
import ares.javaProject.journalApp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")
public class PublicController {
    @GetMapping("/health-check")
    public String healthCheck() {
        return "OK";
    }
    @Autowired
    private UserService userService;
    @PostMapping("/create-user")
    public void createUser(@RequestBody User user) {
        userService.saveNewUser(user);
    }
}
