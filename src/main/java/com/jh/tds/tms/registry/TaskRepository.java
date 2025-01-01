package com.jh.tds.tms.registry;

import com.jh.tds.tms.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TaskRepository extends MongoRepository<Task, String> {
    List<Task> findByAssignedToUserId(String userId);
    List<Task> findByDepartmentId(String departmentId);
    List<Task> findByStatus(String status);
}
