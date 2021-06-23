import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IAdd add1 = new Add();
		add1.add(10, 20);
		
		// class anonimous
		new IAdd() {
			@Override
			public void add(int num1, int num2) {
				System.out.println(num1 + "+ "+ num2 + " = "+ (num1 + num2));
			}
		}.add(10, 30);
		
		// su dung bieu thuc lambda
		IAdd add3 = (int n1 , int n2)->System.out.println(n1 + "+ "+ n2 + " = "+ (n1 + n2));
	
		add3.add(10, 40);
		
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("C#");
		list.add("php");
		// anounimous class
		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		List<People> listPeople = new ArrayList<People>();
		listPeople.add(new People(2, "z1"));
		listPeople.add(new People(5, "b2"));
		listPeople.add(new People(4, "a1"));
		listPeople.add(new People(1, "c6"));
		listPeople.add(new People(3, "d6"));
		
		int sst = 0;
		
		Comparator<People> com1 = (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		};
		Collections.sort(listPeople, com1);
		listPeople.forEach((p)->{
			System.out.println(p.name + ": "+ p.id);
		});
	} 
}
// functional interface: interface chi chua duy nhat 1 ham abstract
interface IAdd{
	void add(int num1, int num2);
}
class Add implements IAdd{
	@Override
	public void add(int num1, int num2) {
		System.out.println(num1 + "+ "+ num2 + " = "+ (num1 + num2));
	}
	
}
class People{
	int id;
	String name;
	public People(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}