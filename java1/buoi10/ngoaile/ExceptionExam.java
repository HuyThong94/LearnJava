package buoi10.ngoaile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ngay sinh (dd/MM/yyyy): ");
		String sdate = sc.nextLine();
		Date birthday;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		// checked exception: ngoai le phat sinh canh bao vao luc compiler
		try {
			birthday = sdf.parse(sdate);
			String[] langs = {"java", "c++"};
			System.out.println("phan tu thu 2 trong mang languages: "+ langs[2]);
			String s = null;
			System.out.println(s.toString());
		} 
		catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("Chuoi dau vao phai khac null.");
		} catch (ParseException e) {
			System.out.println("Chuoi khong dung dinh danh ngay (dd/MM/yyyy)");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Loi dau vao");
			e.printStackTrace();
		}
		
		System.out.println("Nhap so thu 1: ");
		// unchecked exception: ngoai le phat sinh vao luc runtime
		try {
			// trong try la doan code co kha nang xay ra loi
			int num1 = sc.nextInt();
		} catch(Exception e) {
			// khi co ngoai le, thi so sanh doi tuong kieu ngoai le de vao catch bat ngoai le
			System.out.println("Nhap khong dung kieu");
		} finally {
			// du chay het try ( khong loi ) hoac co loi ( vao catch) thi cuoi cung van phai lam j do
			sc.nextLine();
		}
		
		System.out.println("Nhap phep tinh: ");
		String pt = sc.nextLine();
		// tim hieu customize exception tao exception check phep tinh ( +, -, *, /)
		while(true) {
			System.out.println("Nhap so thu 2: ");
			try {
				double num2 = sc.nextDouble();
				break;
			}catch (Exception e) {
				System.out.println("Khong dung dinh dang.");
			}
			finally {
				sc.nextLine();
			}
		}
		System.out.println("End");
	}

}
