package ynov.app1.fristms.repositories;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ynov.app1.fristms.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	public User findByUsername(String username);
	
	public Optional<User> findByUsernameAndPassword(String username,String password);
}