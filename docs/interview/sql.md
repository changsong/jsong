### 力扣网

编写一个 SQL 查询，获取 Employee 表中第二高的薪水（Salary） 。

+----+--------+
| Id | Salary |
+----+--------+
| 1  | 100    |
| 2  | 200    |
| 3  | 300    |
+----+--------+

例如上述 Employee 表，SQL查询应该返回 200 作为第二高的薪水。如果不存在第二高的薪水，那么查询应返回 null。

+---------------------+
| SecondHighestSalary |
+---------------------+
| 200                 |
+---------------------+

#### 解题思路
#### 子查询

select IFNULL((select Distinct Salary from Employee order by Salary DESC limit 1,1),null)
as SecondHighestSalary

> 原题不变，查询第n高薪水

#### 
![](https://pic4.zhimg.com/80/v2-a9f1b8fcac0bf2de90d11d95c4e322df_720w.jpg)


#### 
![](https://pic2.zhimg.com/80/v2-42bcefaf7d2f759757adeee52b4953d9_720w.jpg)


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
SELECT a.class,count(if(aaa.avg>80,true,null)) as numover80,
count(if(aaa.avg>80,true,null))/count(a.id) as total
from tb_student a 
INNER JOIN (SELECT id,avg(score)as x from tb_score GROUP BY id)as aaa
on a.id = aaa.id
GROUP BY class;
 ```

### 滴滴面试题

Employee 表包含所有员工信息，每个员工有其对应的 Id, Name,Salary 和 DepartmentId。

+----+-------+--------+--------------+

| Id | Name | Salary | DepartmentId |

+----+-------+--------+--------------+

| 1 | Joe | 70000 | 1 |

| 2 | Henry | 80000 | 2 |

| 3 | Sam | 60000 | 2 |

| 4 | Max | 90000 | 1 |

Department 表包含公司所有部门的信息。

+----+----------+

| Id | Name |

+----+----------+

| 1 | IT |

| 2 | Sales |

+----+----------+

编写一个 SQL 查询，找出每个部门工资第二高的员工。

### 牛客网题
1. 请取出 BORROW表中日期(RDATE字段)为当天的所有记录？(RDATE字段为datetime型，包含日期与时间)。

2. 有一张学生成绩表sc（sno 学号，class 课程，score 成绩），请查询出每个学生的英语、数学的成绩（行转列，一个学生只有一行记录）。

3. 有一个名为app的MySQL数据库表，app_id（应用ID）， version_code（应用的版本号），download_count （当前版本的下载量）查询每个应用中总下载量最大的版本号和次数

+--------+--------------+----------------+

| app_id | version_code | download_count |

+--------+--------------+----------------+

| 1 | 10 | 90 |

| 1 | 11 | 100 |

| 1 | 10 | 20 |

| 2 | 15 | 10 |

| 2 | 16 | 15 |

| 2 | 17 | 30 |

| 2 | 16 | 5 |

| 3 | 2 | 50 |

+--------+--------------+----------------+

[整理来源](https://zhuanlan.zhihu.com/p/110924684)

%[{ contactme.md }]%

