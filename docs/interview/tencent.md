#### 腾讯实习生一面


##### Java的基础数据类型

整型：byte, short, int, long
字符型：char
浮点型：float, double
布尔型：boolean

##### StringBuffer和StringBuild的区别

StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）。
由于 StringBuilder 相较于 StringBuffer 有速度优势。  
所以多数情况下建议使用 StringBuilder 类。然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。

> 一般线程安全都是加了一定的锁，速度会慢  

使用场景:  
　- String：适用于少量的字符串操作的情况  
　- StringBuilder：适用于单线程下在字符缓冲区进行大量操作的情况  
　- StringBuffer：适用多线程下在字符缓冲区进行大量操作的情况  

##### 抽象类及接口有什么区别


##### 方法的重写和重载


##### Synchrolized和valotile的区别


##### 介绍辅助类AtmoicInteger


##### 值传递及引用传递有什么不一样


##### SpringMVC的请求处理流程

##### Cookie及Session的区别


##### Post和Get的区别


##### Forward和重定向介绍


##### MySQL的存储引擎


##### 事务的四大特性

##### 事务的隔离级别


##### 聚簇索引及非聚簇索引原理及区别

##### INODB都是聚簇索引吗

##### 描述索引的加载

##### 索引有哪些分类

##### 手写冒泡排序

%[{ contactme.md }]%

