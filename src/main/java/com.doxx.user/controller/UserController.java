package com.doxx.user.controller;

import com.doxx.user.service.UserService;
import org.springframework.web.bind.annotation.Postmapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Service;
import lombork.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;
    @Postmapping("/")
    public user saveUser(@RequestBody User user) {
        log.info("Inside saveUser of userController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("Inside saveUser of UserController");
        return userservice.getUserWithDepartment(userId);
    }


}

