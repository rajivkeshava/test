package com.bookstore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.User;

public interface RoleRepository extends CrudRepository<User, Long>
{

}
