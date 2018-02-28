package day02;

public class Chouxianglx {

	public static void main(String[] args) {
		Computer com=new LiMing();
		LiMing lm=(LiMing)com;
		lm.chat();
		lm.play();
		lm.look();
		lm.si();
		lm.work();
		Computer com1=new WangEr();
		WangEr we=(WangEr)com1;
        we.aihao();
        we.chat();
        we.look();
        we.play();
        we.work();
	}

}

abstract class Computer {
	public abstract void play();

	public abstract void look();

	public abstract void work();

	public abstract void chat();
}

class LiMing extends Computer {
	@Override
	public void play() {
		System.out.println("����������Ϸ");
	}
	@Override
	public void look() {
		System.out.println("�����ڿ���Ӱ");
	}
	@Override
	public void work() {
		System.out.println("�������ô���");
	}
	@Override
	public void chat() {
		System.out.println("�����ں���������");
	}
	public void si() {
		System.out.println("����ϲ����ֱ��");
	}
}
class WangEr extends Computer {
	@Override
	public void play() {
		System.out.println("������������Ϸ");
	}
	@Override
	public void look() {
		System.out.println("�����ڿ����Ӿ�");
	}
	@Override
	public void work() {
		System.out.println("������ֱ��");
	}
	@Override
	public void chat() {
		System.out.println("�����ںͷ�˿����");
	}
	public void aihao() {
		System.out.println("����ϲ������");
	}
}