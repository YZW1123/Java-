package day03;

public class Print {

	public static void main(String[] args) {
		Food food=new Shucai();
		food.chun();
		food.xia();
		food.qiu();
		food.dong();
		System.out.println("****");
		Food food1=new Shuiguo();
		food1.chun();
		food1.xia();
		food1.qiu();
		food1.dong();
		System.out.println(food.COLOR);
		System.out.println("****");
		Shucai sc=new Shucai();
		sc.chun();
		sc.xia();
		sc.qiu();
		sc.dong();
		sc.Hunheshucai();
		sc.hunheshuiguo();
		System.out.println("****");
		Shuiguo sg=new Shuiguo();
		sg.chun();
		sg.xia();
		sg.qiu();
		sg.dong();
		sg.Hunheshucai();
		sg.hunheshuiguo();
	}
}
