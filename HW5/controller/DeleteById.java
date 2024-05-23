package ru.gb.HW5.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.HW5.service.TaskService;

import java.util.List;

@RestController
@AllArgsConstructor
public class DeleteById {

    private final TaskService taskService;

    @GetMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        taskService.deleteTask(id);
    }
}