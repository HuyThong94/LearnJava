package buoi4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SinhVien {
	// 1. Tao field
	private String ten;
	private Date ngaySinh;
	private String diachi;
	private float diemToan;
	private float diemVan;
	private float diemAnh;
	private float diemTb;
	private String hocLuc;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	// 2. Constructor
	public SinhVien() {
		super();
	}
	public SinhVien(String ten, Date ngaySinh, String diachi, float diemToan, float diemVan, float diemAnh) {
		super();
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.diachi = diachi;
		this.diemToan = diemToan;
		this.diemVan = diemVan;
		this.diemAnh = diemAnh;
		this.setDiemTb();
	}

	// 3. Set/get
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNgaySinh() {
		return sdf.format(ngaySinh);
	}

	public void setNgaySinh(String ngaySinh) {
		// 12/01/1980
		try {
			// chuyen doi kieu string sang Date
			this.ngaySinh = sdf.parse(ngaySinh);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
		this.setDiemTb();
	}

	public float getDiemVan() {
		return diemVan;
	}

	public void setDiemVan(float diemVan) {
		this.diemVan = diemVan;
		this.setDiemTb();
	}

	public float getDiemAnh() {
		return diemAnh;
	}

	public void setDiemAnh(float diemAnh) {
		this.diemAnh = diemAnh;
		this.setDiemTb();
	}

	public float getDiemTb() {
		return diemTb;
	}

	private void setDiemTb() {
		this.diemTb = (this.diemToan + this.diemVan + this.diemAnh) / 3;
		if (this.diemTb < 4) {
			this.hocLuc = "Y";
		} else if (this.diemTb < 7) {
			this.hocLuc = "TB";
		} else if (this.diemTb < 8.5) {
			this.hocLuc = "K";
		} else {
			this.hocLuc = "G";
		}
	}

	public String getHocLuc() {
		return hocLuc;
	}

	// 4. method
	public void nhapSv(Scanner sc) {
		System.out.println("Nhap Ten:");
		this.ten = sc.nextLine();
		System.out.println("Nhap ngay sinh ( dd/MM/yyyy ): ");
		String ns = sc.nextLine();
		this.setNgaySinh(ns);
		System.out.println("Nhap dia chi: ");
		this.diachi = sc.nextLine();
		System.out.println("Nhap diem toan: ");
		this.diemToan = sc.nextFloat();
		System.out.println("Nhap diem van: ");
		this.diemVan = sc.nextFloat();
		System.out.println("Nhap diem anh: ");
		this.diemAnh = sc.nextFloat();
		this.setDiemTb();
		sc.nextLine();
	}

	public void xuatSv() {
		System.out.println("Ten: " + this.ten + "; ngaysinh: " + this.getNgaySinh() + "; diachi: " + this.diachi
				+ "; diem Toan=" + this.diemToan + "; diem Van=" + this.diemVan + "; diem Anh=" + this.diemAnh
				+ "; diem TB=" + this.diemTb + "; hoc luc=" + this.hocLuc);
	}
}
