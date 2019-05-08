package com.example.sdudy8.service;

import com.example.sdudy8.UserEntity;
import com.example.sdudy8.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@CacheConfig(cacheNames = "user")
public class UserService {
    @Autowired
    UserJPA userJPA;
    @Cacheable
    public List<UserEntity> select(){
       return userJPA.findAll();
    }
}
