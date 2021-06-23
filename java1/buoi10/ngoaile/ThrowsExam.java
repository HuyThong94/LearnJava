package buoi10.ngoaile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ThrowsExam {

	public static void main(String[] args) {
		// neu ham khai bao uncheckedexception -> khong bat buoc phai xu ly ngoai le
		//phepchia(1, 0);
		// neu khai bao ham ra checkexception -> phai tuong minh 
		try {
			readFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End");
	}
	// ham khong bat xu ly ngoai le ma khai bao -> throws,
	// neu co ngoai le xay ra trong ham thi -> noi dung ham se bat hoac day di tiep
	public static ArrayList<Student> readFile() throws FileNotFoundException {
		ArrayList<Student> res = new ArrayList<Student>();
		File filedssv = new File("D:\\WORK\\Java\\Baitap\\danhsachsv.txt");
		Scanner sc = new Scanner(filedssv);
		// doc file
		while (sc.hasNext()) {
			String line = sc.nextLine();
			
			if (line != null) {
				String[] svarray = line.split(",");
				if (svarray.length == 4) {
					// dung 
					System.out.println(line);
					//res.add(svarray);
					// check ngoai le va chuyen 1 mang -> 1 doi tuong student -> add danh sach
					Student s = new Student();
					//s.id = svarray[0];
					s.name = svarray[1];
					// xu ly try-parse
					s.age = Integer.parseInt(svarray[2]);
					s.address = svarray[2];
					// s -> du cac du lieu -> add danh sach
					res.add(s);
				} else {
					// throw: nem ra 1 doi tuong ngoai le cu the
					throw new ArrayIndexOutOfBoundsException("Dong thong tin sv phai gom masv,ten,tuoi,diachi");
				}
			}
		}
		return res;
	}
	public static void phepchia(int num1, int num2) throws ArithmeticException{
		System.out.println(num1/ num2);
	}
}
class Student{
	int id;
	String name;
	int age;
	String address;
}
