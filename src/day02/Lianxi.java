package day02;

public class Lianxi {

	public static void main(String[] args) {
		fun(new Manager());
		fun(new Programmer());
	}

	public static void fun(Empolyee em) {
		if(em instanceof Manager){
			Manager mm = (Manager)em;
			mm.money();
			mm.working();
			mm.print("С��", 21, 123456);
		}
		if(em instanceof Programmer){
			Programmer pm =(Programmer)em;
			pm.working();
			pm.print("С��", 18, 123457);
		}
	}
}
abstract class Empolyee{
	public String name;
	public int age;
	public int number;
	abstract void working();
	public void print(String name,int age,int number){
		System.out.println("������"+name+" ���䣺"+age+" ����"+number);
	}
}
class Manager extends Empolyee{
public void money(){
	System.out.println("��Ŀ�����ڻ�ȡ����");
}
	@Override
	void working() {
		System.out.println("��Ŀ�������г��������");
	}
}
class Programmer extends Empolyee{
	@Override
	void working() {
		System.out.println("����Ա��д����");
	}
}