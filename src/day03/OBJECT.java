package day03;
//Object ��
//Object ��������Ӧ���������͵ĸ���
//�ӿ� ���� �� ������ ��
public class OBJECT {
	public static void main(String[] args) {
       //����ת��
		Object obj =new Person("����", 12);
		//����ת��
		Person per=(Person)obj;
		System.out.println(per.info());
		//����ת��
		Object obj1 = args;
		//����ת��
		String[] str=(String[])obj1;
		Object obj2 =new BB();
		Person per1 =new Person ("����",18);
		System.out.println(per1.toString());
	}
}
interface AA{}
class BB implements AA{}
class Person {
	public String name ;
	public int age;
	public String info (){
		return "������"+name+"  ���䣺"+age;
		}
	public String toString(){
		return "������"+name+"  ���䣺"+age;
	}
	public Person(String name ,int age ){
		this.age=age;
		this.name=name;
	}
}
//ΪʲôҪ����Object��
//����ת�������ֳ���Ķ�̬�ԣ�ʵ�ֲ�����ͳһ