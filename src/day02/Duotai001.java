package day02;

class Person1 {
	public void eat() {
		System.out.println("�Է�...");
	}
}

class Student1 extends Person1 {
	public void eat() {
		System.out.println("ѧ���ڳԷ�");
	}

	public void study() {
		System.out.println("ѧ����ѧϰ");
	}
}

class Teacher1 extends Person1 {
	public void eat() {
		System.out.println("��ʦ�ڳԷ�");
	}

	public void jiaoxue() {
		System.out.println("��ʦ���Ͽ�");
	}
}

class Worker1 extends Person1 {
	public void eat() {
		System.out.println("�����ڳԷ�");
	}

	public void work() {
		System.out.println("�����ڹ���");
	}
}

public class Duotai001 {

	public static void main(String[] args) {
		Person1 per = new Worker1();
		per.eat();
		Worker1 wor =(Worker1)per;
		wor.work();
		
		print(new Student1());
		print(new Teacher1());
	}
public static void print(Person1 per){
	per.eat();
	if(per instanceof Student1){
		Student1 stu = (Student1)per;
		stu.study();
	}
	if(per instanceof Teacher1){
		Teacher1 tea= (Teacher1)per;
		tea.jiaoxue();
	}
}
}
