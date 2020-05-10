### 存储过程简介

什么是存储过程：存储过程可以说是一个记录集吧，它是由一些T-SQL语句组成的代码块，这些T-SQL语句代码像一个方法一样实现一些功能（对单表或多表的增删改查），然后再给这个代码块取一个名字，在用到这个功能的时候调用他就行了。

存储过程的好处：

1.由于数据库执行动作时，是先编译后执行的。然而存储过程是一个编译过的代码块，所以执行效率要比T-SQL语句高。

2.一个存储过程在程序在网络中交互时可以替代大堆的T-SQL语句，所以也能降低网络的通信量，提高通信速率。

3.通过存储过程能够使没有权限的用户在控制之下间接地存取数据库，从而确保数据的安全。

> 小结：总之存储过程是好东西，在做项目时属于必备利器，但是对后续数据迁移会造成一定的影响,下面介绍存储过程的基本语法。另外整体来讲存储过程中的业务逻辑操作会带来数据库额外的负担

#### 存储过程的语法和参数讲解

存储过程的一些基本语法：

 ```SQL
--------------创建存储过程-----------------

CREATE PROC [ EDURE ] procedure_name [ ; number ]
    [ { @parameter data_type }
        [ VARYING ] [ = default ] [ OUTPUT ]
    ] [ ,...n ]

[ WITH
    { RECOMPILE | ENCRYPTION | RECOMPILE , ENCRYPTION } ]

[ FOR REPLICATION ]

AS sql_statement [ ...n ]
```

```SQL
--------------调用存储过程-----------------

EXECUTE Procedure_name '' --存储过程如果有参数，后面加参数格式为：@参数名=value，也可直接为参数值value

--------------删除存储过程-----------------

drop procedure procedure_name    --在存储过程中能调用另外一个存储过程，而不能删除另外一个存储过程
 ```

#### 创建存储过程的参数：

1.procedure_name ：存储过程的名称，在前面加#为局部临时存储过程，加##为全局临时存储过程。

2.; number：是可选的整数，用来对同名的过程分组，以便用一条 DROP PROCEDURE 语句即可将同组的过程一起除去。例如，名为 orders 的应用程序使用的过程可以命名为 orderproc;1、orderproc;2 等。DROP PROCEDURE orderproc 语句将除去整个组。如果名称中包含定界标识符，则数字不应包含在标识符中，只应在 procedure_name 前后使用适当的定界符。

3.@parameter： 存储过程的参数。可以有一个或多个。用户必须在执行过程时提供每个所声明参数的值（除非定义了该参数的默认值）。存储过程最多可以有 2.100 个参数。
使用 @ 符号作为第一个字符来指定参数名称。参数名称必须符合标识符的规则。每个过程的参数仅用于该过程本身；相同的参数名称可以用在其它过程中。默认情况下，参数只能代替常量，而不能用于代替表名、列名或其它数据库对象的名称。有关更多信息，请参见 EXECUTE。

4.data_type：参数的数据类型。所有数据类型（包括 text、ntext 和 image）均可以用作存储过程的参数。不过，cursor 数据类型只能用于 OUTPUT 参数。如果指定的数据类型为 cursor，也必须同时指定 VARYING 和 OUTPUT 关键字。有关 SQL Server 提供的数据类型及其语法的更多信息，请参见数据类型。
说明 对于可以是 cursor 数据类型的输出参数，没有最大数目的限制。

5.VARYING： 指定作为输出参数支持的结果集（由存储过程动态构造，内容可以变化）。仅适用于游标参数。 

6.default： 参数的默认值。如果定义了默认值，不必指定该参数的值即可执行过程。默认值必须是常量或 NULL。如果过程将对该参数使用 LIKE 关键字，那么默认值中可以包含通配符（%、_、[] 和 [^]）。

7.OUTPUT ：表明参数是返回参数。该选项的值可以返回给 EXEC[UTE]。使用 OUTPUT 参数可将信息返回给调用过程。Text、ntext 和 image 参数可用作 OUTPUT 参数。使用 OUTPUT 关键字的输出参数可以是游标占位符。 

8.RECOMPILE: 表明 SQL Server 不会缓存该过程的计划，该过程将在运行时重新编译。在使用非典型值或临时值而不希望覆盖缓存在内存中的执行计划时，请使用 RECOMPILE 选项。

9.ENCRYPTION: 表示 SQL Server 加密 syscomments 表中包含 CREATE PROCEDURE 语句文本的条目。使用 ENCRYPTION 可防止将过程作为 SQL Server 复制的一部分发布。 说明 在升级过程中，SQL Server 利用存储在 syscomments 中的加密注释来重新创建加密过程。 

