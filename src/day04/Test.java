package day04;

public class Test {

	public static void main(String[] args) {
		Person per =new Person("����", 12);//�쳣ԭ��Ӧ������ת��������ת��
		student stu=(student)per;
		stu.fun();
		
	}
}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "������" + name + " ���䣺" + age;
	}
}

class student extends Person {
	public int number;

	public student(String name, int age, int number) {
		super(name, age);
		this.number = number;
	}
	public void fun(){
		System.out.println("hello world");
	}
}