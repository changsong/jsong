package com.jsong.javabasic.switchcase;

/**
 * switch case 语句判断一个变量与一系列值中某个值是否相等，每个值称为一个分支。
 *
 *
 */
public class SwitchCase {

    // switch(expression){
    //     case value :
    //         //语句
    //         break; //可选
    //     case value :
    //         //语句
    //         break; //可选
    //     //你可以有任意数量的case语句
    //     default : //可选
    //         //语句
    // }

    // switch 语句中的变量类型可以是： byte、short、int 或者 char。从 Java SE 7 开始，switch 支持字符串 String 类型了，同时 case 标签必须为字符串常量或字面量。
    //
    //         switch 语句可以拥有多个 case 语句。每个 case 后面跟一个要比较的值和冒号。
    //
    //         case 语句中的值的数据类型必须与变量的数据类型相同，而且只能是常量或者字面常量。
    //
    // 当变量的值与 case 语句的值相等时，那么 case 语句之后的语句开始执行，直到 break 语句出现才会跳出 switch 语句。
    //
    // 当遇到 break 语句时，switch 语句终止。程序跳转到 switch 语句后面的语句执行。case 语句不必须要包含 break 语句。如果没有 break 语句出现，程序会继续执行下一条 case 语句，直到出现 break 语句。
    //
    // switch 语句可以包含一个 default 分支，该分支一般是 switch 语句的最后一个分支（可以在任何位置，但建议在最后一个）。default 在没有 case 语句的值和变量值相等的时候执行。default 分支不需要 break 语句。
    // public static void main(String[] args) {
    //     //char grade = args[0].charAt(0);
    //     char grade = 'C';
    //
    //     switch (grade) {
    //         case 'A':
    //             System.out.println("优秀");
    //             break;
    //         case 'B':
    //         case 'C':
    //             System.out.println("良好");
    //             break;
    //         case 'D':
    //             System.out.println("及格");
    //             break;
    //         case 'F':
    //             System.out.println("你需要再努力努力");
    //             break;
    //         default:
    //             System.out.println("未知等级");
    //     }
    //     System.out.println("你的等级是 " + grade);
        // 良好
        // 你的等级是 C
        //
        // public static void main(String args[]){
        //     int i = 5;
        //     switch(i){
        //         case 0:
        //             System.out.println("0");
        //         case 1:
        //             System.out.println("1");
        //         case 2:
        //             System.out.println("2");
        //         default:
        //             System.out.println("default");
        //     }
        // }
        // default

        // 如果 case 语句块中没有 break 语句时，匹配成功后，从当前 case 开始，后续所有 case 的值都会输出。
        public static void main(String args[]){
            int i = 1;
            switch(i){
                case 0:
                    System.out.println("0");
                case 1:
                    System.out.println("1");
                case 2:
                    System.out.println("2");
                default:
                    System.out.println("default");
            }
        }
        // 1
        // 2
        // default
        // }
}
