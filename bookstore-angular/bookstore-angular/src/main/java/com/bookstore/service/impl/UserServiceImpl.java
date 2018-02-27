package com.bookstore.service.impl;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookstore.repository.UserRepository;
import com.bookstore.domain.User;
import com.bookstore.domain.security.UserRole;
import com.bookstore.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserRepository userRepository;

	@Transactional
	public User createUser(com.bookstore.domain.security.User user, Set<UserRole> userRoles) {
		User localUser= userRepository.findByUsername(user.getUsername())
				if(localUser!=null)
				{
					log.info("user with this userName alrady exists",user.getUserName());
				}
		for(com.bookstore.domain.security.UserRole ur:userRoles
				{
			roleRepository.save(ur.getRole());
				}
		user.getUserRoles().addAll(userRoles);
		localUser= userRepository.save(user)
	}

	@Override
	public com.bookstore.service.User createUser(com.bookstore.service.User user,
			com.bookstore.service.Set<com.bookstore.service.UserRole> userRoles) {
		// TODO Auto-generated method stub
		return null;
	}
}})

		}return null;}

	}
