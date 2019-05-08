package com.example.sdudy8;

import com.example.sdudy8.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "/select")
    public List<UserEntity> select(){
        return userService.select();
    }
}
