package com.jh.tds.tms.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@Document(collection = "task_audit_logs")
public class TaskAuditLog {

    @Id
    private String id;
    private String action;           // Action type: insert, update, delete
    private String userName;       // The UserName
    private String documentDetails;  // The details of the changed document (JSON string)
    private Date timestamp;          // The timestamp of when the change occurred

    public TaskAuditLog(String action, String userName, String documentDetails) {
        this.action = action;
        this.userName = userName;
        this.documentDetails = documentDetails;
        this.timestamp = new Date();
    }
}
