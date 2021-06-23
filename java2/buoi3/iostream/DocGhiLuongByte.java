package buoi3.iostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DocGhiLuongByte {

	public static void main(String[] args) {
		File source = new File("book.dat");
		// ghi file
		try (FileOutputStream fos = new FileOutputStream(source)
				){
			// ghi file
			String chuoi = "Toi dang hoc code java \n No rat la phuc tap";
			fos.write(chuoi.getBytes());
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		// doc file
		//B1: tao stream ket noi voi nguon: file
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(source);
			//B2: thuc thi doc/ ghi
			int ch;
			while((ch = fis.read()) != -1) {
				System.out.print((char)ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//B3: close stream
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
