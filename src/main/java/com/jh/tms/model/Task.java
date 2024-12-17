package com.jh.tms.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "tasks")
public class Task {

    @Id
    private String id;                     // Unique task ID
    private String title;                  // Task title
    private String description;            // Task description
    private String assignedToUserId;       // Reference to the user who is assigned the task (Many-to-One)
    private String departmentId;           // Reference to the department the task belongs to (Many-to-One)
    private Date dueDate = new Date();                  // Due date for the task
    private String status;                 // Status of the task (e.g., "Open", "In Progress", "Completed")
    private String priority;               // Priority of the task (e.g., "High", "Medium", "Low")

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

   /* public void setDescription(String description) {
        this.description = description;
    }*/

    public String getAssignedToUserId() {
        return assignedToUserId;
    }

    public void setAssignedToUserId(String assignedToUserId) {
        this.assignedToUserId = assignedToUserId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}

