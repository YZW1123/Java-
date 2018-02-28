package day01;

class AA {
	//private >缺省>public
	//final 最后的，不可修改的
	public void print() {
		System.out.println("*****a******");
	}
}

class BB extends AA {
	public void print() {
		System.out.println("*****b******");
	}
}

public class Test03 {
	/**
	 * 方法的覆写 为什么要有方法的覆写？
	 * 既不想改变父类中的方法名称，又想扩充父类的功能，这时候就出现了方法的覆写
	 * 返回类型不变，方法名称不变，参数类型不变，参数个数不变 变化的是方法的功能
	 * 子类要覆写父类的方法，子类修饰权限不能高于父类
	 */
	public static void main(String[] args) {
     BB b=new BB();
     b.print();
	}
}