10.FOR REPLICATION :指定不能在订阅服务器上执行为复制创建的存储过程。.使用 FOR REPLICATION 选项创建的存储过程可用作存储过程筛选，且只能在复制过程中执行。本选项不能和 WITH RECOMPILE 选项一起使用。 

11.AS :指定过程要执行的操作。

12.sql_statement :过程中要包含的任意数目和类型的 Transact-SQL 语句。但有一些限制。

> 小结：看过这些基本语法后，下面我就根据语法创建各式的存储过程。

 ### 创建存储过程

UserAccount

| UserID | UserName | PassWord |RegisterTime |RegisterIP |
|  ----  | ----  |----  |----  |----  |
| 12	| 6     |   6   |  2012-12-31| 	6|
| 18	| 5     |   5   |  2013-01-01| 	5|
| 19	| 1     |   1   |  2013-01-01| 	1|
| 20	| 2     |   2   |  2013-01-01| 	2|
| 21	| 3     |   3   |  2013-01-01| 	3|
| 22	| 4     |   4   |  2013-01-01| 	4|
| 23	| 5     |   5   |  2013-01-01| 	5| 
| 25	| 7     |   7   |  2013-01-01| 	7|
| 26	| 8     |   8   |  2013-01-01| 	8|

针对上面的表，我使用存储过程对它做一些操作：

1. 只返回单一记录集的存储过程 

```SQL
-------------创建名为GetUserAccount的存储过程----------------
create Procedure GetUserAccount
as
select * from UserAccount
go

-------------执行上面的存储过程----------------
exec GetUserAccount
```
 > 结果：相当于运行 select * from UserAccount 这行代码，结果为整个表的数据。

2.没有输入输出的存储过程 

```SQL
-------------创建名为GetUserAccount的存储过程----------------
create Procedure inUserAccount
as
insert into UserAccount (UserName,[PassWord],RegisterTime,RegisterIP) values(9,9,'2013-01-02',9)
go

-------------执行上面的存储过程----------------
exec inUserAccount
```

> 结果：相当于运行 insert into UserAccount (UserName,[PassWord],RegisterTime,RegisterIP) values(9,9,'2013-01-02',9) 这行代码。

3.有返回值的存储过程 

```SQL
-------------创建名为GetUserAccount的存储过程----------------

create Procedure inUserAccountRe
as
insert into UserAccount (UserName,[PassWord],RegisterTime,RegisterIP) values(10,10,'2013-01-02',10)
return @@rowcount
go

-------------执行上面的存储过程----------------
exec inUserAccountRe
```

>  解释：这里的@@rowcount为执行存储过程影响的行数，执行的结果是不仅插入了一条数据，还返回了一个值即 return value =1  ，这个可以在程序中获取，稍后在c#调用存储过程中会有说到。

4.有输入参数和输出参数的存储过程 

```SQL
-------------创建名为GetUserAccount的存储过程----------------

create Procedure GetUserAccountRe
@UserName nchar(20),
@UserID int output
as
if(@UserName>5)
select @UserID=COUNT(*) from UserAccount where UserID>25
else
set @UserID=1000
go

-------------执行上面的存储过程----------------

exec GetUserAccountRe '7',null
```

>  解释：@UserName为输入参数，@UserID为输出参数。 运行结果为@userID为COOUT（*）即 =1。

5. 同时具有返回值、输入参数、输出参数的存储过程 

```SQL
-------------创建名为GetUserAccount的存储过程----------------

create Procedure GetUserAccountRe1
@UserName nchar(20),
@UserID int output
as
if(@UserName>5)
select @UserID=COUNT(*) from UserAccount where UserID>25
else
set @UserID=1000
return @@rowcount
go

-------------执行上面的存储过程----------------

exec GetUserAccountRe1 '7',null
```
 > 结果：@userID为COOUT（*）即 =1，Retun Value=1。

6.同时返回参数和记录集的存储过程 

```SQL
-------------创建名为GetUserAccount的存储过程----------------

create Procedure GetUserAccountRe2
@UserName nchar(20),
@UserID int output
as
if(@UserName>5)
select @UserID=COUNT(*) from UserAccount where UserID>25
else
set @UserID=1000
select * from UserAccount
return @@rowcount
go

-------------执行上面的存储过程----------------

exec GetUserAccountRe2 '7',null
```

 > 结果：返回执行 select * from UserAccount 这句代码的结果集，同时@userID为COOUT（*）即 =1，Retun Value=9。 

7.返回多个记录集的存储过程 

```SQL
-------------创建名为GetUserAccount的存储过程----------------

create Procedure GetUserAccountRe3
as
select * from UserAccount
select * from UserAccount where UserID>5
go

-------------执行上面的存储过程----------------

exec GetUserAccountRe3
```

 > 结果：返回两个结果集，一个为 select * from UserAccount，另一个为 select * from UserAccount where UserID>5 。


 %[{ contactme.md }]%