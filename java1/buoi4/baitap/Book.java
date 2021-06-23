package buoi4.baitap;
import java.text.ParseException;
import java.text.SimpleDateFormat;
// khai bao thu vien
import java.util.*;

public class Book {
	private String name;
	private Author author;
	private float price;
	private Date publishDate;
	private String type;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Book() {
		super();
	}
	public Book(String name, Author author, float price, Date publishDate, String type) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.publishDate = publishDate;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void inputBook(Scanner sc) {
		System.out.println("Book's Name: ");
		this.name = sc.nextLine();
		System.out.println("Author: ");
		// khoi tao de author != null
		this.author = new Author();
		this.author.inputAuthor(sc);
		while (true) {
			System.out.println("Price: ");
			this.price = sc.nextFloat();
			if (this.price > 0) {
				break;
			}
		}
		sc.nextLine();
		
		while(true) {
			System.out.println("Publish Date: ");
			try {
				this.publishDate = sdf.parse(sc.nextLine());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (this.publishDate != null) {
				break;
			}
		}
		do {
			System.out.println("Type (VH, NT, TH, KH,GT): ");
			this.type = sc.nextLine();
		} while(!this.type.equals("VH") && !this.type.equals("NT") 
				&& !this.type.equals("TH") && !this.type.equals("KH") 
				&& !this.type.equals("GT"));
	}
	public void outputBook() {
		System.out.println("------Book---------");
		System.out.println("Name: "+ this.name);
		System.out.println("Author: "+ this.author.outputAuthor());
		System.out.println("Price: "+ this.price);
		System.out.println("PublishDate: "+ sdf.format(this.publishDate));
		System.out.println("Type: "+ this.type);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book book = new Book();
		book.inputBook(sc);
		book.outputBook();
	}
}
class Author{
	//1. field
	//2. constructor
	//3. set/get
	//4. method
	private String name;
	private String email;
	private char gender;
	public Author() {
		super();
	}
	public Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getGenderString() {
		return this.gender=='f'?"Female":(this.gender == 'm'?"Male":"Other");
	}
	public void inputAuthor (Scanner sc) {
		System.out.println("Name: ");
		this.name = sc.nextLine();
		System.out.println("Email: ");
		this.email = sc.nextLine();
		byte temp;
		while (true) {
			System.out.println("Gender (m-109|f-102|o-111): ");
			temp = sc.nextByte();
			if (temp == 'f' || temp == 'm' || temp == 'o') {
				break;
			}
		}
		this.gender = (char) temp;
		sc.nextLine();
	}
	public String outputAuthor() {
		return "Name: " + this.name + "; email: "+ this.email + "; gender: "+ this.getGenderString();
	}
	
	
}
