package DesafioTecnicoSuperacom.example.demo.repository;

import DesafioTecnicoSuperacom.example.demo.Model.TaskList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskListRepository extends JpaRepository<TaskList, Long> {
}