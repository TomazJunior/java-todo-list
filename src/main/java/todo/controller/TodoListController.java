package todo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import todo.entity.TodoItem;

@RestController()
@RequestMapping("/todo")
public class TodoListController {
	
	@RequestMapping(value= "{id}", method= RequestMethod.GET)
	public TodoItem getOne(@PathVariable(value= "id") String id) {
		return new TodoItem(id, "Title ABC", "Description 1");
	}

	@RequestMapping(method= RequestMethod.GET)
	public List<TodoItem> getAll() {
		TodoItem[] list = {new TodoItem("1", "Title ABC", "Description 1"), new TodoItem("2", "Title ABC", "Description 1")};
		return Arrays.asList(list);
	}
	
	@RequestMapping(method= RequestMethod.POST)
	public TodoItem create(@RequestBody() TodoItem item) {
		return item;
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Object> delete(@PathVariable(value= "id") String id) {
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
