package day02;

public class Duotai0001 {
	public static void main(String[] args) {
		fun(new A1());
		fun(new B1());
		fun(new C1());
	}
	public static void fun(A1 a){
		a.print();//���ø���ķ���
		if (a instanceof B1) {//�ж�ʵ�����Ƿ���B1�����ʵ������
			B1 b = (B1)a;//����ת��
			b.printb();//�����������еķ���
		}
		if(a instanceof C1){//�ж�ʵ�����Ƿ���C1�����ʵ������
			C1 c=(C1)a;//����ת��
			c.printc();//�����������еķ���
		}
	}
}
class A1{
	public void print (){
		System.out.println("---A1---");
	}
}
class B1 extends A1{
	public void print (){
		System.out.println("---B1---");
	}
	public void printb (){
		System.out.println("---B1b---");
	}
}
class C1 extends A1{
	public void print (){
		System.out.println("---C1---");
	}
	public void printc (){
		System.out.println("---C1c---");
	}
}