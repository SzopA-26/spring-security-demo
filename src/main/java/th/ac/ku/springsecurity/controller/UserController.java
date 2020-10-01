package th.ac.ku.springsecurity.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.ku.springsecurity.model.User;
import th.ac.ku.springsecurity.service.UserService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<User> showAll() {
        return userService.getAllUsers();
    }
}
