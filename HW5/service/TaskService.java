package ru.gb.HW5.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.HW5.model.Task;
import ru.gb.HW5.model.TaskStatus;
import ru.gb.HW5.repository.NoteBookRepository;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskService {

    private final NoteBookRepository noteBookRepository;

    //Show all tasks
    public List<Task> getAllNotes(){
        return noteBookRepository.findAll();
    }

    //Searching by ID
    public Optional<Task> showTaskById(Long id){
        return noteBookRepository.findById(id);
    }

    public List<Task> showTaskByStatus(TaskStatus status){
        return noteBookRepository.findByStatus(status);
    }

    //SaveTask
    public void saveTask(Task task){
        noteBookRepository.save(task);
    }

    //Add new task
    public Task addNewTask(String text){
        Task task1 = new Task();
        task1.setText(text);
        task1.setLocalDateTime(LocalDateTime.now());
//        task1.setStatus("HAS_NOT_STARTED");
        task1.setStatus(task1.getStatus());
        noteBookRepository.save(task1);
        return task1;
    }

    //Delete Task
    public void deleteTask(Long id){
        noteBookRepository.deleteById(id);
    }

}
