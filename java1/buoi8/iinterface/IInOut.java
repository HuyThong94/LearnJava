package buoi8.iinterface;

import java.util.Scanner;

// 100% truu tuong
// -> khong tao duoc doi tuong toan tu new kieu Interface
// -> field: public + final + static
// -> method: public abstract
// -> 1 interface extends duoc nhieu interface khac
public interface IInOut{
	String name = "DungPT";
	public int i = 1;
	public final double d = 1.0;
	public final static char c = 'A';
	
	// phuong thuc truu tuong:
	void inputData(Scanner sc);
	public abstract String outputData();
	
}
