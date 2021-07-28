# Spring Boot With Kafka

#### Download kafka & Zookeeper

https://kafka.apache.org/downloads

https://zookeeper.apache.org/releases.html



**Run Zookeeper**

Rename zoo_sample.cfg to zoo.cfg  and add the following lines to enable some commands. This file is in config folder

`4lw.commands.whitelist=*`

Open command prompt in bin folder then type 

`zkServer.bat and run zookeeper`

**Run Kafka**

Go to config folder of kafka then open server.properties file and find listeners=PLAINTEXT:// and change to listeners=PLAINTEXT://localhost:9092

open command prompt in bin folder and type following command

`kafka-server-start.bat ../../config/server.properties`

**Create topic**

open command prompt in kafka bin folder then type following command

`kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partions 1 --topic test`


Now Run application, URL - http://localhost:8081/topic/message - This will send meesage to producer
See console for output
