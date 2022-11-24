package com.jsong.asserttest;

/**
 * 防御式编程，当输入不满足条件时，要尽早返回或主动报错。程序/方法不应该因传入错误数据而被破坏，
 * 哪怕是其他由自己编写方法和程序产生的错误数据。这种思想是 将可能出现的错误造成的影响控制在有限的范围内。
 * 这里的输入包括：函数的参数，接口的返回结果，外部属性
 *
 */
public class InputCheck {

    public static void main(String[] args) {

    }

    public void doSomething(DomainA a) {
        if (a != null) {
            assignAction();
            if (a.getB() != null) {
                otherAction();
                if (a.getB() instanceof String) {
                    doSomethingB();
                    doSomethingA();
                    doSomthingC();
                }
            }
        }
    }

    /**
     * 对于非法输入的检查我们通常会使用 if…else 去做判断，但往往在判断过程中由于参数对象的层次结构会一层一层展开判断。
     *
     * @param a
     */
    public void doSomethingRight(DomainA a) {
        if (a == null) {
            return ; //log some errorA
        }
        if (a.getB() == null) {
            return ; //log some errorB
        }
        if (a.getB() instanceof String) {
            return ;//log some errorC
        }
        assignAction();
        otherAction();
        doSomthingC();
    }


    public void doSomethingA() {

    }

    public void doSomethingB() {

    }

    public void doSomthingC() {

    }

    public void assignAction() {

    }

    public void otherAction() {

    }
}
