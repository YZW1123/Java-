package day03;

public class Anli {
	public static void main(String[] args) {
		AB a = (AB) new CD();
		/*a.print();*/
		Object obj = a;
		CD b = (CD) obj;
		b.Print1();
		b.print();
	}
}

interface AB {
	void print();
}

class CD implements AB {
	@Override
	public void print() {
		System.out.println("AAAA");
	}

	public void Print1() {
		System.out.println("BBBB");
	}
}
//总结
//1、接口表示一种标准
//2、接口表示的是一种能力
//3、表示服务端的远程试图方法传递给客户端
//接口总结
//1、接口避免了单继承，一个子类可以实现多个接口
//2、接口的实现一个定定义一个子类，通过implements 来实现接口
//3、接口中方法全部是抽象方法，全局常量的定义可以不加static
//4、接口要实现必须要子类，通过向上转换来实现接口实例化
//工厂模式
//GitHub
//Object 类
//为什么要使用Object类
//Object是所有类的父类