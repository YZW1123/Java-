package day01;

public class Test2 {

	public static void main(String[] args) {
      Person1 per1=new Person1("����", 13);
      Person1 per2=new Person1("����", 18);
      Person1 per3=new Person1("����", 21);
      Person1 per4=new Person1("����", 19);
      Person1 per5=new Person1("С��", 18);
      per1.country="����";
      System.out.println(per1.info());
      System.out.println(per2.info());
      System.out.println(per3.info());
      System.out.println(per4.info());
      System.out.println(per5.info());
	}

}
