package com.jsong.javabasic.variable;

/**
 实例变量声明在一个类中，但在方法、构造方法和语句块之外；
 当一个对象被实例化之后，每个实例变量的值就跟着确定；
 实例变量在对象创建的时候创建，在对象被销毁的时候销毁；
 实例变量的值应该至少被一个方法、构造方法或者语句块引用，使得外部能够通过这些方式获取实例变量信息；
 实例变量可以声明在使用前或者使用后；
 访问修饰符可以修饰实例变量；
 实例变量对于类中的方法、构造方法或者语句块是可见的。一般情况下应该把实例变量设为私有。通过使用访问修饰符可以使实例变量对子类可见；
 实例变量具有默认值。数值型变量的默认值是0，布尔型变量的默认值是false，引用类型变量的默认值是null。变量的值可以在声明时指定，也可以在构造方法中指定；
 *
 *
 */
public class Employee{
    // 这个实例变量对子类可见
    public String name;
    // 私有变量，仅在该类可见
    private double salary;
    //在构造器中对name赋值
    public Employee (String empName){
        name = empName;
    }
    //设定salary的值
    public void setSalary(double empSal){
        salary = empSal;
    }
    // 打印信息
    public void printEmp(){
        System.out.println("名字 : " + name );
        System.out.println("薪水 : " + salary);
    }

    public static void main(String[] args){
        Employee empOne = new Employee("RUNOOB");
        empOne.setSalary(1000.0);
        empOne.printEmp();
    }
}
