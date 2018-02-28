package day04;

public class THrow {

	public static void main(String[] args) {
		try {
			throw new Exception("你好啊！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
/**
 * Throws Throw 的区别
 * Throw ：在方法体中使用，表示的是一个手工跑出异常
 * Throws：在方法的定义中使用，表示我们在调用该方法的时候要进行异常处理。
 */
