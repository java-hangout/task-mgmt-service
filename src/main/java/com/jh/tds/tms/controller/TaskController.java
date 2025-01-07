package com.jh.tds.tms.controller;

import com.jh.tds.tms.model.Task;
import com.jh.tds.tms.service.TaskService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000") // Allow only your frontend URL
@RequestMapping("/api/tasks")
@Tag(name = "Task Management", description = "Endpoints for managing tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/create")
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @GetMapping("/fetch/{id}")
    public Task getTaskById(@PathVariable String id) {
        return taskService.getTaskById(id);
    }

    @GetMapping("/fetch/all")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PutMapping("/update/{id}")
    public Task updateTask(@PathVariable String id, @RequestBody Task task) {
        return taskService.updateTask(id, task);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTask(@PathVariable String id) {
        taskService.deleteTask(id);
    }

   /* @GetMapping("/assignedTo/{userId}")
    public List<Task> getTasksByAssignedToUserId(@PathVariable String userId) {
        return taskService.getTasksByAssignedToUserId(userId);
    }*/

    @GetMapping("/assignedTo/{userName}")
    public List<Task> getTasksByAssignedToUserName(@PathVariable String userName) {
        return taskService.getTasksByAssignedToUserName(userName);
    }

    @GetMapping("/department/{departmentId}")
    public List<Task> getTasksByDepartmentId(@PathVariable String departmentId) {
        return taskService.getTasksByDepartmentId(departmentId);
    }

    @GetMapping("/status/{status}")
    public List<Task> getTasksByStatus(@PathVariable String status) {
        return taskService.getTasksByStatus(status);
    }
}
