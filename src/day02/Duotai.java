package day02;
/**
 * ��̬��
 * ��̬�Զ��� 
 *    ��̬һ����Ϊ���в�ͬ��������
 * ��̬������������
 *    1������
 *      ��1��������������
 *      ��2���������ĸ�д
 *    2����
 *       ���������ת�ͣ����� �������=����ʵ��;����ת���Զ����
 *       ���������ת�ͣ����� �������=(����)�������;����ת��ǿ��ת��
 */
class A{
	public void print(){
		System.out.println("���Ǻ�");
	}
	public void print(int a){
		System.out.println("���");
	}
	public void print(double a){
		System.out.println("��");
	}
}
//�̳�
class B extends A{
	public void print(int a){
		System.out.println("��ð�!");
	}
}
public class Duotai {

	public static void main(String[] args) {
		//ʵ����A��
     /*  A a= new A ();
       a.print();
       a.print(1.1);
       a.print(1);*/
       B b= new B();
       b.print();
       b.print(0.1);
       b.print(1);
	}

}
