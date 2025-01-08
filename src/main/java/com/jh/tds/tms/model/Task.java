package com.jh.tds.tms.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Setter
@Getter
@Document(collection = "tasks")
public class Task {

    @Id
    private String id;                     // Unique task ID
    private String title;                  // Task title
    private String description;            // Task description
    private String assignedToUserName;       // Reference to the user who is assigned the task (Many-to-One)
//    private String assignedToUserId;       // Reference to the user who is assigned the task (Many-to-One)
    private String departmentId;           // Reference to the department the task belongs to (Many-to-One)
    private String departmentName;           // Reference to the department the task belongs to (Many-to-One)
    private Date dueDate = new Date();                  // Due date for the task
    private String status;                 // Status of the task (e.g., "Open", "In Development", "Completed")
    private String priority;               // Priority of the task (e.g., "High", "Medium", "Low")
    private String comments;
    private Date createdDate = new Date();                  // Due date for the task
    private Date updatedDate = new Date();

}

