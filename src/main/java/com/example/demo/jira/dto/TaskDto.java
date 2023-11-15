package com.example.demo.jira.dto;

import com.example.demo.jira.entity.User;
import com.example.demo.jira.enumeration.TaskStatus;
import com.example.demo.jira.enumeration.TaskType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskDto implements Serializable {
    private String taskId;
    private String title;
    private TaskType type;//story,feature,Bugs
    private TaskStatus taskStatus;
    private User user;
    private List<String> subtasks;
}
