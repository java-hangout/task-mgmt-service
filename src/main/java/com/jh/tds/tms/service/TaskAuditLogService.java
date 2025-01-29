package com.jh.tds.tms.service;


import com.jh.tds.tms.model.TaskAuditLog;
import com.jh.tds.tms.model.Task;
import com.jh.tds.tms.registry.TaskAuditLogRepository;
import com.jh.tds.tms.util.TaskAuditLogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Veeresh N
 * @version 1.0
 */
@Service
public class TaskAuditLogService {
    @Autowired
    private TaskAuditLogRepository taskAuditLogRepository;

    public void logChangesForAudit(Task task, String action) {
        String documentDetails = TaskAuditLogUtil.convertUserToJson(task);
        TaskAuditLog taskAuditLog = new TaskAuditLog(
                action,
                task.getAssignedToUserName(),
                documentDetails
        );
        taskAuditLogRepository.save(taskAuditLog);
    }
}
