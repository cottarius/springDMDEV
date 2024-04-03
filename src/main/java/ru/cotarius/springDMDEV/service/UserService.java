package ru.cotarius.springDMDEV.service;

import ru.cotarius.springDMDEV.database.repository.UserRepository;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
