package com.romeone.taskExample.model;

import com.romeone.taskExample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
