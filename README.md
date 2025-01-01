# task-mgmt-service

http://localhost:8083/api/tasks/create
{
"title": "Design API Architecture",
"description": "Create and finalize the design for the API architecture for the new project.",
"assignedToUserId": "user_012",
"departmentId": "dept_003",
"dueDate": "2024-12-31T23:59:59.000Z",
"status": "Open",
"priority": "High"
}
{
"id": "task_0001",
"title": "Design API Architecture",
"description": "Create and finalize the design for the API architecture for the new project.",
"assignedToUserId": "user_012",
"departmentId": "dept_003",
"dueDate": "2024-12-31T23:59:59.000+00:00",
"status": "Open",
"priority": "High"
}

http://localhost:8083/api/tasks/assignedTo/user_012

[//]: # (response)
[
{
"id": "task_0001",
"title": "Design API Architecture",
"description": "Create and finalize the design for the API architecture for the new project.",
"assignedToUserId": "user_012",
"departmentId": "dept_003",
"dueDate": "2024-12-31T23:59:59.000+00:00",
"status": "Open",
"priority": "High"
},
{
"id": "task_0002",
"title": "Design API Architecture",
"description": "Create and finalize the design for the API architecture for the new project.",
"assignedToUserId": "user_012",
"departmentId": "dept_003",
"dueDate": "2024-12-31T23:59:59.000+00:00",
"status": "Open",
"priority": "High"
},
{
"id": "task_0003",
"title": "Design API Architecture",
"description": "Create and finalize the design for the API architecture for the new project.",
"assignedToUserId": "user_012",
"departmentId": "dept_003",
"dueDate": "2024-12-31T23:59:59.000+00:00",
"status": "Open",
"priority": "High"
}
]

http://localhost:8083/api/tasks/department/dept_003
[
{
"id": "task_0001",
"title": "Design API Architecture",
"description": "Create and finalize the design for the API architecture for the new project.",
"assignedToUserId": "user_012",
"departmentId": "dept_003",
"dueDate": "2024-12-31T23:59:59.000+00:00",
"status": "Open",
"priority": "High"
},
{
"id": "task_0002",
"title": "Design API Architecture",
"description": "Create and finalize the design for the API architecture for the new project.",
"assignedToUserId": "user_012",
"departmentId": "dept_003",
"dueDate": "2024-12-31T23:59:59.000+00:00",
"status": "Open",
"priority": "High"
},
{
"id": "task_0003",
"title": "Design API Architecture",
"description": "Create and finalize the design for the API architecture for the new project.",
"assignedToUserId": "user_012",
"departmentId": "dept_003",
"dueDate": "2024-12-31T23:59:59.000+00:00",
"status": "Open",
"priority": "High"
}
]

http://localhost:8083/api/tasks/status/Open
[
{
"id": "6761c603b5bf6c6b44a5150c",
"title": "Web Activity Tracking",
"description": "Web activity tracking tool",
"assignedToUserId": "101",
"departmentId": "10001",
"dueDate": "2024-12-17T18:42:11.368+00:00",
"status": "Open",
"priority": "High"
},
{
"id": "task_001",
"title": "Web Activity Tracking",
"description": "Web activity tracking tool",
"assignedToUserId": "102",
"departmentId": "10001",
"dueDate": "2024-12-17T18:42:34.060+00:00",
"status": "Open",
"priority": "High"
},
{
"id": "task_0001",
"title": "Design API Architecture",
"description": "Create and finalize the design for the API architecture for the new project.",
"assignedToUserId": "user_012",
"departmentId": "dept_003",
"dueDate": "2024-12-31T23:59:59.000+00:00",
"status": "Open",
"priority": "High"
},
{
"id": "task_0002",
"title": "Design API Architecture",
"description": "Create and finalize the design for the API architecture for the new project.",
"assignedToUserId": "user_012",
"departmentId": "dept_003",
"dueDate": "2024-12-31T23:59:59.000+00:00",
"status": "Open",
"priority": "High"
},
{
"id": "task_0003",
"title": "Design API Architecture",
"description": "Create and finalize the design for the API architecture for the new project.",
"assignedToUserId": "user_012",
"departmentId": "dept_003",
"dueDate": "2024-12-31T23:59:59.000+00:00",
"status": "Open",
"priority": "High"
},
{
"id": "task_0004",
"title": "Design API Architecture",
"description": "Create and finalize the design for the API architecture for the new project.",
"assignedToUserId": "user_012",
"departmentId": "dept_003",
"dueDate": "2024-12-31T23:59:59.000+00:00",
"status": "Open",
"priority": "In progress"
}
]