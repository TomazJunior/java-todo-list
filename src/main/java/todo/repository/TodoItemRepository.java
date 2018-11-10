package todo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import todo.entity.TodoItem;

public interface TodoItemRepository extends MongoRepository<TodoItem, String> {

}