package ru.cotarius.springDMDEV;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.cotarius.springDMDEV.database.repository.CompanyRepository;
import ru.cotarius.springDMDEV.database.repository.UserRepository;
import ru.cotarius.springDMDEV.ioc.Container;
import ru.cotarius.springDMDEV.pool.ConnectionPool;
import ru.cotarius.springDMDEV.service.UserService;

public class ApplicationRunner {

	public static void main(String[] args) {
		var context = new ClassPathXmlApplicationContext("application.xml");
		var connectionPool = context.getBean("pool1", ConnectionPool.class);
		System.out.println(connectionPool);
	}

}
