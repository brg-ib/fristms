package ynov.app1.fristms.restcontroller;

import ynov.app1.fristms.model.User;
import ynov.app1.fristms.repositories.UserRepository;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(value="/user/{id}")
	public Optional<User> getUser(@PathVariable Long id) {
		return userRepository.findById(id);
	}
	
	@GetMapping(value="/users")
	public List<User> getUsers() {
		List<User> users = new ArrayList<User>();
		userRepository.findAll().forEach(users::add);
		return users;
//		StringBuilder res = new StringBuilder();
//		Iterable<User> users = userRepository.findAll();
//		Iterator<User> ite = users.iterator();
//		while(ite.hasNext()){
//				User u = ite.next();
//				res.append(u.getUsername());
//		}
//		return res.toString();
	}
	
	/*
	 * POST
	 */
	@PostMapping(value="/add")
	public void addUser(@RequestBody User u) {
		userRepository.save(u);
	}
	
	/*
	 * PUT
	 */
	@PutMapping(value="/update")
	public void updateUser(@RequestBody User u) {
		userRepository.save(u);
	}
	/*
	 * DELETE
	 */
	@DeleteMapping(value="/delete")
	public void deleteUser(@RequestBody User u) {
		userRepository.save(u);
	}
	
	@PostMapping(value="/login")
	public Optional<User> login(@RequestBody User u) {
		return userRepository.findByUsernameAndPassword(u.getUsername(), u.getPassword());
		//String username = u.getUsername();
		//User user = userRepository.findByUsername(username);
		//return u.getPassword().equals(user.getPassword());
	}
}
