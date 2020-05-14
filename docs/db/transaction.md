### 数据库事务 

事务（Transaction）是并发控制的基本单位。所谓的事务，它是一个操作序列，这些操作要么都执行，要么都不执行，它是一个不可分割的工作单位。
例如，银行转账工作：从一个账号扣款并使另一个账号增款，这两个操作要么都执行，要么都不执行。所以，应该把它们看成一个事务。事务是数据库维护数据一致性的单位，在每个事务结束时，都能保持数据一致性。

 针对上面的描述可以看出，事务的提出主要是为了解决并发情况下保持数据一致性的问题。

事务具有以下4个基本特征。
- Atomic（原子性）：事务中包含的操作被看做一个逻辑单元，这个逻辑单元中的操作要么全部成功，要么全部失败。
- Consistency（一致性）：只有合法的数据可以被写入数据库，否则事务应该将其回滚到最初状态。
- Isolation（隔离性）：事务允许多个用户对同一个数据进行并发访问，而不破坏数据的正确性和完整性。同时，并行事务的修改必须与其他并行事务的修改相互独立。
- Durability（持久性）：事务结束后，事务处理的结果必须能够得到固化。


### 事务的语句
- 开始事物：BEGIN TRANSACTION
- 提交事物：COMMIT TRANSACTION
- 回滚事务：ROLLBACK TRANSACTION

显示事务被用begin transaction 与 end transaction 标识起来，其中的 update 与 delete 语句或者全部执行或者全部不执行
begin transaction T1
update student
set name='Tank'
where id=2006010
delete from student
where id=2006011
commit

### 事务的保存点
     SAVE TRANSACTION 保存点名称 --自定义保存点的名称和位置
     ROLLBACK TRANSACTION 保存点名称 --回滚到自定义的保存点


%[{ contactme.md }]%

