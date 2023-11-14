package com.example.demo.jira.entity;


import com.example.demo.jira.enumeration.TaskStatus;
import com.example.demo.jira.enumeration.TaskType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection="task")
public class Task {
    @Id
    private String taskId;
    private String title;
    private TaskType type;//story,feature,Bugs
    private TaskStatus taskStatus;
    private User user;
    private List<String> subtasks;
}
