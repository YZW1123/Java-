package day01;

public class Test01 {

	public static void main(String[] args) {
       /**
        * main 主方法，程序的入口
        * public （共有的，公共的）修饰符 是控制的访问权限
        * static ： 静态方法，全局数据区
        * void：方法的返回类型，什么都不返回
        * main： 方法名称
        * String[]: 数组类型  字符串的数组
        * args：参数
        * configuration：配置
        *run configuration：运行配置
        */
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
