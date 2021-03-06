package com.example.demo.Repository;

import com.example.demo.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.Collection;


@CrossOrigin(origins = "*")
@EnableJpaRepositories
public interface AccountUserRepository extends JpaRepository<AccountUsers,Long> {

    AccountUsers findByUsernameAndPassword(String username,String password);


}