package com.appstude;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.appstude.dao.RoleRepository;
import com.appstude.dao.UserRepository;
import com.appstude.entities.Role;
import com.appstude.entities.User;


@SpringBootApplication
public class ServeurGestionStockProduitsApplication implements CommandLineRunner {

	@Autowired
	private RoleRepository  roleRepository;
	
	@Autowired
	private UserRepository  userRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ServeurGestionStockProduitsApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		/*Role r1 = new Role("ROLE_USER");
		Role r2 = new Role("ROLE_ADMIN");
		Role r3 = new Role("ROLE_MANAGER");
		roleRepository.save(r1);
		roleRepository.save(r2);
        roleRepository.save(r3);
				
		User user = new User("user", "123", true);
		User admin = new User("admin", "123", true);
		User manager = new User("manager", "123", true);

		user.setRoles(Arrays.asList(r1));
		userRepository.save(user);
		admin.setRoles(Arrays.asList(r1,r2));
		 userRepository.save(admin);
		manager.setRoles(Arrays.asList(r1,r2,r3));
		userRepository.save(manager);*/
		
		
		//
	   
	//	
		
	}
}
