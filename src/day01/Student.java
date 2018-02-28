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
		return "姓名："+name+" 年龄："+age+ " 学号："+number;
	}
	public static void main(String[] args) {
		Student per4 =new Student();
		per4.setAge(12);//方法的赋值
		per4.name="王二";//属性的赋值
		per4.setNumber(1001);
	System.out.println(per4.info()+per4.into());
        
	}

}
//继承的限制
//一个子类只能继承一个父类，一个父类可以有多个子类
//子类不能继承父类私有属性和方法
//实例化对象的时候先实例化父类
//子类访问权限不能高于父类的访问权限
