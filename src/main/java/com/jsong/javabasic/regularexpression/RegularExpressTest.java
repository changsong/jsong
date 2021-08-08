package com.jsong.javabasic.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式定义了字符串的模式。
 * 正则表达式可以用来搜索、编辑或处理文本。
 * 正则表达式并不仅限于某一种语言，但是在每种语言中有细微的差别。
 *
 */
public class RegularExpressTest {

    public static void main(String[] args) {

        //  \s+ 可以匹配多个空格
        //  ^\d+(\.\d+)?
        //   ^ 定义了以什么开始
        //   \d+ 匹配一个或多个数字
        //   ? 设置括号内的选项是可选的
        //   \. 匹配 ".
        // "5", "1.5" 和 "2.21"。

        String content = "I am noob " + "from runoob.com.";


        String pattern = ".*runoob.*";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);

        testGroup();
        testRegex();
    }

    /**
     * 捕获组
     * 捕获组是把多个字符当一个单独单元进行处理的方法，它通过对括号内的字符分组来创建。
     *
     */
    public static void testGroup() {
        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
        } else {
            System.out.println("NO MATCH");
        }
    }


    // \b 匹配一个字边界，即字与空格间的位置。例如，"er\b"匹配"never"中的"er"，但不匹配"verb"中的"er"。
    // \B 非字边界匹配。"er\B"匹配"verb"中的"er"，但不匹配"never"中的"er"
    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattie cat";

    /**
     * 捕获组
     * 捕获组是把多个字符当一个单独单元进行处理的方法，它通过对括号内的字符分组来创建。
     *
     */
    public static void testRegex() {
        Pattern p = Pattern.compile(REGEX);
        // 获取 matcher 对象
        Matcher m = p.matcher(INPUT);
        int count = 0;

        while(m.find()) {
            count++;
            System.out.println("Match number "+count);
            System.out.println("start(): "+m.start());
            System.out.println("end(): "+m.end());
        }
    }
}
