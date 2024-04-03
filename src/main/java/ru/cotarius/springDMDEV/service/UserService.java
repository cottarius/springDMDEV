package ru.cotarius.springDMDEV.service;

import ru.cotarius.springDMDEV.database.repository.CompanyRepository;
import ru.cotarius.springDMDEV.database.repository.UserRepository;

public class UserService {
    private final UserRepository userRepository;
    private final CompanyRepository companyRepository;

    public UserService(UserRepository userRepository, CompanyRepository companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
