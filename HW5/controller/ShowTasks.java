package ru.gb.HW5.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.HW5.model.Task;
import ru.gb.HW5.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@AllArgsConstructor
public class ShowTasks {

    private final TaskService service;

    @GetMapping
    public List<Task> showAll(){
        return service.getAllNotes();
    }
}
