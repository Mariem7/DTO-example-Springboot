package DTO.Spring.boot.example.converter;

import DTO.Spring.boot.example.dto.UserDTO;
import DTO.Spring.boot.example.entities.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserConverter {
    public UserDTO entityToDto(User user){
        ModelMapper modelMapper = new ModelMapper();
        UserDTO map = modelMapper.map(user,UserDTO.class);
        return map;
    }

    public List<UserDTO> entityToDto(List<User> users){
        return users.stream().map(x-> entityToDto(x)).collect(Collectors.toList());
    }

    public User dtoToEntity(UserDTO dto)
    {
        ModelMapper mapper = new ModelMapper();
        User map = mapper.map(dto, User.class);
        return map;
    }

    public List<User> dtoToEntity(List<UserDTO> dto)
    {
        return dto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
    }
}
