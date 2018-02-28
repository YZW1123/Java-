package day01;

public class Test02 {
	//学习static这个关键字
	//static修饰属性
	//static修饰方法
	public static void main(String[] args) {
		Test02 t=new Test02();
		t.print();
		Person2 per1 = new Person2("张三", 13);
		Person2 per2 = new Person2("李四", 18);
		Person2 per3 = new Person2("王二", 21);
		Person2 per4 = new Person2("麻子", 19);
		Person2 per5 = new Person2("小明", 18);
		per1.country="明朝";
		System.out.println(per1.info());
		System.out.println(per2.info());
		System.out.println(per3.info());
		System.out.println(per4.info());
		System.out.println(per5.info());
		//通过static修饰的属性和方法，不存储在内存的堆和栈中
		//static 修饰的属性和方法，全局数据区
		//System.arraycopy()
		//static 修饰属性和方法不要通过new来实例化
		//static 修饰的属性和方法的调用时通过
		//类名称.属性 或者 类名称.方法();
		//非static 修饰的方法可以调用static修饰的方法和属性
		//static 修饰的方法，不可以直接调用非static修饰的属性和方法
	}
	public void print(){
		print1();//非static 修饰的方法可以调用static修饰的方法和属性
		System.out.println("123456");
	}
	public static void print1(){
        //print();static 修饰的方法，不可以直接调用非static修饰的属性和方法
		System.out.println("1234564");
	}

}
