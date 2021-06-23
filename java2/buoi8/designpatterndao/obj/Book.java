package buoi8.designpatterndao.obj;

public class Book {
	// thuoc tinh
	// constructor
	//get/set
	private int id;
	private String name;
	private String description;
	private String title;
	private String author;
	private int publish;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String name, String description, String title, String author, int publish) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.title = title;
		this.author = author;
		this.publish = publish;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPublish() {
		return publish;
	}
	public void setPublish(int publish) {
		this.publish = publish;
	}
	
	
	
}
