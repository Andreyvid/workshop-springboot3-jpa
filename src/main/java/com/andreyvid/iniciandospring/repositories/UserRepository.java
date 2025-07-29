package com.andreyvid.iniciandospring.repositories;

import com.andreyvid.iniciandospring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
