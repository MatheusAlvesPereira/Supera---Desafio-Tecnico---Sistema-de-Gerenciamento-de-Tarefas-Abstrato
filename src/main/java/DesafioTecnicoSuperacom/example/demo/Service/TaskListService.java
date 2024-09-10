package DesafioTecnicoSuperacom.example.demo.Service;

import DesafioTecnicoSuperacom.example.demo.Model.TaskList;
import DesafioTecnicoSuperacom.example.demo.repository.TaskListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskListService {
    @Autowired
    private TaskListRepository taskListRepository;

    public List<TaskList> findAll() {
        return taskListRepository.findAll();
    }

    public TaskList findById(Long id) {
        return taskListRepository.findById(id).orElseThrow(() -> new RuntimeException("TaskList not found"));
    }

    public TaskList save(TaskList taskList) {
        return taskListRepository.save(taskList);
    }

    public void delete(Long id) {
        taskListRepository.deleteById(id);
    }
}
