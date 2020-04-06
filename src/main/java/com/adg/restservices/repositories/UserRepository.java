package com.adg.restservices.repositories;

import com.adg.restservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    User findByUsername(String username);
}
