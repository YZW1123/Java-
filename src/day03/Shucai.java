package day03;

public class Shucai extends Hunhe implements Food{

	public static void main(String[] args) {

	}

	@Override
	public void chun() {
		System.out.println("°ü²Ë");
	}
	@Override
	public void xia() {
		System.out.println("ÇÑ×Ó£¬»Æ¹Ï");
	}
	@Override
	public void qiu() {
		System.out.println("ÄÏ¹Ï");
	}
	@Override
	public void dong() {
		System.out.println("ÂÜ²·");
	}

	@Override
	public void hunheshuiguo() {
		 System.out.println("Î÷ºìÊÁ");
		
	}

}
