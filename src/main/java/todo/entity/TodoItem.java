package todo.entity;

public class TodoItem {
	private String id;
	private String title;
	private String description;

	public TodoItem(String id, String title, String description) {
		this.setId(id);
		this.setTitle(title);
		this.setDescription(description);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
