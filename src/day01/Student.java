package day01;

public class Student extends Person4{
    public  int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String into(){
		return "������"+name+" ���䣺"+age+ " ѧ�ţ�"+number;
	}
	public static void main(String[] args) {
		Student per4 =new Student();
		per4.setAge(12);//�����ĸ�ֵ
		per4.name="����";//���Եĸ�ֵ
		per4.setNumber(1001);
	System.out.println(per4.info()+per4.into());
        
	}

}
//�̳е�����
//һ������ֻ�ܼ̳�һ�����࣬һ����������ж������
//���಻�ܼ̳и���˽�����Ժͷ���
//ʵ���������ʱ����ʵ��������
//�������Ȩ�޲��ܸ��ڸ���ķ���Ȩ��
