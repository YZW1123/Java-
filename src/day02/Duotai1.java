package day02;

class Person {
	public void eat() {
		System.out.println("�Է�...");
	}
}

class Student extends Person {
	public void eat() {
		System.out.println("ѧ���ڳԷ�");
	}

	public void study() {
		System.out.println("ѧ����ѧϰ");
	}
}

class Teacher extends Person {
	public void eat() {
		System.out.println("��ʦ�ڳԷ�");
	}

	public void jiaoxue() {
		System.out.println("��ʦ���Ͽ�");
	}
}

class Worker extends Person {
	public void eat() {
		System.out.println("�����ڳԷ�");
	}

	public void work() {
		System.out.println("�����ڹ���");
	}
}

public class Duotai1 {

	public static void main(String[] args) {
		fun(new Student());
		fun(new Teacher());
		fun(new Worker());
		//ʵ��������new ������
	}

	public static void fun(Student a) {
		a.eat();
		a.study();
	}

	public static void fun(Teacher a) {
		a.eat();
		a.jiaoxue();
	}

	public static void fun(Worker a) {
		a.eat();
		a.work();
	}

}
