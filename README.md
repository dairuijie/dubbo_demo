# dubbo_demo
搭建SSM+zookeeper+dubbo 分布式Demo
配置文件中： classpath:/config/system-#{systemProperties['envTarget']}.properties 这个变量envTarget 其实在tomcat配置文件中添加的-DenvTarget="local"
不同的生产环境可以配置不同的参数。比如测试可以这样写：-DenvTarget="stg" 正式：-DenvTarget="pro" 

