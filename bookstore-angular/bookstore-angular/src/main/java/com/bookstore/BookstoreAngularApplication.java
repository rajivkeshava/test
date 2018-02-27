package com.bookstore;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookstore.config.SecurityUtility;
import com.bookstore.domain.security.Role;
import com.bookstore.domain.security.User;
import com.bookstore.domain.security.UserRole;

@SpringBootApplication
public class BookstoreAngularApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreAngularApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		User user1= new User();
		user1.setFirstName("rajiv");
		user1.setFirstName("keshava");
		user1.setUserName("rajivkeshava");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("abcd1234"));
		user1.seteMail("rajiv.keUserRoles.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1 = new Role();
		role1.setRoleId(1);
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user1,role1));
		userService.createUser(user1,userRoles);
		userRoles.clear();

		User user2= new User();
		user2.setFirstName("admin");
		user2.setFirstName("admin");
		user2.setUserName("admin");
		user2.setPassword(SecurityUtility.passwordEncoder().encode("abcd1234"));
		user2.seteMail("rajiv.admin.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1 = new Role();
		role1.setRoleId(0);
		role1.setName("ROLE_ADMIN");
		userRoles.add(new UserRole(user2,role1));
		userService.createUser(user2,userRoles);
		userRoles.clear();




	}
}
