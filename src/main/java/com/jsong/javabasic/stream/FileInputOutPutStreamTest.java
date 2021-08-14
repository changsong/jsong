package com.jsong.javabasic.stream;

import java.io.*;

/**
 * 一个流被定义为一个数据序列。输入流用于从源读取数据，输出流用于向目标写数据。
 */
public class FileInputOutPutStreamTest {

    /**
     * 首先创建文件test.txt，并把给定的数字以二进制形式写进该文件，同时输出到控制台上。
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        try {
            byte bWrite[] = { 11, 21, 3, 40, 5 };
            OutputStream os = new FileOutputStream("test.txt");
            for (int x = 0; x < bWrite.length; x++) {
                os.write(bWrite[x]); // writes the bytes
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.print((char) is.read() + "  ");
            }
            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }

    /**
     * 代码由于是二进制写入，可能存在乱码，你可以使用以下代码实例来解决乱码问题
     *
     * @param args
     * @throws IOException
     */
    public static void main2(String[] args) throws IOException {
        File f = new File("a.txt");
        FileOutputStream fop = new FileOutputStream(f);

        // 构建FileOutputStream对象,文件不存在会自动新建
        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");

        // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk
        writer.append("中文输入");
        // 写入到缓冲区
        writer.append("\r\n");
        // 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入
        writer.append("English");

        // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉
        writer.close();
        // 关闭输出流,释放系统资源
        fop.close();

        FileInputStream fip = new FileInputStream(f);
        // 构建FileInputStream对象

        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
        // 构建InputStreamReader对象,编码与写入相同

        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());
            // 转成char加到StringBuffer对象中
        }
        System.out.println(sb.toString());
        // 关闭读取流
        reader.close();
        // 关闭输入流,释放系统资源
        fip.close();
    }
}
