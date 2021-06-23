package buoi4;

public class People {
	//1. field
	private String name;
	private String birthday;
	private String address;
	private String identity;
	
	// method
	
	// constructor - ham khoi tao
	
	
	
	public void print() {
		System.out.println("name: "+ name + "; birthday=" + birthday + "; address="+ address + "; identity="+ identity);
	}
	// 2. Tao constructor
	public People(String name, String birthday, String address) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.address = address;
	}

	public People(String name, String birthday, String address, String identity) {
		this(name, birthday, address);
		this.identity = identity;
	}

	public People() {
	}
	
	
	// 3. tao ham set/get
	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getName() {
		return name;
	}

	public String getBirthday() {
		return "Ban da co ngay sinh";
	}

	public String getAddress() {
		return address;
	}

	public void print2() {
		System.out.println("Thong tin cua People");
		this.print();
	}
	public People getClone() {
		return this;
	}
	//4. cac method khac
	
	
	public static void main(String[] args) {
		// this khong duoc dung trong ham main
		//this.name  = "aaa";
	}
	
}
