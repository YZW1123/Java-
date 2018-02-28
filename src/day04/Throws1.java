package day04;

public class Throws1 {

	public static void main(String[] args)  {
		try {
			System.out.println(info(1, 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static int info(int a,int b) throws Exception {
		//定义一个变量来保存值
		int result =0;
		System.out.println("开始");
		try{
		result = a/b;//出现异常语句
		}catch(Exception e){
			e.printStackTrace();
		}finally{
		System.out.println("结束");
		}
		return result;	
	} 

}
