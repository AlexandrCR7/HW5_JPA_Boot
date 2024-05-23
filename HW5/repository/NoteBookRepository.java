package ru.gb.HW5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.HW5.model.Task;
import ru.gb.HW5.model.TaskStatus;

import java.util.List;

public interface NoteBookRepository extends JpaRepository<Task, Long> {

    List<Task> findByStatus(TaskStatus taskStatus);
}
