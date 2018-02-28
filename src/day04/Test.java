package day04;

public class Test {

	public static void main(String[] args) {
		Person per =new Person("李四", 12);//异常原因：应先向上转型再向下转型
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
		return "姓名：" + name + " 年龄：" + age;
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