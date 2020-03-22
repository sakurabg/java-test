package com.itmuch.cloud.microservicesimpleprovideruser.mapper;

import com.itmuch.cloud.microservicesimpleprovideruser.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UserRepository
 * @Description TODO
 * @Author 朱
 * @Date 2020-03-13 20:22
 * @ModifyDate 2020-03-13 20:22
 * @Version 1.0
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
