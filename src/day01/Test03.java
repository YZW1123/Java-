package day01;

class AA {
	//private >ȱʡ>public
	//final ���ģ������޸ĵ�
	public void print() {
		System.out.println("*****a******");
	}
}

class BB extends AA {
	public void print() {
		System.out.println("*****b******");
	}
}

public class Test03 {
	/**
	 * �����ĸ�д ΪʲôҪ�з����ĸ�д��
	 * �Ȳ���ı丸���еķ������ƣ��������丸��Ĺ��ܣ���ʱ��ͳ����˷����ĸ�д
	 * �������Ͳ��䣬�������Ʋ��䣬�������Ͳ��䣬������������ �仯���Ƿ����Ĺ���
	 * ����Ҫ��д����ķ�������������Ȩ�޲��ܸ��ڸ���
	 */
	public static void main(String[] args) {
     BB b=new BB();
     b.print();
	}
}
