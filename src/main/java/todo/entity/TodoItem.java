package todo.entity;
import org.springframework.data.annotation.Id;

public class TodoItem {
	
	@Id
	public String id;
	public String title;
	public String description;

	public TodoItem(String title, String description) {
		this.title = title;
		this.description = description;
	}

}
