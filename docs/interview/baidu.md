#### 百度实习生二面

##### Https及http的区别
1. https协议需要到ca申请证书，一般免费证书较少，因而需要一定费用。
2. http是超文本传输协议，信息是明文传输，https则是具有安全性的ssl加密传输协议。
3. http和https使用的是完全不同的连接方式，用的端口也不一样，前者是80，后者是443。
4. http的连接很简单，是无状态的；HTTPS协议是由SSL+HTTP协议构建的可进行加密传输、身份认证的网络协议，比http协议安全。

##### 什么是死锁？死锁的必要条件

在多道程序系统中，一个进程集合中的每个进程都在等待只能由该集合中的其它一个进程才能引发的事件，
称一组进程或系统处于死锁状态。

2.产生死锁的原因：
1. 并发进程竞争临界资源（也可以写：系统提供的资源有限）。
2. 并发进程推进顺序不当。

死锁产生的4个必要条件：
互斥条件，请求与保持条件，不剥夺条件，环路等待条件

##### 数字证书的作用
数字签名是为了保证消息传输的保密性，以及身份的验证。 而数字证书是为了保证数字签名的有效性。 

##### 多进程及多线程的区别
关于多进程和多线程，“进程是资源分配的最小单位，线程是CPU调度的最小单位”。

每个进程都至少有一个线程。 一般，系统创建一个进程的开销是比较大的，需要分配内存，内核资源等等。   
不同进程间无法直接共享彼此拥有的这些资源。而我们可以在同一进程内创建多个线程，这些线程相对来说‘轻量级’很多，它们可以共享所在进程的各种资源。  
首先，粗略的说，你可以认为线程是 个‘轻量级’进程。用多线程模式，你可以很轻松的 实现 并行。 即，在多核 的设备上（如你有4核cpu）， 你可以开4个线程，以便这4个核 能同时 为你这个 进程 的工作服务。

##### 什么是Hash冲突?解决Hash冲突的方法

哈希冲突：关键字的集合很多的时候，就有可能将两个关键字k1,k2的哈希函数计算结果相等，  
k1和k2的值肯定不能存放在同一个位置，就产生了哈希冲突；哈希冲突是不可避免的，只能尽量减少哈希冲突；

1.开放定址法（线性探测再散列，二次探测再散列，伪随机探测再散列）
2.再哈希法
3.链地址法(Java hashmap就是这么做的)
4.建立一个公共溢出区

##### session及cookie的区别
1. 对于cookie  
- cookie是创建于服务器端
- cookie保存在浏览器端
- cookie的生命周期可以通过cookie.setMaxAge(2000);来设置，如果没有设置setMaxAge, 则cookie的生命周期当浏览器关闭的时候，就消亡了
- cookie可以被多个同类型的浏览器共享  可以把cookie想象成一张表


比较：

1. 存在的位置    

cookie: 存在于客户端,临时文件夹中  
session：存在于服务器的内存中，一个session域对象为一个用户浏览器服务

2. 安全性  

cookie是以明文的方式存放在客户端的，安全性低，可以通过一个加密算法进行加密后存放  
session存放于服务器的内存中，所以安全性好

3. 网络传输量

cookie会传递消息给服务器  

session本身存放于服务器，不会有传送流量

4. 生命周期(以20分钟为例)

(1)cookie的生命周期是累计的，从创建时，就开始计时，20分钟后，cookie生命周期结束，

(2)session的生命周期是间隔的，从创建时，开始计时如在20分钟，没有访问session，那么session生命周期被销毁

但是，如果在20分钟内（如在第19分钟时）访问过session，那么，将重新计算session的生命周期

(3)关机会造成session生命周期的结束，但是对cookie没有影响

5. 访问范围

session为一个用户浏览器独享

cookie为多个用户浏览器共享

使session失效的方法：  
1. 关闭tomcat
2. reload web应用
3. session时间到
4. invalidate session

##### TCP和UDP的区别
TCP和UDP是OSI模型中的运输层中的协bai议。TCP提供可靠的通信du传输，而UDP则常被用zhi于让广播和细节控制dao交给应用的通信传输。  

TCP与UDP基本区别
1. TCP基于连接,UDP基于无连接；
2. 对系统资源的要求（TCP较多，UDP少）；
3. UDP程序结构较简单；
4. 流模式与数据报模式 ；
5. TCP保证数据正确性，UDP可能丢包，TCP保证数据顺序，UDP不保证。
6. TCP面向字节流，实际上是TCP把数据看成一连串无结构的字节流;  
UDP是面向报文的，UDP没有拥塞控制，因此网络出现拥塞不会使源主机的发送速率降低（对实时应用很有用，如IP电话，实时视频会议等）
7. 每一条TCP连接只能是点到点的;UDP支持一对一，一对多，多对一和多对多的交互通信。
8. TCP首部开销20字节;UDP的首部开销小，只有8个字节。
9. TCP的逻辑通信信道是全双工的可靠信道，UDP则是不可靠信道。

##### HTTPS如何确保安全性

1. 基于对称加密方法对数据进行加密

![Https链接](https://user-gold-cdn.xitu.io/2019/1/5/1681c23c27137dc6?w=886&h=467&f=png&s=101700)

[建议阅读](https://www.cnblogs.com/kubidemanong/p/9390021.html)

##### 写一个二分查找代码
```javascript
    /*
     *循环实现二分算法
     */
    public static int binSearch(int key, int[] array) {
        int low = 0; //第一个下标
        int high = array.length - 1;//最后一个下标
        int middle = 0;
        //防越界
        if (key < array[low] || key > array[high] || low > high) {
            return -1;
        }
        while (low <= high) {
            middle = (low + high) / 2;
            if (middle == key) {
                return array[middle];
            } else if (middle < key) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }

    /*
     *递归实现二分算法
     */
    public static int binSearch_2(int key,int[] array,int low,int high){
        //防越界
        if (key < array[low] || key > array[high] || low > high) {
            return -1;
        }
        int middle = (low+high)/2;
        if(array[middle]>key){
            //大于关键字
            return  binSearch_2(key,array,low,middle-1);
        }else if(array[middle]<key){
            //小于关键字
            return binSearch_2(key,array,middle+1,high);
        }else{
            return array[middle];
        }
    }  
```

%[{ contactme.md }]%
