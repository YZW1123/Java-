package day02;

public class Chouxaing1 {

	public static void main(String[] args) {
		//����ת��
		Demo d= new Demo1();
		d.print();
		d.print1();
		d.print1();
		Demo1 D=(Demo1)d;//����ת�� 
		D.print3();
		D.print();
		D.print4(911);
	}

}
//������һ��������
abstract class Demo{
	public int number;//������һ������
	public final static double PI=3.1415926;//������һ������
	public void  print (){
		System.out.println("��;"+PI);
	}//������һ������
	public Demo(){
		
	}//������һ�����췽��
	public abstract void print1();//������һ�����󷽷������󷽷�û�з����塣
	public abstract void print2();
}
 class Demo1 extends Demo{
//����̳��˳����࣬��ô����Ҫ��д����ȫ�����󷽷�
	@Override//annotation ע��//Overloading ����
	public void print1() {
		System.out.println("124578");
	}

	@Override
	public void print2() {
		System.out.println("369");
	}
	public void print3(){
		System.out.println("123456789");
	}
	public void print4(int number){
		System.out.println("���룺"+number);
	}
	
}