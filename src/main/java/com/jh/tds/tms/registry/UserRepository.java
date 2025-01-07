package com.jh.tds.tms.registry;


import com.jh.tds.tms.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUserName(String userName);
    User findByEmailId(String emailId);
}
