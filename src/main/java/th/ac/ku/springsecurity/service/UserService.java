package th.ac.ku.springsecurity.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.springsecurity.model.User;
import th.ac.ku.springsecurity.repositories.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> getAllUsers(){
        return repository.findAll();
    }

}
