package com.jsong.javabasic.stringbuffer;

/**
 * 当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。
 * 和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
 *
 */
public class StringBufferBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(10);
        sb.append("Runoob..");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.insert(8, "Java");
        System.out.println(sb);
        sb.delete(5,8);
        System.out.println(sb);


        StringBuffer sbuffer = new StringBuffer(10);
        // 1	public StringBuffer append(String s)
        // 将指定的字符串追加到此字符序列。
        System.out.println("sbuffer.append = " + sbuffer.append("Runoob.."));;

        // 2	public StringBuffer reverse()
        // 将此字符序列用其反转形式取代。
        System.out.println("sbuffer.append = " + sbuffer.reverse());;


        // 3	public delete(int start, int end)
        // 移除此序列的子字符串中的字符。
        System.out.println("sbuffer.append = " + sbuffer.delete(2, 5));

        // 4	public insert(int offset, int i)
        // 将 int 参数的字符串表示形式插入此序列中。
        System.out.println("sbuffer.append = " + sbuffer.insert(2, 121));;

        // 5	insert(int offset, String str)
        // 将 str 参数的字符串插入此序列中。
        System.out.println("sbuffer.append = " + sbuffer.insert(2, "abc"));;

        // 6	replace(int start, int end, String str)
        // 使用给定 String 中的字符替换此序列的子字符串中的字符。
        System.out.println("sbuffer.append = " + sbuffer.replace(1, 2, "x"));;
    }
}
