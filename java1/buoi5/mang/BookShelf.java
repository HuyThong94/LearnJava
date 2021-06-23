package buoi5.mang;

import java.util.Scanner;

import buoi4.baitap.Book;

public class BookShelf {
	private String name;
	private int position;
	private Book[] books = new Book[50];
	private int maxIndex;
	public BookShelf() {
		maxIndex = 0;
	}
	public BookShelf(String name, int position) {
		super();
		this.name = name;
		this.position = position;
		this.maxIndex = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public Book[] getBooks() {
		return books;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
	public int getMaxIndex() {
		return maxIndex;
	}
	public void setMaxIndex(int maxIndex) {
		this.maxIndex = maxIndex;
	}
	// nhap thong tin cua 1 ke sach moi
	public void inputNewBookShelf(Scanner sc) {
		System.out.println("-----Nhap 1 ke sach moi----");
		System.out.println("Name: ");
		this.name = sc.nextLine();
		while(true) {
			System.out.println("Position: ");
			this.position = sc.nextInt();
			if (this.position > 0) {
				break;
			}
		}
		sc.nextLine();
		this.inputNewBookToShelf(sc);
	}
	// nhap thong tin cua tap sach ma da co ke sach
	public void inputNewBookToShelf(Scanner sc) {
		System.out.println("Nhap danh sach sach trong ke: ");
		String confirm = "";
		do {
			Book book = new Book();
			book.inputBook(sc);
			this.books[this.maxIndex] = book;
			this.maxIndex ++;
			System.out.println("Ban co muon tiep tuc nhap 1 quyen sach nua khong? (y: dong y)");
			confirm = sc.nextLine();
		}while(confirm.equals("y") && this.maxIndex < 50);
	}
	// xuat thong tin ke sach
	public void outputBookShelf() {
		System.out.println("--------Book Shelf------");
		System.out.println("Name: "+ this.name);
		System.out.println("Position: "+ this.position);
		System.out.println("Have " + this.maxIndex + " books in shelf: ");
		for(int i=0; i< this.maxIndex; i++) {
			System.out.println("Book number: "+ (i+1)+"------->");
			this.books[i].outputBook();
		}
	}
}
