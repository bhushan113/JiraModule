package com.example.demo.jira.controller;

import com.example.demo.jira.dto.AddTToSprintDto;
import com.example.demo.jira.dto.SprintDto;
import com.example.demo.jira.service.SprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sprints")
public class SprintController {
    @Autowired
    private SprintService sprintService;
    @PostMapping("/")
    public SprintDto createSprint(@RequestBody SprintDto sprintDto){
//       System.err.println("hgvchg");
        return sprintService.createSprint(sprintDto);
    }
    @GetMapping("/{sprintId}")
    public SprintDto getSprintById(@PathVariable String sprintId){
//       System.err.println("bnc");
        return sprintService.getSprintById(sprintId);
    }
    @PutMapping("/add/{sprintId}")
    public SprintDto addTToSprint(@PathVariable String sprintId,@RequestBody AddTToSprintDto addToSprintDto){
        return sprintService.addTToSprint(sprintId, addToSprintDto);
    }

    @PutMapping("/remove/{sprintId}")
    public SprintDto removeTFromSprint(@PathVariable String sprintId, @RequestBody AddTToSprintDto addTToSprintDto){
        return sprintService.removeTFromSprint(sprintId,addTToSprintDto);
    }
    @GetMapping
    public List<SprintDto> getAllSprints(){
        return sprintService.getAllSprints();
    }
}
