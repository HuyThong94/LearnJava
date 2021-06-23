package buoi8.iinterface;

import buoi6.kethua.People;
import buoi6.kethua.Student;
import buoi7.truutuong.EmployeeFulltime;
import buoi7.truutuong.EmployeeParttime;

public class TeacherMain {
	public static People getObject(String type) {
		People p = new People();
		if (type.equals("student"))
			p = new Student();
		else if (type.equals("fulltime"))
			p = new EmployeeFulltime();
		else if (type.equals("parttime"))
			p = new EmployeeParttime();
		else if (type.equals("teacher"))
			p = new Teacher();
		return p;
	}
	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		IWork w1 = new Teacher();
		IInOut i1 = new Teacher();
		People p1 = getObject("student");
		w1.doWork();
		// downcasting IWork -> Teacher
		System.out.println(((Teacher)w1).outputData());
		System.out.println(t1 instanceof Teacher);
		System.out.println(t1 instanceof IWork);
		System.out.println(t1 instanceof IInOut);
		System.out.println(t1 instanceof People);
	}

}
