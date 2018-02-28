package day01;

public class Person2 {
	public String name;
	public int age;
	// 定义一个人类的国家
	public static String country = "中华人民共和国";

	// 定义一个返回人类信息的方法
	public String info() {
		return "姓名：" + name + "年龄：" + age + "国家：" + country;
	}

	// 定义一个构造方法为人类复制姓名和年龄
	public Person2(String n, int a) {
		name = n;
		age = a;
	}

}
