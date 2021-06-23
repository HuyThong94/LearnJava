package buoi1.ngoaile;

import java.util.Date;
import java.util.Scanner;

public class TaiKhoan {
	private String maKh;
	private String tenKh;
	private int loaiKh;
	private	String soTk;
	// cmt
	private String iD;
	private Date ngaySinh;
	private Date ngayTao;
	private double soTien;
	public TaiKhoan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TaiKhoan(String maKh, String tenKh, int loaiKh, String soTk, String iD, Date ngaySinh, Date ngayTao,
			double soTien) {
		super();
		this.maKh = maKh;
		this.tenKh = tenKh;
		this.loaiKh = loaiKh;
		this.soTk = soTk;
		this.iD = iD;
		this.ngaySinh = ngaySinh;
		this.ngayTao = ngayTao;
		this.soTien = soTien;
	}
	public String getMaKh() {
		return maKh;
	}
	public void setMaKh(String maKh) {
		this.maKh = maKh;
	}
	public String getTenKh() {
		return tenKh;
	}
	public void setTenKh(String tenKh) {
		this.tenKh = tenKh;
	}
	public int getLoaiKh() {
		return loaiKh;
	}
	public void setLoaiKh(int loaiKh) {
		this.loaiKh = loaiKh;
	}
	public String getSoTk() {
		return soTk;
	}
	public void setSoTk(String soTk) {
		this.soTk = soTk;
	}
	public String getiD() {
		return iD;
	}
	public void setiD(String iD) {
		this.iD = iD;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public Date getNgayTao() {
		return ngayTao;
	}
	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}
	public double getSoTien() {
		return soTien;
	}
	public void setSoTien(double soTien) {
		this.soTien = soTien;
	}
	
	public void nhap(Scanner sc) {
		System.out.println("Nhap ma:");
		this.maKh = sc.nextLine();
		System.out.println("Nhap ten: ");
		this.tenKh = sc.nextLine();
		while (true) {
			System.out.println("Nhap loai kh ( 0: ca nhan; 1: doanh nghiep ) ");
			String input = sc.nextLine();
			if (input.equals("0") || input.equals("1")) {
				// chuyen doi tu String -> int
				this.loaiKh = Integer.parseInt(input);
				break;
			}
		}
		// stk:
		while(this.soTk == null) {
			System.out.println("Nhap so tk: ");
			String input = sc.nextLine();
			// check 
			// 1: sotk co 8 ky tu
			// 2: sotk chi chua cac ky tu so
			// 3: sotk bat dau 00
			if (input != null && input.length() == 8) {
				try {
					long lInput = Long.parseLong(input);
					if (input.startsWith("00")) {
						this.soTk = input;
						break;
					} else {
						System.out.println("So tk phai la chuoi co 8 ky tu so, bat dau bang 00");
					}
				}catch(Exception e) {
					System.out.println("So tk phai la chuoi co 8 ky tu so");
				}
			} else {
				System.out.println("So tk phai la chuoi co 8 ky tu");
			}
		}
		System.out.println("Sotk: "+ this.soTk);
	}
	public static void main(String[] args) {
		int i = 10;
	
		Integer ii = 10;
		
		// auto boxing
		Integer iii = i;
		// auto unboxing
		i = ii;
		// kieu tham chieu thi so sanh gia tri bang ham equals
		if (ii.equals(iii)) {
			
		}
		
		
		/*
		Scanner sc = new Scanner(System.in);
		TaiKhoan tk = new TaiKhoan();
		tk.nhap(sc);
		
		System.out.println("End!");
		*/
	}
	
}
