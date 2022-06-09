package com.jsong.robostcode;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

/**
 * 如何处写出健壮的代码
 */
@Slf4j
public class RobostTest {

    /**
     * 入口
     *
     * @param args
     */
    public static void main(String[] args) {

        // 只有在异常情况下使用异常，这包含两方面内容
        // 1. 如何处理识别异常情况并处理它
        // 2. 是只在异常情况下使用异常流程，不要用异常来做业务逻辑控制
        try {
            boolean isCurrect = doSth();
        } catch (Exception e) {
            // 每一个 catch 块至少打印一条日志，说明异常情况或者说明为什么不处理。
            log.error("doSth发生异常", e);
            // 不要做控制业务流程处理 !
        }

    }

    /**
     * 业务逻辑
     *
     * @return
     */
    public static boolean doSth() {
        return true;
    }


    /**
     * 抛出异常
     */
    public static boolean doSthExcetion() throws Exception {
        throw new Exception("error occur");
    }

    public void doSomething(String a, String b, String c) throws Exception {
        if (a != null) {
            doSth();
            if (b != null) {
                doSth();
                if (c != null) {
                    doSth();
                    doSthExcetion();
                }
            }
        }
    }

    /**
     * 防御式编程，当输入不满足条件时，要尽早返回或主动报错。程
     * 序/方法不应该因传入错误数据而被破坏，哪怕是其他由自己编写方法和程序产生的错误数据。
     * 这种思想是 将可能出现的错误造成的影响控制在有限的范围内。
     *
     * @param a
     * @param b
     * @param c
     * @throws Exception
     */
    public void doSomethingClear(String a, String b, String c) throws Exception {
        if (a == null) {
            return ; //log some errorA
        }
        if (b == null) {
            return ; //log some errorB
        }

        if (c == null) {
            return ; //log some errorB
        }
        doSth();
        doSthExcetion();
    }

    /**
     * 使用断言的重要原则就是，断言不能有副作用，也绝不能把必须执行的代码放入断言
     *
     * @param dParam
     * @return
     */
    public boolean assertDemo(String dParam) {
        Assert.isTrue(dParam.length() >1,  ("参数验证失败-" + String.class.getSimpleName() +"验证失败：" + dParam));

        doSth();
        return true;
    }

    /**
     * 其他的原则
     *
     * DRY (Don't Repeat Yourself)
     * 系统中的每一部分，都必须有一个单一的、明确的、权威的代表。
     *
     *  我们要避免的是在改动时的一个逻辑的时候需要去修改十处，如果漏掉了任何一处就会造成 bug 甚至线上故障。
     *  变更在软件开发中又是一个常态，而在一个到处是重复的系统中维护变更是非常艰难的。
     */

    /**
     * 没有文档比错误的文档更好
     * - 读注释比读代码更容易，可怕的事情往往就这样发生；
     * - 把注释放在更上层的复杂的复杂逻辑中。
     * - 满篇的注释并不是好代码，也不是好习惯
     */

    /**
     * 选择优秀的库
     *
     * 官方包 > 开源组织（apache，eclipse， fsf， Linux，openstack）> 大公司 >  个人开发者
     * 一、框架的功能性
     * 二、团队协作能力
     * 综合这两方面考虑，对要选择的框架做出评估，确定自己的目标框架
     */

    /**
     * 资源使用
     *
     * 管理资源：内存、事物、线程、文件、定时器，所有数量有限的事物都称为资源。遵循的模式：你分配、你使用、你回收。
     *
     */

}
