package com.unac.crudProgramacion.services;

import com.unac.crudProgramacion.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO saveUser(UserDTO userDTO);
    List<UserDTO> getUsers();
}
