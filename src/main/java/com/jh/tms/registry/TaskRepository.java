package com.jh.tms.registry;


import com.jh.tms.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, String> {
    Task findByAssignedToUserId(String userId);
}
