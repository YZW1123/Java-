package day01;

public class Person1 {
	public String name;
	public int age;
	// ����һ������Ĺ���
	public String country = "�л����񹲺͹�";

	// ����һ������������Ϣ�ķ���
	public String info() {
		return "������" + name + "���䣺" + age + "���ң�" + country;
	}

	// ����һ�����췽��Ϊ���ิ������������
	public Person1(String n, int a) {
		name = n;
		age = a;
	}
}
