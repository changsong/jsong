## 前言
调试程序的时候经常需要查看服务器的性能问题。
那么到底是需要查看服务器的哪些性能呢，如何查看性能呢？
以下就是昌老师经常用到的服务器性能查看命令

### free -m

![](http://images.cnblogs.com/cnblogs_com/yjf512/201206/201206010634443703.png)
> m 代表下面的是以M为单位

> Mem是表示物理内存，主要看 Mem free代表还有多少内存可以

第二行的 -/+ buffers/cache:
used = 第一行的used - buffers - cached (表示实际使用的内存总数)

free = 第一行的free + buffers + cached (表示实际剩余的内存总数)

所以一般查看内存还剩余多少查看第二行的free参数

### top

### netstat

### iostat


### 高级命令

#### strace

#### perf top 