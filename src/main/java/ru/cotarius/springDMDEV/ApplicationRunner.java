package ru.cotarius.springDMDEV;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.cotarius.springDMDEV.database.repository.CompanyRepository;
import ru.cotarius.springDMDEV.database.repository.UserRepository;
import ru.cotarius.springDMDEV.ioc.Container;
import ru.cotarius.springDMDEV.pool.ConnectionPool;
import ru.cotarius.springDMDEV.service.UserService;

public class ApplicationRunner {

	public static void main(String[] args) {
		Container container = new Container();

//		ConnectionPool connectionPool = new ConnectionPool();
//		UserRepository userRepository = new UserRepository(connectionPool);
//		CompanyRepository companyRepository = new CompanyRepository(connectionPool);
//		UserService userService = new UserService(userRepository, companyRepository);

//		ConnectionPool connectionPool = container.get(ConnectionPool.class);
//		UserRepository userRepository = container.get(UserRepository.class);
//		CompanyRepository companyRepository = container.get(CompanyRepository.class);

		UserService userService = container.get(UserService.class);
		//TODO:
	}

}
