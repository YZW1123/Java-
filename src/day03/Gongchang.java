package day03;

public class Gongchang {

	public static void main(String[] args) {
		Fruits fs =factorys.get(args[0]);
		if(fs != null){
			fs.eat();
		}
	}
}
//1������һ���ӿ�
interface Fruits{
	void eat();
}
//2����һ������������ʵ�ֶ���Ľӿ�
class Apples implements Fruits{
	@Override
	public void eat() {
		System.out.println("��ƻ��");
	}
}
class Oranges implements Fruits{
	@Override
	public void eat() {
		System.out.println("������");
	}
}
//3������һ��������������Ŀ����Ϊ�������ʵ����
class factorys{
	public static Fruits get(String arg){
		if("Apples".equals(arg)){
			return new Apples();
		}else if("Oranges".equals(arg)){
			return new Oranges();
		}else{
			return null;
		}
	}
}