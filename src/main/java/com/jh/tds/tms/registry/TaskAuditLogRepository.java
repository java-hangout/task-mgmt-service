package com.jh.tds.tms.registry;

import com.jh.tds.tms.model.TaskAuditLog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskAuditLogRepository extends MongoRepository<TaskAuditLog, String> {
}
