package buoi5.mang;

import java.util.Scanner;

import buoi4.baitap.Book;

public class MangCoDinh {

	public static void main(String[] args) {
		//int[] months = new int[12];
		//int[] months = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int[] months = new int[12];
		months[0] = 1;
		months[1] = 2;
		
		months[11] = 12;
		
		System.out.println("mang tai phan tu thu 3: "+ months[2]);
		String[] languages = {"python","java","c","c++","c#","php","javascript"};
		Scanner sc = new Scanner(System.in);
		Book[] books = new Book[50];
		String confirm = "";
		int index = 0;
		do {
			Book book = new Book();
			book.inputBook(sc);
			books[index] = book;
			index++;
			System.out.println("Ban co muon tiep tuc nhap 1 book moi hay khong? (y: dong y):");
			confirm = sc.nextLine();
		}while(confirm.equals("y"));
		for(int i=0; i< 12; i++) {
			System.out.printf("%d \t",months[i]);
		}
		System.out.println("\nMang languages: ");
		int j=0;
		while (j < 7) {
			System.out.printf("%s \t", languages[j]);
			j++;
		}
		
		System.out.println("\nMang Book: ");
		for(Book temp : books) {
			//System.out.println(temp);
			if (temp != null) {
				temp.outputBook();
			}
		}
		
		
	}

}
