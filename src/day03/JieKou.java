package day03;
/**
 * �ӿ���һ�ֹ���ͱ�׼
 * �ӿ����ࣨ�����в�����public���Σ�
 * �ӿ�ֻ�ܶ��峣���ͳ��󷽷�
 * �ӿڵĶ���
 *  interface �ӿ�����{
 *  //����
 *  //���󷽷�
 *  }
 * Ӧ�ýӿ�
 *  ���� implements �ӿ���{
 *  //ʵ��ʵ����
 *  �ӿ� �ӿڶ��� = new ����();//����ת��
 *  ����.��������
 *  ���� ������� =(����)�ӿڶ���;
 *  }
 *  �ܽ�
 *  1���ӿڱ����˵��̳У�һ���������ʵ�ֶ���ӿڡ�
 *  2���ӿڵ�ʵ��һ������һ�����࣬ͨ��implements ��ʵ�ֽӿڡ�
 *  3���ӿ��з���ȫ���ǳ��󷽷���ȫ�ֳ����Ķ�����Բ���static��
 *  4���ӿ�Ҫʵ�ֱ���Ҫ���࣬ͨ������ת����ʵ�ֽӿ�ʵ������
 *  
 *  �����нӿڵ�ʹ��ԭ��
 *  1����ʾ����һ�ֲ�����׼�͹���
 *  2����ʾ����һ������
 *  3�����������˵�Զ�̷����ṩ�ͻ���
 */
//�ӿ��ǲ���ֱ��ʵ����
//

public class JieKou {
	public static void main(String[] args) {
		USB usb=new Dell();
		USB usb1=new Lenovo();
		Dell dell=(Dell)usb;
		dell.end();
		dell.start();
		dell.play();
		Lenovo le=(Lenovo)usb;
		le.end();
		le.start();
		le.play();
	}
}
interface USB{
	public final static String COLOR="��ɫ";
	public abstract void start();
	public abstract void end ();
}
class Dell implements USB {
	@Override
	public void start() {
           System.out.println("Dell ��"+COLOR+"USB��ʼ����");			
	}
	@Override
	public void end() {
		System.out.println("Dell��USBֹͣ����");
	}
	public void play(){
		System.out.println("Dell����Ϸ�����");
	}
}
class Lenovo implements USB{
	@Override
	public void start() {
		System.out.println("�������ɫUSB��ʼ����");
	}
	@Override
	public void end() {
		System.out.println("�����USBֹͣ����");
	}
	public void play(){
		System.out.println("�������Ϸ���鲻��");
	}
}
