package day03;

public class Shuohuo {
	public static void main(String[] args) {
		//java.lang.ArrayIndexOutOfBoundsException  java�Ŀ�ָ���쳣
		//������ָ���ԭ��
		//ֻʵ����û�����
//		Fruit f0 = new Apple();
//		f0.eat();
//		Fruit f1 = new Banana();
//		f1.eat();
//		Fruit f2 = new Orange();
//		f2.eat();
		//����ת��
		//����
		//public �������� �������� �������ƣ��������� ������{}
		Fruit f=Factory.getInstance(args[0]);
		//Fruit f =fs;
		//Factory.getInstance(args[0]);�ȼ���f getInstance(String a);
		//�������� Fruit
		//��̬���� ������.��������()
		//String []
		//������[�±�]
		if(f!=null){
		f.eat();//����.����
		}
	}
}
class Factory{
	//Fruit fs = new Apple();
	public static  Fruit getInstance(String a){
	if("Apple".equals(a)){
		return new Apple();
	}else if ("Banana".equals(a)) {
		return new Banana();
	} else if ("Orange".equals(a)) {
		return new Orange();
	}else{
		return null;
	}
}
}
interface Fruit {
	void eat();
}

class Apple implements Fruit {
	@Override
	public void eat() {
		System.out.println("��ƻ��");
	}
}

class Banana implements Fruit {
	@Override
	public void eat() {
		System.out.println("���㽶");
	}
}

class Orange implements Fruit {
	@Override
	public void eat() {
		System.out.println("������");
	}
}