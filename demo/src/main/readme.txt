数据库事务需要满足的几个要求：ACID
atomic(原子性)事务必须是原子的单元
consistent(一致性)事务完成时，必须使所有的数据都保持一直状态
isolationU(隔离性)并发事务所做的修改必须和事务所做的修改是隔离的
duration(持久性)事务完成之后，对系统的影响是永久的。

mysql里的事务的处理过程：
  1、记录redo和undo log文件，确保日志在磁盘上的持久化。
  2、更新数据记录。
  3、提交事务。redo写入commit记录。
  4、

  3pc(three phase commit)
  1、cancommit
  2、precommit
  3、docommit

  JOTM(JAVA open transction manager)
