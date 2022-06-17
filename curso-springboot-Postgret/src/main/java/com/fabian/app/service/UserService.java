package com.fabian.app.service;

/*en este paquete se pone codigo que no va tanto ni en repository ni en entity
 * tambien llamado fachada
 * */
 
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.fabian.app.entity.User;

public interface UserService { 
//El método iterator() nos va a permitir obtener un objeto de tipo Iterator que representa la 
//colección a recorrer, y los métodos disponibles para los objetos de tipo Iterator nos van
//a permitir operar con cada elemento de la colección
	
	public Iterable<User> findAll();//metodo que devuelve un iterable del metodo Usuario
	
	public Page<User> findAll(Pageable pageable);
	
	public Optional<User> findById(Long id);
	
	public User save(User user);
	
	public void deleteById (Long id);
	
}
