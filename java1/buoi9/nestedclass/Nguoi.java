package buoi9.nestedclass;

public class Nguoi {
	private String ten;
	private int age;
	private DiaChi diachi;
	private ChungMinhThu cmt;
	private static String type = "NGUOI";
	public Nguoi(String ten, int age, DiaChi diachi, ChungMinhThu cmt) {
		super();
		this.ten = ten;
		this.age = age;
		this.diachi = diachi;
		this.cmt = cmt;
	}

	public Nguoi() {
		super();
		this.diachi = this.new DiaChi();
		this.cmt = new Nguoi.ChungMinhThu();
	}
	
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public DiaChi getDiachi() {
		return diachi;
	}

	public void setDiachi(DiaChi diachi) {
		this.diachi = diachi;
	}

	public ChungMinhThu getCmt() {
		return cmt;
	}

	public void setCmt(ChungMinhThu cmt) {
		this.cmt = cmt;
	}

	public static String getType() {
		return type;
	}

	public static void setType(String type) {
		Nguoi.type = type;
	}

	public void showInfo() {
		System.out.println("Ten: "+ this.ten
						+ "; age: "+ this.age 
						+ "Dia chi: "+ this.diachi.toString() 
						+ "; CMT: "+ this.cmt.toString());
	}
	
	// member class / non-static nested class
	class DiaChi{
		private String tinh;
		private String huyen;
		private String xa;
		public DiaChi() {
			super();
			// TODO Auto-generated constructor stub
		}
		public DiaChi(String tinh, String huyen, String xa) {
			super();
			this.tinh = tinh;
			this.huyen = huyen;
			this.xa = xa;
		}
		public String getTinh() {
			return tinh;
		}
		public void setTinh(String tinh) {
			this.tinh = tinh;
		}
		public String getHuyen() {
			return huyen;
		}
		public void setHuyen(String huyen) {
			this.huyen = huyen;
		}
		public String getXa() {
			return xa;
		}
		public void setXa(String xa) {
			this.xa = xa;
		}
		// hien thi thong tin cua 1 DiaChi
		@Override
		public String toString() {
			return "Tinh: "+ this.tinh + "; Huyen: "+ this.huyen + "; Xa: "+ this.xa;
		}
		// trong pham vi cua class ben trong, 
		//co the truy cap duoc tat cac cac thanh phan cua class ben ngoai 
		public void showOuterNguoi() {
			System.out.println("Ten Nguoi: "+ ten + "; Tuoi: "+ age);
		}
	}// end DiaChi
	
	// static-nested class
	// mang day du thanh phan cua 1 class
	// tuy nhien no chi truy cap toi cac thanh phan static cua class ben ngoai
	static class ChungMinhThu{
		private String soCmt;
		private String ngayCap;
		private String noiCap;
		public ChungMinhThu() {
			super();
			// TODO Auto-generated constructor stub
		}
		public ChungMinhThu(String soCmt, String ngayCap, String noiCap) {
			super();
			this.soCmt = soCmt;
			this.ngayCap = ngayCap;
			this.noiCap = noiCap;
		}
		public String getSoCmt() {
			return soCmt;
		}
		public void setSoCmt(String soCmt) {
			this.soCmt = soCmt;
		}
		public String getNgayCap() {
			return ngayCap;
		}
		public void setNgayCap(String ngayCap) {
			this.ngayCap = ngayCap;
		}
		public String getNoiCap() {
			return noiCap;
		}
		public void setNoiCap(String noiCap) {
			this.noiCap = noiCap;
		}
		@Override
		public String toString() {
			return "So CMT: " + this.soCmt + "; ngay cap: "+ this.ngayCap + "; noi cap: "+ this.noiCap;
		}
		// trong static member class chi truy cap duoc cac thanh phan static cua class ben ngoai
		public void showOuterNguoi() {
			System.out.println("LOAI DOI TUONG: "+ Nguoi.type);
		}
	}// end ChungMinhThu
	
	// class local la class nam trong 1 ham
	// pham vi cua no cung chi trong ham do ma thoi
	public void checkVung() {
		int i = 10;
		class Vung{
			public String noiSinh;
			public String noiCapCMT;
			public Vung() {
				super();
				// TODO Auto-generated constructor stub
			}
			public Vung(String noiSinh, String noiCapCMT) {
				super();
				this.noiSinh = noiSinh;
				this.noiCapCMT = noiCapCMT;
			}
			public String soSanhQueQuan() {
				if (this.noiSinh != null && this.noiSinh.equals(this.noiCapCMT)) {
					return "Ban dang song tai que huong noi sinh";
				} else {
					return "Ban hien khong song tai que huong noi sinh";
				}
			}// end function soSanhQueQuan
		}// end Vung
		// tao doi tuong local class
		Vung vung = new Vung();
		vung.noiCapCMT = cmt.getNoiCap();
		vung.noiSinh = diachi.getTinh();
		System.out.println(vung.soSanhQueQuan());
		/*
		if (cmt.getNoiCap().equals(diachi.getTinh())) {
			System.out.println( "Ban dang song tai que huong noi sinh" );
		} else {
			System.out.println(  "Ban hien khong song tai que huong noi sinh");
		}
		*/
	}
	
	interface IAction{
		void doAction();
	}
	class Action implements IAction{

		@Override
		public void doAction() {
			System.out.println("Con nguoi thi phai an, uong, hit, ngu");
		}
		
	}
	
}// end Nguoi
