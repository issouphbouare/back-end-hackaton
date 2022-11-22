package com.example.cahierTexte.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.cahierTexte.model.User;
@RepositoryRestResource
@CrossOrigin("*")
public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
	

}
