package com.unac.crudProgramacion.services.impl;

import com.unac.crudProgramacion.dao.UserDAO;
import com.unac.crudProgramacion.dto.UserDTO;
import com.unac.crudProgramacion.entity.UserEntity;
import com.unac.crudProgramacion.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;
    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        UserEntity userEntity = UserEntity.builder()
                .idUser(userDTO.getIdUser())
                .name(userDTO.getName())
                .email(userDTO.getEmail())
                .birthdate(userDTO.getBirthdate())
                .build();
        return UserDAO.save(userDTO);

    }

    @Override
    public List<UserDTO> getUsers() {
        return List.of();
    }
}
