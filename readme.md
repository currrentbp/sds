
###项目描述
本项目是springcloud+dubbo+skywalking的，但是skywalking使用的时候直接使用了javaagent

nohup java -javaagent:/home/work/skyWalking/apache-skywalking-apm-bin-es7/agent/skywalking-agent.jar  
-Dskywalking.agent.service_name=sds_provider -jar sds_provider-1.0-SNAPSHOT.jar > provider.log 2>&1 &

###项目结构
一共有三个模块：comment：实体类、接口，provider：服务提供者，consumer：消费者，同时也是对web提供服务的













