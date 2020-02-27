package com.jsong.gc;

/**
 * Function: Eden区不够分配时，发生minorGC
 *
 * @author jsong
 *         Date: 17/01/2018 22:57
 * @since JDK 1.8
 */
public class MinorGC {

    /**
     * 1M
     */
    private static final int SIZE = 10* 1024 * 1024 ;

    /**
     *
     * 设置JVMOption参数
     -XX:+PrintGCDetails
     -Xms20M
     -Xmx20M
     -Xmn10M
     -XX:SurvivorRatio=8

     JDK1.7及以下
     https://pic2.zhimg.com/80/v2-5950119123225fc73e7705aadd512739_hd.jpg

     JDK1.8下，PermGen替换成Vm MetaSpace

     -Xms1024m
     初始Heap大小，使用的最小内存
     -Xmx1024m
     Java heap最大值，使用的最大内存 经验: 设置Xms大小等于Xmx大小
     -XX:NewSize=512m
     表示新生代初始内存的大小，应该小于 -Xms的值
     -XX:MaxNewSize=1024M
     表示新生代可被分配的内存的最大上限，应该小于 -Xmx的值
     -XX:PermSize=1024m
     设定内存的永久保存区域,内存的永久保存区域，VM 存放Class 和 Meta 信息，JVM在运行期间不会清除该区域

     * @param args
     */
    public static void main(String[] args) {
        byte[] one ;
        byte[] four ;

        one = new byte[2 * SIZE] ;


        //再分配一个 5M 内存时，Eden区不够了，
        four = new byte[5 * SIZE] ;
    }
}
