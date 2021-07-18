package com.jsong.javabasic.operator;


/**
 *
 * 赋值运算符
 *
 =	简单的赋值运算符，将右操作数的值赋给左侧操作数	C = A + B将把A + B得到的值赋给C
 + =	加和赋值操作符，它把左操作数和右操作数相加赋值给左操作数	C + = A等价于C = C + A
 - =	减和赋值操作符，它把左操作数和右操作数相减赋值给左操作数	C - = A等价于C = C - A
 * =	乘和赋值操作符，它把左操作数和右操作数相乘赋值给左操作数	C * = A等价于C = C * A
 / =	除和赋值操作符，它把左操作数和右操作数相除赋值给左操作数	C / = A，C 与 A 同类型时等价于 C = C / A
 （％）=	取模和赋值操作符，它把左操作数和右操作数取模后赋值给左操作数	C％= A等价于C = C％A
 << =	左移位赋值运算符	C << = 2等价于C = C << 2
 >> =	右移位赋值运算符	C >> = 2等价于C = C >> 2
 ＆=	按位与赋值运算符	C＆= 2等价于C = C＆2
 ^ =	按位异或赋值操作符	C ^ = 2等价于C = C ^ 2
 | =	按位或赋值操作符	C | = 2等价于C = C | 2
 *
 */
public class AssignmentOperators {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        c = a + b;
        System.out.println("c = a + b = " + c );
        c += a ;
        System.out.println("c += a  = " + c );
        c -= a ;
        System.out.println("c -= a = " + c );
        c *= a ;
        System.out.println("c *= a = " + c );
        a = 10;
        c = 15;
        c /= a ;
        System.out.println("c /= a = " + c );
        a = 10;
        c = 15;
        c %= a ;
        System.out.println("c %= a  = " + c );
        c <<= 2 ;
        System.out.println("c <<= 2 = " + c );
        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );
        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );
        c &= a ;
        System.out.println("c &= a  = " + c );
        c ^= a ;
        System.out.println("c ^= a   = " + c );
        c |= a ;
        System.out.println("c |= a   = " + c );
    }
}
