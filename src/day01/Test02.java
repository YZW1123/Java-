package day01;

public class Test02 {
	//ѧϰstatic����ؼ���
	//static��������
	//static���η���
	public static void main(String[] args) {
		Test02 t=new Test02();
		t.print();
		Person2 per1 = new Person2("����", 13);
		Person2 per2 = new Person2("����", 18);
		Person2 per3 = new Person2("����", 21);
		Person2 per4 = new Person2("����", 19);
		Person2 per5 = new Person2("С��", 18);
		per1.country="����";
		System.out.println(per1.info());
		System.out.println(per2.info());
		System.out.println(per3.info());
		System.out.println(per4.info());
		System.out.println(per5.info());
		//ͨ��static���ε����Ժͷ��������洢���ڴ�ĶѺ�ջ��
		//static ���ε����Ժͷ�����ȫ��������
		//System.arraycopy()
		//static �������Ժͷ�����Ҫͨ��new��ʵ����
		//static ���ε����Ժͷ����ĵ���ʱͨ��
		//������.���� ���� ������.����();
		//��static ���εķ������Ե���static���εķ���������
		//static ���εķ�����������ֱ�ӵ��÷�static���ε����Ժͷ���
	}
	public void print(){
		print1();//��static ���εķ������Ե���static���εķ���������
		System.out.println("123456");
	}
	public static void print1(){
        //print();static ���εķ�����������ֱ�ӵ��÷�static���ε����Ժͷ���
		System.out.println("1234564");
	}

}
