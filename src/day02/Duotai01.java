package day02;

public class Duotai01 {

	public static void main(String[] args) {
       //����ת��
		//���� �������=����ʵ��;����ת���Զ����
		AA a=new BB();
		a.print();
		//����ת��
		//���� �������=(����)�������;����ת��ǿ��ת��
		BB b= (BB) a;
		b.printb();
		b.print();
	}

}
class AA{
	public void print(){
		System.out.println("----A----");
	}
}
class BB extends AA{
	public void print(){
		System.out.println("----B----");
	}
	public void printb(){
		System.out.println("----BB----");
	}
}