package DesafioTecnicoSuperacom.example.demo.repository;

import DesafioTecnicoSuperacom.example.demo.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findByTaskListId(Long taskListId);
}
