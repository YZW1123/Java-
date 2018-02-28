package day03;

public class Shuohuo {
	public static void main(String[] args) {
		//java.lang.ArrayIndexOutOfBoundsException  java的空指针异常
		//产生空指针的原因
		//只实例化没有输出
//		Fruit f0 = new Apple();
//		f0.eat();
//		Fruit f1 = new Banana();
//		f1.eat();
//		Fruit f2 = new Orange();
//		f2.eat();
		//向上转型
		//定义
		//public 返回类型 方法类型 方法名称（参数类型 参数）{}
		Fruit f=Factory.getInstance(args[0]);
		//Fruit f =fs;
		//Factory.getInstance(args[0]);等价于f getInstance(String a);
		//返回类型 Fruit
		//静态方法 类名称.方法名称()
		//String []
		//数组名[下标]
		if(f!=null){
		f.eat();//对象.方法
		}
	}
}
class Factory{
	//Fruit fs = new Apple();
	public static  Fruit getInstance(String a){
	if("Apple".equals(a)){
		return new Apple();
	}else if ("Banana".equals(a)) {
		return new Banana();
	} else if ("Orange".equals(a)) {
		return new Orange();
	}else{
		return null;
	}
}
}
interface Fruit {
	void eat();
}

class Apple implements Fruit {
	@Override
	public void eat() {
		System.out.println("吃苹果");
	}
}

class Banana implements Fruit {
	@Override
	public void eat() {
		System.out.println("吃香蕉");
	}
}

class Orange implements Fruit {
	@Override
	public void eat() {
		System.out.println("吃橘子");
	}
}