package buoi7.doituong;

import java.util.HashSet;
import java.util.Set;

public class SoSanhDoiTuong {

	public static void main(String[] args) {
		People p1 = new People("dung", 40);
		System.out.println(p1);
		People p2 = p1;
		People p3 = new People("dung", 40);
		System.out.println("p1 == p2 : "+ (p1 == p2));
		System.out.println("p1 == p3 : "+ (p1 == p3));
		System.out.println("(p1.equals(p2)) : "+ (p1.equals(p2)));
		System.out.println("(p1.equals(p3)) : "+ (p1.equals(p3)));
		p1.equals(new Object());
		System.out.println("Them cac phan tu vao set: ");
		Set<People> set = new HashSet<People>();
		System.out.println(set.add(p1));
		System.out.println(set.add(p2));
		System.out.println(set.add(p3));
		System.out.println("set co so phan tu: "+ set.size());
	}

}
class People {
	String name;
	int age;
	public People(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "name: " + this.name + "; age: "+ this.age;
	}
//	@Override
//	public boolean equals(Object obj) {
//		if (obj == null)
//			return false;
//		if (!(obj instanceof People))
//			return false;
//		People other = (People) obj;
//		return this.name.equals(other.name) && this.age == other.age;
//	}
}