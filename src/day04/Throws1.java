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
		//����һ������������ֵ
		int result =0;
		System.out.println("��ʼ");
		try{
		result = a/b;//�����쳣���
		}catch(Exception e){
			e.printStackTrace();
		}finally{
		System.out.println("����");
		}
		return result;	
	} 

}
