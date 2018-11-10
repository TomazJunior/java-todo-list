package todo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import todo.entity.TodoItem;
import todo.repository.TodoItemRepository;

@RestController()
@RequestMapping("/todo")
public class TodoListController {
	
	@Autowired
	private TodoItemRepository todoRepository;
	
	@RequestMapping(value= "{id}", method= RequestMethod.GET)
	public Optional<TodoItem> getOne(@PathVariable(value= "id") String id) {
		return todoRepository.findById(id);
	}

	@RequestMapping(method= RequestMethod.GET)
	public List<TodoItem> getAll() {
		return todoRepository.findAll();
	}
	
	@RequestMapping(method= RequestMethod.POST)
	public TodoItem create(@RequestBody() TodoItem item) {
		return todoRepository.insert(item);
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Object> delete(@PathVariable(value= "id") String id) {
		todoRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
