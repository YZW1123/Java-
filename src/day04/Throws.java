package day04;

public class Throws {
//throws关键字
	public static void main(String[] args)  {
		try {
			f();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			System.out.println("结束");
		}
	}
	public static void f()throws Exception{
		fun();
	}
	public static void fun()throws Exception{
		System.out.println("计算开始");
		System.out.println(0/10);
		System.out.println("结束");
	}

}
