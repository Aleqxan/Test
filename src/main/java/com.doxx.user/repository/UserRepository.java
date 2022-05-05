package com.doxx.user.repository;

import com.doxx.user.entity.User;
import org.springframework.data.jpa.repository.Jparepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends JpaRepository<User, Long>{
}
