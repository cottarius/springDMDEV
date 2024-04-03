package ru.cotarius.springDMDEV;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.cotarius.springDMDEV.database.repository.CompanyRepository;
import ru.cotarius.springDMDEV.database.repository.UserRepository;
import ru.cotarius.springDMDEV.pool.ConnectionPool;
import ru.cotarius.springDMDEV.service.UserService;

public class ApplicationRunner {

	public static void main(String[] args) {
		ConnectionPool connectionPool = new ConnectionPool();
		UserRepository userRepository = new UserRepository(connectionPool);
		CompanyRepository companyRepository = new CompanyRepository(connectionPool);
		UserService userService = new UserService(userRepository, companyRepository);
		//TODO:
	}

}
