package com.bookstore.service;

public interface UserService 
{
	User createUser(User user, Set<UserRole> userRoles);
}
