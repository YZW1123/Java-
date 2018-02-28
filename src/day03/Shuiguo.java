package day03;

public class Shuiguo extends Hunhe implements Food {

	@Override
	public void chun() {
		System.out.println("ÌÒ×Ó");
	}
	@Override
	public void xia() {
		System.out.println("èÁèË");
	}
	@Override
	public void qiu() {
		System.out.println("Àæ×Ó");
	}
	@Override
	public void dong() {
		System.out.println("â¨ºïÌÒ");
	}
	@Override
	public void hunheshuiguo() {
		System.out.println("·¬ÇÑ");
	}
}
