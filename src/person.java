package person;

public class person {
String id;//用来存储进入来的数据
String name;
String age;
String grade;
//将这些属性定义方法进行储存值,什么时候用void?什么时候用static?
public static void getid(String id){
	String id1 = id;//定义一个东西将传进来的值，存起来
	return id1;//为后面调用的时候，直接id1返回值过去
};
public  static void getname(String name){
	String name1 = name;
	return name1;
};
public  static void getage(String age){
	String age1 = age;
	return age1;
};
public  static void getgrade(String grade){
	String grade1 = grade;
	return=grade1;
};

}
