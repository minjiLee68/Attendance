package model;

public class Student {
	public int studentNumber;
	String name;
	String birth;
	String phoneNumber;

	public Student(int num, String name, String brith, String phoneNB) {
		this.studentNumber = num;
		this.name = name;
		this.birth = brith;
		this.phoneNumber = phoneNB;
	}

	public void introduceMyself() {
		System.out.println("=====================");
		System.out.println("studentNumber :" + studentNumber);
		System.out.println("name :" + name);
		System.out.println("birth :" + birth);
		System.out.println("phoneNumber :" + phoneNumber);
		System.out.println("=====================");
	}

}
