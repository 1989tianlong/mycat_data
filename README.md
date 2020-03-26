# mycat_data
sample split database and table base on mycat
简单的基于Spring boot + Mybatis + Mycat 分库分表方式
1.Mycat 下载地址：https://github.com/MyCATApache/Mycat-download 解压后，执行./mycat start 启动。
2.Mycat 核心配置文件：
  schema.xml是MyCat的重要配置文件，它管理着逻辑库、分片表、分片节点和分片主机等信息。
3.spring.datasource.url直接指向：jdbc:mysql://127.0.0.1:8066/TESTDB 其他和操作单一Mysql数据库相同。
4.工程中src/conf中添加了，本工程的Mycat配置文件。

