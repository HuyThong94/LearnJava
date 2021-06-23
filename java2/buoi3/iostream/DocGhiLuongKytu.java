package buoi3.iostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DocGhiLuongKytu {

	public static void main(String[] args) {
		try (
				InputStreamReader isr = new InputStreamReader(new FileInputStream(new File("bookvietnam.txt")), "UTF-8");
				OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(new File("bookvn2.data")), "UTF-8")
				){
			// doc/ ghi
			int ch;
			while(true) {
				ch = isr.read();
				osw.write(ch);
				if (ch == -1) {
					break;
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("End!");
	}

}
