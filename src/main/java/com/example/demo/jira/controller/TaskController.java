package com.example.demo.jira.controller;

import com.example.demo.jira.dto.AddUToTaskDto;
import com.example.demo.jira.dto.TaskDto;
import com.example.demo.jira.dto.UpdateStatusDto;
import com.example.demo.jira.enumeration.TaskStatus;
import com.example.demo.jira.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;
    @PostMapping
    public TaskDto createTask(@RequestBody TaskDto taskDto){
        return taskService.createTask(taskDto);
    }
    @PutMapping("/{taskId}")
    public TaskDto updateStatus(@PathVariable String taskId, @RequestBody UpdateStatusDto updateStatusDto){
        return taskService.updateStatus(taskId,updateStatusDto);
    }
    @GetMapping("/{taskStatus}")
    public List<TaskDto> getTaskByStatus(@PathVariable TaskStatus taskStatus){
        return taskService.getTaskByStatus(taskStatus);
    }
    @GetMapping("/delayed")
    public List<TaskDto> getDelayedTask(){
        return taskService.getDelayedTask();
    }
    @GetMapping("/{taskId}")
    public TaskDto getTaskById(@PathVariable String taskId){
        return taskService.getTaskById(taskId);
    }
    @PutMapping("/add/{taskId}")
    public TaskDto addUToTask(@PathVariable String taskId, @RequestBody AddUToTaskDto addUToTaskDto){
        return taskService.addUToTask(taskId,addUToTaskDto);
    }
    @GetMapping("/")
    public List<TaskDto> getAllTasks() {
        return taskService.getAllTasks();
    }
}
