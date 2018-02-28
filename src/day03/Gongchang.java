package day03;

public class Gongchang {

	public static void main(String[] args) {
		Fruits fs =factorys.get(args[0]);
		if(fs != null){
			fs.eat();
		}
	}
}
//1、定义一个接口
interface Fruits{
	void eat();
}
//2、丁一两个子类来是实现定义的接口
class Apples implements Fruits{
	@Override
	public void eat() {
		System.out.println("吃苹果");
	}
}
class Oranges implements Fruits{
	@Override
	public void eat() {
		System.out.println("吃橘子");
	}
}
//3、定义一个工厂，工厂的目的是为子类进行实例化
class factorys{
	public static Fruits get(String arg){
		if("Apples".equals(arg)){
			return new Apples();
		}else if("Oranges".equals(arg)){
			return new Oranges();
		}else{
			return null;
		}
	}
}