### 力扣网

编写一个 SQL 查询，获取 Employee 表中第二高的薪水（Salary） 。

|  Id   | Salary  |
|  ----  | ----  |
| 1  | 100 |
| 2  | 200 |
| 3  | 300 |

例如上述 Employee 表，SQL查询应该返回 200 作为第二高的薪水。如果不存在第二高的薪水，那么查询应返回 null。

|  SecondHighestSalary   |
|  ----  | 
| 200 | 

- limit N # 返回 N 条记录
- offset M # 跳过 M 条记录，M 默认为 0
- limit M,N # 相当于 limit N offset M，从第 M 条记录开始，返回 N 条记录

 ```SQL
select(select distinct Salary
from Employee
order by Salary desc limit 1,1) as SecondHighestSalary;
 ```

 ```SQL
select IFNULL((select Distinct Salary from Employee order by Salary DESC limit 1,1),null)
as SecondHighestSalary
 ```

> 原题不变，查询第n高薪水
```SQL
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
 set n = N-1;
 RETURN (select ifnull(
                       (select distinct Salary 
                        from Employee 
                        order by Salary desc limit n,1),null) as SecondHighestSalary
   );
END
```


#### 比较天气

给定一个Wearther表，编写一个SQL查询，来查找与之前（昨天的）日期相比温度更高的所有日期的id


|  Id（INT）   | RecordDate(DATE)  | Temperature(INT)  |
|  ----  | ----  | ----  | 
| 1 | 2020-01-01 | 10 | 
| 2 | 2020-01-02 | 24 |
| 3 | 2020-01-03 | 28 | 
| 4 | 2020-01-04 | 30 |

例如，根据上述给定的 Wearther表格，返回如下Id

|  Id（INT）   | 
|  ----  |
| 2 | 
| 4 |

- DATEDIFF 函数，可以计算两者的日期差
- DATEDIFF('2007-12-31','2007-12-30'); # 1
- DATEDIFF('2010-12-30','2010-12-31'); # -1

```SQL
select a.Id
from weather a, weather b
where a.Temperature > b.Temperature
and datediff(a.RecordDate,b.RecordDate) = 1
```

#### 查工资

给走一个salary表，如下所示，有m =男性和f =女性的值，交换所有的f和m
值（例如，将所有f值更改为m,反之亦然）。要求只使用一个更新（Update)语
句，并且没有中间的临时表.

> 注意，您必只能写一Update语句，请不要编写任何Select语句。
例如：

| id | name | sex | salary |
| ----  | ----  | ----  | ----  | 
| 1 | A | m | 2500|
| 2 | B | f | 1500|
| 3 | C | m | 5S00|
| 4 | D | f | 500|

运行你所策写的更新语句之后，将会得到以下表:

| id | name | sex | salary |
| ----  | ----  | ----  | ----  | 
| 1 | A | f | 2500 |
| 2 | B | m | 1500 |
| 3 | C  | f | 5S00 |
| 4 | D | m | 500  |

```SQL
update salary set 
sex =if (sex='f','m','f');
```

```SQL
update salary set
sex = case sex when "m" then "f" else "m" end;
```

### 腾讯面试题

table_A （ 用户userid和登录时间time）求连续登录3天的用户数

 ```SQL
SELECT userid,time,
DATE_SUB(time,INTERVAL t.rn DAY) as flag_date,count(*)
from (SELECT userid,time,row_number()over(PARTITION by userid ORDER BY time) as rn
from  table_A) as t
GROUP BY user_id,flag_date
HAVING count(*)>=3;
 ```
> 解析：用窗口函数row_nuumber 进行排序，日期函数DTESUB，将（日期-排序数）得到一个相等的日期flag_date，以其进行分组，将连续的日期分为一组


### 滴滴面试题

学生表:tb_student(name:学生姓名，id：学号，class：班级，in_time：入学时间，age:年龄，sex：性别，major：专业)

学生成绩表：tb_score(id：学号，course：课程，score：分数)

（1）筛选出2017年入学的“计算机”专业年龄最小的10位同学名单（姓名、学号、班级、年龄）
 ```SQL
select name,id,class,age
from tb_student
where year(in_time)=2017 
and major = '计算机'
ORDER BY age ASC
limit 10;
 ```

（2）统计每个班同学各科成绩平均分大于80分的人数和人数占比
 ```SQL
SELECT a.class,
sum(case when aaa.x > 80 then 1 else 0 end)as num_80 ,
(sum(case when aaa.x > 80 then 1 else 0 end)/count(*))as proportion
from tb_student a 
INNER JOIN (SELECT id,avg(score)as x from tb_score GROUP BY id)as aaa
on a.id = aaa.id
GROUP BY class;
 ```
> 解析：写一个子查询，从score表中得到以学号分组的学生各科平均分。命名为aaa，将其与学生表内联结。再以class分组，得到以class分组的各班学生的平均分，最后通过case语句，sum聚合函数得到平均分>80分的计数，和所占各班总人数比例。case语句也可以用if语句来代替

### 滴滴面试题
table1（id：自增id，money：费用）问题：按id顺序累加money，取出累计值与1000相差最小差值的id。

```SQL
select id,
abs((sum(money)over(order by id))-1000) as x
from table1
order by x asc
limit 1;
```

```SQL
select id,min(abs(x-1000))
FROM(SELECT id,
sum(money)over(ORDER BY id)as x
from table1)as aaa
```

### 滴滴面试题

Employee 表包含所有员工信息，每个员工有其对应的 Id, Name,Salary 和 DepartmentId。

|  Id   | Name  | Salary  | DepartmentId  |
|  ----  | ----  | ----  | ----  |
| 1 | Joe | 70000 | 1 |
| 2 | Henry | 80000 | 2 |
| 3 | Sam | 60000 | 2 |
| 4 | Max | 90000 | 1 |

Department 表包含公司所有部门的信息。

| Id | Name |
|  ----  | ----  |
| 1 | IT |
| 2 | Sales |

编写一个 SQL 查询，找出每个部门工资第二高的员工。
 ```SQL
    select Departmentid,Name,Salary,rn
    from(select *,
    row_number()over(PARTITION by Departmentid 
    ORDER BY Salary desc) as rn
    from Employee)as a
    WHERE rn=2
 ```

### 牛客网题
1. 有一张学生成绩表sc（sno 学号，class 课程，score 成绩），请查询出每个学生的英语、数学的成绩（行转列，一个学生只有一行记录）。
```SQL
select sno,
sum(if(class='english',score,0)) as english,
sum( if(class='math',score,0) ) as math
from sc
where class in('english','math')
group by sno
 ```

2. 有一个名为app的MySQL数据库表，app_id（应用ID）， version_code（应用的版本号），download_count （当前版本的下载量）查询每个应用中总下载量最大的版本号和次数

| app_id | version_code | download_count |
|  ----  | ----  |----  |
| 1 | 10 | 90 |
| 1 | 11 | 100 |
| 1 | 10 | 20 |
| 2 | 15 | 10 |
| 2 | 16 | 15 |
| 2 | 17 | 30 |
| 2 | 16 | 5 |
| 3 | 2 | 50 |

```SQL
select app_id,version_code,sum_donload
from(select *,sum(download_count)as sum_donload,
dense_rank()over(partition by app_id order by sum(download_count) desc) as dr
from app
GROUP BY app_id,version_code)as x
WHERE dr =1;
```

%[{ contactme.md }]%

