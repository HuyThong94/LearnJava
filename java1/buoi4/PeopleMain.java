package buoi4;

public class PeopleMain {

	public static void main(String[] args) {
		People dung = new People();
		dung.setIdentity("112222");
		System.out.println("Identity cua Dung: "+ dung.getIdentity());
		//dung.name = "aa";
		dung.print();
		
		People mai = new People("mai","01/01/2000","ha noi", "");
		/*
		 * hoang.name = "Hoang";
		hoang.age = 18;
		hoang.address = "Ha Noi";
		hoang.phone = "097832";
		 * */
		mai.print();
		
		People cuong = mai.getClone();
		
		//People cuong = mai;
		cuong.print();
				
	}

}
