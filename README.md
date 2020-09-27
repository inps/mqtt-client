# Springboot 继承 MQTT 
 
## 2020年9月27日
- 安装activemq-artemis  ， poho客户端
- Springboot 继承 MQTT，内部使用的是paho的java客户端


D:\install\apache-artemis-2.15.0\bin> .\artemis create D:\install\apache-artemis-2.15.0\bin\mydata

D:\install\apache-artemis-2.15.0\bin\mydata\bin\artemis run

Or you can setup the broker as Windows service and run it in the background:

   D:\install\apache-artemis-2.15.0\bin\mydata\bin\artemis-service.exe install
   D:\install\apache-artemis-2.15.0\bin\mydata\bin\artemis-service.exe start

   To stop the windows service:
      "D:\install\apache-artemis-2.15.0\bin\mydata\bin\artemis-service.exe" stop
   To uninstall the windows service
      "D:\install\apache-artemis-2.15.0\bin\mydata\bin\artemis-service.exe" uninstall


- 访问
http://localhost:8080/sendMqttMessage?message=mes&topic=test