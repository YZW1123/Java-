package day04;

public class Throws {
//throws�ؼ���
	public static void main(String[] args)  {
		try {
			f();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			System.out.println("����");
		}
	}
	public static void f()throws Exception{
		fun();
	}
	public static void fun()throws Exception{
		System.out.println("���㿪ʼ");
		System.out.println(0/10);
		System.out.println("����");
	}

}
