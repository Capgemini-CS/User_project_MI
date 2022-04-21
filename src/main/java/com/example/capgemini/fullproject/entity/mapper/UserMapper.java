package com.example.capgemini.fullproject.entity.mapper;

import com.example.capgemini.fullproject.entity.User;
import com.example.capgemini.fullproject.entity.dto.UserDTO;
import org.dozer.DozerBeanMapper;

public class UserMapper {

    public static UserDTO toUserDTO(User user) {
        UserDTO userDTO = new DozerBeanMapper().map(user,UserDTO.class);
        return userDTO;
    }

    public static User toUser(UserDTO userDTO){
        User user = new DozerBeanMapper().map(userDTO, User.class);
        return user;
    }
}
