package com.jingda.repository;

import com.jingda.model.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository {
    UserBean findByUsernameAndPassword(String name,String password);
}
