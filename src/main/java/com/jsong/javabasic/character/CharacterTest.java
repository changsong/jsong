package com.jsong.javabasic.character;

/**
 * 字符处理
 *
 */
public class CharacterTest {

    public static void main(String[] args) {
        // 原始字符 'a' 装箱到 Character 对象 ch 中
        Character ch = 'a';
        // 原始字符 'x' 用 test 方法装箱
        // 返回拆箱的值到 'c'
        Character chx = new Character('a');
        // 1	isLetter()
        System.out.println("ch.isLetter() = " + Character.isLetter(ch));
        // 是否是一个字母
        // 2	isDigit()
        System.out.println("ch.isDigit() = " + Character.isDigit(ch));
        // 是否是一个数字字符
        // 3	isWhitespace()
        System.out.println("ch.isWhitespace() = " + Character.isWhitespace(ch));
        // 是否是一个空白字符
        // 4	isUpperCase()
        System.out.println("ch.isUpperCase() = " + Character.isUpperCase(ch));
        // 是否是大写字母
        // 5	isLowerCase()
        System.out.println("ch.isLetter() = " + Character.isLetter(ch));
        // 是否是小写字母
        // 6	toUpperCase()
        System.out.println("ch.toUpperCase() = " + Character.toUpperCase(ch));
        // 指定字母的大写形式
        // 7	toLowerCase()
        System.out.println("ch.toLowerCase() = " + Character.toLowerCase(ch));
        // 指定字母的小写形式
        // 8	toString()
        // 返回字符的字符串形式，字符串的长度仅为1
        System.out.println("ch.toString() = " + Character.toString(ch));


        // Unicode 字符表示形式
        char uniChar = '\u039A';
        // 字符数组
        char[] charArray ={ 'a', 'b', 'c', 'd', 'e' };

        // 转义序列
        System.out.println("这是\"转义序列!\"");

    }
}
