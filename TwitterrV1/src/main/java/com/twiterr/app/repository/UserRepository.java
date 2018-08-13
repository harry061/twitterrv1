package com.twiterr.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.twiterr.app.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	@SuppressWarnings("unchecked")
	User save(User u);

}
