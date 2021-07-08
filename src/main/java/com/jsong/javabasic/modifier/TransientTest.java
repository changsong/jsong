package com.jsong.javabasic.modifier;
import java.io.*;

/**
 *
 * Java的serialization提供了一种持久化对象实例的机制。当持久化对象时，
 * 可能有一个特殊的对象数据成员，我们不想用serialization机制来保存它。
 * 为了在一个特定对象的一个域上关闭serialization，可以在这个域前加上关键字transient。
 * 当一个对象被序列化的时候，transient型变量的值不包括在序列化的表示中，然而非transient型的变量是被包括进去的。
 *
 */
public class TransientTest implements Serializable {

    private static final long serialVersionUID = 233858934995755239L;
    private String name1;
    private transient String name2;

    public TransientTest(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    public String toString() {
        return String.format("TransientTest.toString(): name1=%s,name2=%s", name1, name2);
    }

    public void main(String[] args){
        String name1="常规属性",name2="transient修饰的属性";
        TransientTest test = new TransientTest(name1, name2);
        System.out.println("序列化前："+test.toString());
        ObjectOutputStream outStream;
        ObjectInputStream inStream;
        String filePath = "D:/test/object/TransientTest.obj";
        try {
            outStream = new ObjectOutputStream(new FileOutputStream(filePath));
            outStream.writeObject(test);

            inStream = new ObjectInputStream(new FileInputStream(filePath));
            TransientTest readObject = (TransientTest)inStream.readObject();
            System.out.println("序列化后："+readObject.toString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
    }
}
