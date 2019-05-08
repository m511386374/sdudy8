package com.example.sdudy8.jpa;
import com.example.sdudy8.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserJPA extends JpaRepository<UserEntity, Long> {
}