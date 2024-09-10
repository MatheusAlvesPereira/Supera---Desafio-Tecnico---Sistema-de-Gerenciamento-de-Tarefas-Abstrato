package DesafioTecnicoSuperacom.example.demo.Service;

import DesafioTecnicoSuperacom.example.demo.Model.Item;
import DesafioTecnicoSuperacom.example.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    public Item findById(Long id) {
        return itemRepository.findById(id).orElseThrow(() -> new RuntimeException("Item not found"));
    }

    public Item save(Item item) {
        return itemRepository.save(item);
    }

    public void delete(Long id) {
        itemRepository.deleteById(id);
    }

    public List<Item> findByTaskListId(Long taskListId) {
        return itemRepository.findByTaskListId(taskListId);
    }
}
