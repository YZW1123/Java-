package day03;
//Object 类
//Object 类是所有应用数据类型的父类
//接口 数组 类 抽象类 类
public class OBJECT {
	public static void main(String[] args) {
       //向上转型
		Object obj =new Person("张三", 12);
		//向下转型
		Person per=(Person)obj;
		System.out.println(per.info());
		//向上转型
		Object obj1 = args;
		//向下转型
		String[] str=(String[])obj1;
		Object obj2 =new BB();
		Person per1 =new Person ("王二",18);
		System.out.println(per1.toString());
	}
}
interface AA{}
class BB implements AA{}
class Person {
	public String name ;
	public int age;
	public String info (){
		return "姓名："+name+"  年龄："+age;
		}
	public String toString(){
		return "姓名："+name+"  年龄："+age;
	}
	public Person(String name ,int age ){
		this.age=age;
		this.name=name;
	}
}
//为什么要定义Object类
//向上转型能体现出类的多态性，实现参数的统一