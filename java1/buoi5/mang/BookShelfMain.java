package buoi5.mang;

import java.util.Scanner;

public class BookShelfMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookShelf shelf = new BookShelf();
		shelf.inputNewBookShelf(sc);
		shelf.outputBookShelf();
	}

}
