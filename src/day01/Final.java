package day01;
class DD{
	//通过final修饰的常量，常量名称所有的字母都要大写
	final double PI = 3.1415926;
	public void modifier(){
		System.out.println("这是一个final修饰的方法");
	}
}
class FF extends DD{
	public final void modifier(){
		System.out.println("这是一个final修饰的方法");
	}
}
public class Final {
	/**
	 * final 最后的，不可以修改的  太监
	 * final 修饰的类是不能够实现继承的
	 * final 修饰的属性是一个常量，常量是不能修改的
	 * final 修饰的方法不能实现覆写
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
