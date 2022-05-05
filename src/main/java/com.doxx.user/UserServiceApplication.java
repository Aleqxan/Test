package com.doxx.user;

import ...

@SpringBootApplication
public class UserServiceApplication {

    public static void main(String[] args) { StringApplication.run(UserServiceApplication.)}

    @Bean
    public RestTemplate restTemplate() {

        return new RestTemplate();
    }
}
