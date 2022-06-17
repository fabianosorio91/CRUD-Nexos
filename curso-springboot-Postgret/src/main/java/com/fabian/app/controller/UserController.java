package com.fabian.app.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fabian.app.entity.User;
import com.fabian.app.service.UserService;
//
@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	 private UserService userService;
	 
	
	//Post ....Crear 
	@PostMapping
	public ResponseEntity<?> create (@RequestBody User user ){
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
				
	}
	@GetMapping("/{id}") //ver...
	public ResponseEntity<?> read(@PathVariable(value = "id") Long UserId){
		Optional<User> oUser = userService.findById(UserId);
		
		if(!oUser.isPresent()) {
			return ResponseEntity.notFound().build();
			
		}
		return ResponseEntity.ok(oUser);
		
	}
	//Update...Actualizar
	@PutMapping("/{id}")
	public ResponseEntity<?> update (@RequestBody User userDetails, @PathVariable(value = "id") Long userId){
		Optional<User> user= userService.findById(userId);
		
		if(!user.isPresent()) {
			
			return ResponseEntity.notFound().build();
		}
		user.get().setName(userDetails.getName());
		user.get().setSurname(userDetails.getSurname());
		user.get().setEmail(userDetails.getEmail());
		user.get().setEnabled(userDetails.getEnabled());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user.get()));
	}
	
	//Delete...Borrar
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete (@PathVariable(value = "id") Long userId){
		
		if(!userService.findById(userId).isPresent()) {
			return ResponseEntity.notFound().build();				
			
		}
		userService.deleteById(userId);
		return ResponseEntity.ok().build();
	}
	
	
	//Read..Leer
	@GetMapping
	public List<User> readAll(){
		List<User> users = StreamSupport.stream(userService.findAll().spliterator(),false)
				.collect(Collectors.toList());
		
		return users;
		
		
	}
	

}
