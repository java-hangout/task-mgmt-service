package com.jh.tds.tms.service;

import com.jh.tds.tms.model.Task;
import com.jh.tds.tms.registry.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    public Task createTask(Task task) {
        // Generate a custom ID for the task
        task.setId(sequenceGeneratorService.generateTaskId());
        return taskRepository.save(task);
    }

    public Task getTaskById(String id) {
        return taskRepository.findById(id).orElse(null);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task updateTask(String id, Task task) {
        if (taskRepository.existsById(id)) {
            task.setId(id);
            return taskRepository.save(task);
        }
        return null;
    }

    public void deleteTask(String id) {
        taskRepository.deleteById(id);
    }

    public List<Task> getTasksByAssignedToUserId(String userId) {
        return taskRepository.findByAssignedToUserId(userId);
    }

    public List<Task> getTasksByDepartmentId(String departmentId) {
        return taskRepository.findByDepartmentId(departmentId);
    }

    public List<Task> getTasksByStatus(String status) {
        return taskRepository.findByStatus(status);
    }
}
