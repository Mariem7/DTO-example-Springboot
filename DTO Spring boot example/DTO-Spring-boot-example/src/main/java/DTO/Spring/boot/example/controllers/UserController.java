package DTO.Spring.boot.example.controllers;

import DTO.Spring.boot.example.converter.UserConverter;
import DTO.Spring.boot.example.dto.UserDTO;
import DTO.Spring.boot.example.dto.UserLocationDTO;
import DTO.Spring.boot.example.entities.User;
import DTO.Spring.boot.example.repositories.UserRepository;
import DTO.Spring.boot.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserConverter converter;


    @GetMapping("/findAllDto")
    public List<UserDTO> findAll() {
        List<User> findAll = userRepository.findAll();
        return converter.entityToDto(findAll);
    }

    @GetMapping("/findAllCompletetd")
    public List<User> findAllCompleted() {
        List<User> findAllUsers = userRepository.findAll();
        return findAllUsers;
    }

    @GetMapping("/find/{ID}")
    public UserDTO findById(@PathVariable(value = "ID") Long id) {
        User orElse = userRepository.findById(id).orElse(null);
        return converter.entityToDto(orElse);

    }
}
