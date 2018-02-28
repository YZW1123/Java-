package day03;
/**
 * 接口是一种规则和标准
 * 接口是类（在类中不能用public修饰）
 * 接口只能定义常量和抽象方法
 * 接口的定义
 *  interface 接口名称{
 *  //常量
 *  //抽象方法
 *  }
 * 应用接口
 *  子类 implements 接口名{
 *  //实现实例化
 *  接口 接口对象 = new 子类();//向上转型
 *  对象.方法名称
 *  子类 子类对象 =(子类)接口对象;
 *  }
 *  总结
 *  1、接口避免了单继承，一个子类可以实现多个接口。
 *  2、接口的实现一定定义一个子类，通过implements 来实现接口。
 *  3、接口中方法全部是抽象方法，全局常量的定义可以不加static。
 *  4、接口要实现必须要子类，通过向上转换来实现接口实例化。
 *  
 *  开发中接口的使用原则
 *  1、表示的是一种操作标准和规则
 *  2、表示的是一种能力
 *  3、将服务器端的远程方法提供客户端
 */
//接口是不能直接实例化
//

public class JieKou {
	public static void main(String[] args) {
		USB usb=new Dell();
		USB usb1=new Lenovo();
		Dell dell=(Dell)usb;
		dell.end();
		dell.start();
		dell.play();
		Lenovo le=(Lenovo)usb;
		le.end();
		le.start();
		le.play();
	}
}
interface USB{
	public final static String COLOR="黑色";
	public abstract void start();
	public abstract void end ();
}
class Dell implements USB {
	@Override
	public void start() {
           System.out.println("Dell 的"+COLOR+"USB开始工作");			
	}
	@Override
	public void end() {
		System.out.println("Dell的USB停止工作");
	}
	public void play(){
		System.out.println("Dell的游戏体验好");
	}
}
class Lenovo implements USB{
	@Override
	public void start() {
		System.out.println("联想的蓝色USB开始工作");
	}
	@Override
	public void end() {
		System.out.println("联想的USB停止工作");
	}
	public void play(){
		System.out.println("联想的游戏体验不佳");
	}
}
