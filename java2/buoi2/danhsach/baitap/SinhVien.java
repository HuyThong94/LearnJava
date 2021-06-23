package buoi2.danhsach.baitap;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SinhVien implements Comparable<SinhVien>{
	private int maSv;
	private String tenSv;
	private Date ngaySinh;
	private String maNganh;
	private int gioiTinh;
	private String diaChi;
	public SinhVien() {
		super();
	}
	public int getMaSv() {
		return maSv;
	}
	private void setMaSv(int maSv) {
		this.maSv = maSv;
	}
	public String getTenSv() {
		return tenSv;
	}
	public void setTenSv(String tenSv) {
		this.tenSv = tenSv;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getMaNganh() {
		return maNganh;
	}
	public void setMaNganh(String maNganh) {
		this.maNganh = maNganh;
	}
	public int getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public void nhap(Scanner sc) {
		while (this.maSv == 0) {
			// check gia tri hop le dau vao
			System.out.println("Ma: ");
			try {
				this.maSv = Integer.parseInt(sc.nextLine());
				if (this.maSv == 0) {
					System.out.println("Ma sv phai la so != 0");
				}
			}catch (Exception e) {
				System.out.println("Ma sv phai la so != 0");
			}
			// check masv co ton tai trong danh sach hay chua
			if (this.maSv != 0 && SinhVienDao.MASVSET.contains(this.maSv)) {
				System.out.println(this.maSv + " da duoc dung la 1 ma cua sinh vien trong ds");
				this.maSv = 0;
			}
		}
		System.out.println("Ten: ");
		this.tenSv = sc.nextLine();
		while (true) {
			System.out.println("Gioi tinh (0: nu, 1: nam; 2: khac): ");
			try {
				this.gioiTinh = Integer.parseInt(sc.nextLine());
			}catch(Exception e) {
				System.out.println("Gioi tinh phai la so (0|1|2)");
				this.gioiTinh = -1;
			}
			if (this.gioiTinh == 0 || this.gioiTinh == 1 || this.gioiTinh == 2) {
				break;
			}
		}
		while (this.ngaySinh == null) {
			System.out.println("Ngay sinh: ");
			try {
				this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
			}catch(Exception e) {
				System.out.println("Ngay sinh phai co dinh dang dd/MM/yyyy");
			}
		}
		System.out.println("Dia chi: ");
		this.diaChi = sc.nextLine();
		while(this.maNganh == null || this.maNganh.equals("")) {
			System.out.println("Ma nganh: ");
			this.maNganh = sc.nextLine();
		}
	}
	public void xuat() {
		System.out.print("Ma: "+ this.maSv + "; ten: "+ this.tenSv);
		System.out.print("; gioitinh: "+ (this.gioiTinh == 0?"Nu":(this.gioiTinh==1?"Nam":"Khac")));
		System.out.print("; ngaysinh: "+ new SimpleDateFormat("dd/MM/yyyy").format(this.ngaySinh));
		System.out.print("; diachi: "+ this.diaChi + "; manganh: "+ this.maNganh + "\n");
	}
	// sap xep tang dan theo tuan tu ten sv, ma nganh, masv
	@Override
	public int compareTo(SinhVien o) {
		// TODO Auto-generated method stub
		if (this.getTenSv() != null && this.getTenSv().equals(o.getTenSv())) {
			if (this.maNganh.equals(o.getMaNganh())) {
				return Integer.compare(this.maSv, o.getMaSv());
			} else 
				return this.maNganh.compareTo(o.getMaNganh());
		} else 
			return this.getTenSv().compareTo(o.getTenSv());
	}
	
	
}
