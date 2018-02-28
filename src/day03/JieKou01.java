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
		System.out.println("小王在读书");
	}
	@Override
	public void info() {
		System.out.println("小王在读小学");
	}
	@Override
	public void print() {
		System.out.println("小王在昆明读书");
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
