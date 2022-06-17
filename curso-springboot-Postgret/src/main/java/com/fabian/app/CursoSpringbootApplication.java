//link del video https://www.youtube.com/watch?v=aLUHoorbeQk&list=PL-A7l3GTDnp2KFHhbW485-OytjGOhoApz&index=4
package com.fabian.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursoSpringbootApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(CursoSpringbootApplication.class, args);
	}

}


//esto va en aplication properties con la conexion a BD sql
/*
spring.datasource.url=jdbc:mysql://localhost:3306/db_fabian?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=12345
spring.datasource.dbcp2.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=create-drop
logging.level.org.hibernate.SQL=debug


server.port=2022

*/

/*Esto es lo que debe de ir con postgret
spring.datasource.url=jdbc:postgrest://localhost:5432/db_fabian?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=12345
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgretSQLDialect
spring.jpa.database-platform=org.hibernate.dialect.MySQL8DialectPostgretSQLDialect
spring.jpa.hibernate.ddl-auto=update */