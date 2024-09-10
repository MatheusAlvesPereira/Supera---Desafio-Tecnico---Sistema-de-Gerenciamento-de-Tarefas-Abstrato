package DesafioTecnicoSuperacom.example.demo.Controller;

import DesafioTecnicoSuperacom.example.demo.Model.TaskList;
import DesafioTecnicoSuperacom.example.demo.Service.TaskListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tasklists")
public class TaskListController {
    @Autowired
    private TaskListService taskListService;

    @GetMapping
    public ResponseEntity<List<TaskList>> getAllTaskLists() {
        List<TaskList> taskLists = taskListService.findAll();
        return new ResponseEntity<>(taskLists, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskList> getTaskListById(@PathVariable Long id) {
        TaskList taskList = taskListService.findById(id);
        return new ResponseEntity<>(taskList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<TaskList> createTaskList(@RequestBody TaskList taskList) {
        TaskList createdTaskList = taskListService.save(taskList);
        return new ResponseEntity<>(createdTaskList, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaskList> updateTaskList(@PathVariable Long id, @RequestBody TaskList taskList) {
        taskList.setId(id);
        TaskList updatedTaskList = taskListService.save(taskList);
        return new ResponseEntity<>(updatedTaskList, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTaskList(@PathVariable Long id) {
        taskListService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
