package day03;
/**
 * 
 *
 */
interface A{
	public abstract void print();
}
interface B{
	public abstract void info();
}
interface C{
	public abstract void into();
}
class D implements A,B,C{
	@Override
	public void into() {
		System.out.println("С���ڶ���");
	}
	@Override
	public void info() {
		System.out.println("С���ڶ�Сѧ");
	}
	@Override
	public void print() {
		System.out.println("С������������");
	}
}
public class JieKou01 {
	public static void main(String[] args) {
        D d= new D();
        d.info();
        d.into();
        d.print();
	}

}
