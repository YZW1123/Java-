package day03;

public class Anli {
	public static void main(String[] args) {
		AB a = (AB) new CD();
		/*a.print();*/
		Object obj = a;
		CD b = (CD) obj;
		b.Print1();
		b.print();
	}
}

interface AB {
	void print();
}

class CD implements AB {
	@Override
	public void print() {
		System.out.println("AAAA");
	}

	public void Print1() {
		System.out.println("BBBB");
	}
}
//�ܽ�
//1���ӿڱ�ʾһ�ֱ�׼
//2���ӿڱ�ʾ����һ������
//3����ʾ����˵�Զ����ͼ�������ݸ��ͻ���
//�ӿ��ܽ�
//1���ӿڱ����˵��̳У�һ���������ʵ�ֶ���ӿ�
//2���ӿڵ�ʵ��һ��������һ�����࣬ͨ��implements ��ʵ�ֽӿ�
//3���ӿ��з���ȫ���ǳ��󷽷���ȫ�ֳ����Ķ�����Բ���static
//4���ӿ�Ҫʵ�ֱ���Ҫ���࣬ͨ������ת����ʵ�ֽӿ�ʵ����
//����ģʽ
//GitHub
//Object ��
//ΪʲôҪʹ��Object��
//Object��������ĸ���