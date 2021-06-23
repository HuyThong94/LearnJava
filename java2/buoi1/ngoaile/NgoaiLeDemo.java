package buoi1.ngoaile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NgoaiLeDemo {
	/*
	 Ghi du lieu xuong file
	 * */
	public static void main(String[] args) {
		System.out.println("Bat dau!");
		// ghi xuong file sinhvien.txt trong thu muc project code -> duong dan tuong doi
		FileWriter fw = null;
		try {
			// khoi tao doi tuong ghi file ket noi voi nguon la file sinhvien.txt
			fw = new FileWriter("sinhvien.txt");
			//System.out.println(1/0);
			// ghi noi dung xuong file
			fw.write("Buoi 1 - hoc lai ngoai le");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// du xong try, hoac vao catch thi van phai ket thuc 1 viec gi do
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		// try-with-resource
		try (// khoi tao doi tuong kieu class implement interface AutoCloseable
				FileWriter fw1 = new FileWriter("sinhvien1.txt");
				){
			// doan code co kha nang xay ra loi
			fw1.write("Ngoai le: try with resource");
		}catch(Exception e) {
			// bat doi tuong ngoai le
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		/*
		 Cac truong hop 
		 * */
		
		//Duog dan tuyet doi:  D:\WORK\Java\Course\SEM2\sinhvien.txt
		// duong dan tuong doi: sinhvien.txt hoac sem2\sinhvien.txt
		// doc file
		Scanner sc = new Scanner("sinhvien.txt");
		
		System.out.println("Ket thuc!");
	}

}
