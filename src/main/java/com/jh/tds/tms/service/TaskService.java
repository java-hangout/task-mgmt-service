package com.jh.tds.tms.service;

import com.jh.tds.tms.model.Department;
import com.jh.tds.tms.model.Task;
import com.jh.tds.tms.model.User;
import com.jh.tds.tms.registry.TaskRepository;
import com.jh.tds.tms.registry.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;  // RestTemplate for communication with Department Service

    @Value("${user.service.base.url}")  // URL for Department Service
    private String userServiceUrl;
    @Value("${department.service.base.url}")
    private String departmentServiceUrl;

    public Task createTask(Task task) {
        // Generate a custom ID for the task
        task.setId(sequenceGeneratorService.generateTaskId());
        task.setCreatedDate(new Date());
        task.setUpdatedDate(new Date());
        User user = getUserDetails(task.getAssignedToUserName());
        task.setDepartmentId(user.getDepartmentId());
        Department department = getDepartmentDetails(user.getDepartmentId());
        task.setDepartmentName(department.getDepartmentName());

        return taskRepository.save(task);
    }

    public Task getTaskById(String id) {
        return taskRepository.findById(id).orElse(null);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task updateTask(String id, Task task) {
        Optional<Task> task1 = taskRepository.findById(id);
        if (task1.isPresent()) {
            task.setId(id);
            task.setCreatedDate(task1.get().getCreatedDate());
            return taskRepository.save(task);
        }
        return null;
    }

    public void deleteTask(String id) {
        taskRepository.deleteById(id);
    }

    /*public List<Task> getTasksByAssignedToUserId(String userId) {
        return taskRepository.findByAssignedToUserId(userId);
    }*/

    public List<Task> getTasksByAssignedToUserName(String userName) {
        return taskRepository.findByAssignedToUserName(userName);
    }

    public List<Task> getTasksByDepartmentId(String departmentId) {
        return taskRepository.findByDepartmentId(departmentId);
    }

    public List<Task> getTasksByStatus(String status) {
        return taskRepository.findByStatus(status);
    }

    private User getUserDetails(String userName) {
        // Build the URL for the Department Service API to check if the department exists
        String usermgmtFindUrl = userServiceUrl + "/api/users/fetch/username/" + userName;
        System.out.println("department Find Url : " + usermgmtFindUrl);
        // Make a GET request to check if the department exists
        User user = restTemplate.getForObject(usermgmtFindUrl, User.class);
        System.out.println("user : " + user);

        return user;
    }

    private Department getDepartmentDetails(String departmentId) {
        // Build the URL for the Department Service API to check if the department exists
        String departmentFindUrl = departmentServiceUrl + "/api/departments/fetch/id/" + departmentId;
        System.out.println("department Find Url : " + departmentFindUrl);
        // Make a GET request to check if the department exists
        Department department = restTemplate.getForObject(departmentFindUrl, Department.class);
        System.out.println("department : " + department);

        return department;
    }
}
