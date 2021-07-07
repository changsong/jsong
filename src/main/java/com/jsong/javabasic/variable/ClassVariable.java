package com.jsong.javabasic.variable;

/**
 类变量也称为静态变量，在类中以 static 关键字声明，但必须在方法之外。
 无论一个类创建了多少个对象，类只拥有类变量的一份拷贝。
 静态变量除了被声明为常量外很少使用，静态变量是指声明为 public/private，final 和 static 类型的变量。静态变量初始化后不可改变。
 静态变量储存在静态存储区。经常被声明为常量，很少单独使用 static 声明变量。
 静态变量在第一次被访问时创建，在程序结束时销毁。
 与实例变量具有相似的可见性。但为了对类的使用者可见，大多数静态变量声明为 public 类型。
 默认值和实例变量相似。数值型变量默认值是 0，布尔型默认值是 false，引用类型默认值是 null。变量的值可以在声明的时候指定，也可以在构造方法中指定。此外，静态变量还可以在静态语句块中初始化。
 静态变量可以通过：ClassName.VariableName的方式访问。
 类变量被声明为 public static final 类型时，类变量名称一般建议使用大写字母。如果静态变量不是 public 和 final 类型，其命名方式与实例变量以及局部变量的命名方式一致。
 */
public class ClassVariable {
    //salary是静态的私有变量
    private static double salary;
    // DEPARTMENT是一个常量
    public static final String DEPARTMENT = "开发人员";
    public static void main(String[] args){
        salary = 10000;
        System.out.println(DEPARTMENT+"平均工资:"+salary);
    }
}
