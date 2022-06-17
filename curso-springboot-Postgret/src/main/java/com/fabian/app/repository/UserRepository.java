//link del video https://www.youtube.com/watch?v=ez6FNBdCUB0&list=PL-A7l3GTDnp1YkBwslsdzuJKF55cISdSD


package com.fabian.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabian.app.entity.User;
 //El que se conecta a BD 
@Repository
//vamos a extender del JPA reposoritory 
public interface UserRepository extends JpaRepository<User, Long> { //JPA por que se va hacer paginacion desde el lado del servidor
	

}
