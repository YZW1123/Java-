package day01;

public class Person3 {
	static int count;//定义一个属性来存储值
	//每实例化就调用构造方法一次
    public Person3(){
    	System.out.println("实例化次数"+count++);
    }
}
