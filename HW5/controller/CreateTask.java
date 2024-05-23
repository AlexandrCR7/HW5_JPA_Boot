package ru.gb.HW5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.gb.HW5.service.TaskService;

@Controller
public class CreateTask {
    @Autowired
    TaskService taskService;

    @GetMapping("/CreateTask")
    public String addTask() {
        return "CreateTask";
    }

    @PostMapping("/CreateTask")
    public String addTaskAction(@RequestParam String text, Model model) {
        taskService.saveTask(taskService.addNewTask(text));
        model.addAttribute("tasks", taskService.getAllNotes());
        return "index";
    }
}
