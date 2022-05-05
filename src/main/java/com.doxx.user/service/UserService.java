package com.doxx.user.service;

import org.springframework.stereotype.Service;
import com.doxx.user.repository.UserRepository;
import com.doxx.user.entity.User;
import lombork.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("Inside saveUser of UserService");
        return userRepository.save(user);
    }
    
    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        log.info("Inside getUserWithDepartment of UserService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findByUserId(userId);

        Department department =
                restTemplate.getForObject(url: "http://localhost:9001/departments/" + user.getDepartmentId
                    ,Department.class);
        vo.setUser(user);
        vo.setDepartment(department);

        return vo;
    }
}
