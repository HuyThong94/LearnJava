package buoi3.iostream;

import java.io.File;

public class FileDescription {

	public static void main(String[] args) {
		// Duong dan tuyet doi
		// File tham chieu tới thư mục
		File directory = new File("D:\\WORK\\fpt");
		// File tham chiếu tới 1 file.
		File fileText = new File("D:\\WORK\\fpt\\Su dung Sublimetext.txt");
		
		// Duong dan tuong doi:
		// D:\WORK\Java\workspace\T2007E_Java2
		File dirTuongDoi = new File("tailieu\\docfile\\test");
		// => hieu la : D:\WORK\Java\workspace\T2007E_Java2\tailieu\docfile\test
		File fileTuongDoi = new File("sinhvien.data");
		// => hieu la : D:\WORK\Java\workspace\T2007E_Java2\sinhvien.data
		String pathRoot = System.getProperty("user.dir");
		
		System.out.println("Root Path: "+ pathRoot);
		System.out.println("directory exist:"+ directory.exists());
		System.out.println("fileText exist:"+ fileText.exists());
		System.out.println("dirTuongDoi exist:"+ dirTuongDoi.exists());
		System.out.println("fileTuongDoi exist:"+ fileTuongDoi.exists());
		
		System.out.println("File directory la thu muc? "+ directory.isDirectory()+"; la file: "+ directory.isFile());
		System.out.println("File fileText la thu muc? "+ fileText.isDirectory()+"; la file: "+ fileText.isFile());
	}

}
