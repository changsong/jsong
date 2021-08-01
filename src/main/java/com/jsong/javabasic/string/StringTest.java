package com.jsong.javabasic.string;

/**
 * String 创建的字符串存储在公共池中，而 new 创建的字符串对象在堆上：
 *
 * @muzijia.com
 */
public class StringTest {


    public static void main(String[] args) {
        String s1 = "Runoob";              // String 直接创建
        String s2 = "Runoob";              // String 直接创建
        String s3 = s1;                    // 相同引用
        String s4 = new String("Runoob");   // String 对象创建
        String s5 = new String("Runoob");   // String 对象创建


        // String 类有 11 种构造方法，这些方法提供不同的参数来初始化字符串，比如提供一个字符数组参数:
        char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString = new String(helloArray);
        System.out.println( helloString );

        // 长度
        int len = s1.length();
        System.out.println( "长度 : " + len );

        // 连接字符串
        s1.concat(s2);
        System.out.println("s1 " + s1);


        float floatVar = 21.12f;
        int intVar =123;
        String stringVar = "abc12123";
        String fs;
        fs = String.format("浮点型变量的值为 " +
                "%f, 整型变量的值为 " +
                " %d, 字符串变量的值为 " +
                " %s", floatVar, intVar, stringVar);
        System.out.println("fs = " + fs);


        // char charAt(int index) 返回指定索引处的 char 值。
        System.out.println("fs.char(0) = " + fs.charAt(0));

        // int compareTo(Object o) 把这个字符串和另一个对象比较。
        System.out.println("fs.compareTo(\"浮点型变\") = " + fs.compareTo("浮点型变"));

        // String concat(String str) 将指定字符串连接到此字符串的结尾。
        System.out.println("fs.concat(\"zzz\") = " + fs.concat("zzz"));

        // boolean contentEquals(StringBuffer sb) 当且仅当字符串与指定的StringBuffer有相同顺序的字符时候返回真。
        System.out.println("fs.contentEquals(\"abc\") = " + fs.contentEquals("abc"));

        // String copyValueOf(char[] data) 返回指定数组中表示该字符序列的 String。
        System.out.println("String.copyValueOf(helloArray) = " + String.copyValueOf(helloArray));

        // boolean endsWith(String suffix) 测试此字符串是否以指定的后缀结束。
        System.out.println("String.endsWith(helloArray) = " + s1.endsWith("u"));

        // boolean equals(Object anObject) 将此字符串与指定的对象比较。
        System.out.println("s1.equals(s2) = " + s1.equals(s2));

        // boolean equalsIgnoreCase(String anotherString) 将此 String 与另一个 String 比较，不考虑大小写。
        System.out.println("s1.equalsIgnoreCase(s2) = " + s1.equalsIgnoreCase(s2));

        // byte[] getBytes(String charsetName) 使用指定的字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
        System.out.println("s1.getBytes() = " + s1.getBytes());

        // int indexOf(int ch) 返回指定字符在此字符串中第一次出现处的索引。
        System.out.println("s1.indexOf() = " + s1.indexOf('b'));

        // int lastIndexOf(int ch) 返回指定字符在此字符串中最后一次出现处的索引。
        System.out.println("s1.lastIndexOf() = " + s1.lastIndexOf('b'));

        // int length() 返回此字符串的长度。
        System.out.println("s1.length() = " + s1.length());

        // boolean matches(String regex) 告知此字符串是否匹配给定的正则表达式。
        System.out.println("s1.matches() = " + s1.matches("ab*"));

        // String replaceAll(String regex, String replacement) 使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
        System.out.println("s1.replaceAll() = " + s1.replaceAll("un", "oo"));

        // String[] split(String regex) 根据给定正则表达式的匹配拆分此字符串。
        System.out.println("s1.split() = " + s1.split("a"));

        // boolean startsWith(String prefix) 测试此字符串是否以指定的前缀开始。
        System.out.println("s1.startsWith() = " + s1.startsWith("a"));

        // String substring(int beginIndex, int endIndex) 返回一个新字符串，它是此字符串的一个子字符串。
        System.out.println("s1.substring() = " + s1.substring(1, 4));

        // char[] toCharArray() 将此字符串转换为一个新的字符数组。
        System.out.println("s1.toCharArray() = " + s1.toCharArray());

        // String toLowerCase() 使用默认语言环境的规则将此 String 中的所有字符都转换为小写。
        System.out.println("s1.toLowerCase() = " + s1.toLowerCase());

        // String trim() 返回字符串的副本，忽略前导空白和尾部空白。
        System.out.println("s1.trim() = " + s1.trim());

        // String valueOf(primitive data type x) 返回给定data type类型x参数的字符串表示形式。
        int tmpInt = 1213;
        System.out.println("s1.valueOf() = " + s1.valueOf(tmpInt));

        // contains(CharSequence chars) 判断是否包含指定的字符系列。
        System.out.println("s1.contains() = " + s1.contains("a"));

        // isEmpty()  判断字符串是否为空。
        System.out.println("s1.isEmpty() = " + s1.isEmpty());
    }
}
