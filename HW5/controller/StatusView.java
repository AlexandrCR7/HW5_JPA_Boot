package ru.gb.HW5.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.HW5.model.Task;
import ru.gb.HW5.model.TaskStatus;
import ru.gb.HW5.repository.NoteBookRepository;
import ru.gb.HW5.service.TaskService;

import java.util.List;

@RestController
@AllArgsConstructor
public class StatusView {

    private final TaskService service;

    @GetMapping("/status/{status}")
    public List<Task> getTasksByStatus(@PathVariable TaskStatus status){
        return service.showTaskByStatus(status);
    }
}
