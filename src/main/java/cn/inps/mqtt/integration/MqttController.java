package cn.inps.mqtt.integration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MqttController {
    @Autowired
    MqttGateway mqttGateway;

    /***
     * 发布消息，用于其他客户端消息接收测试
     */

    @RequestMapping("/sendMqttMessage")
    public String sendMqttMessage(String message, String topic) {
        mqttGateway.sendToMqtt(message, topic);
        return "ok";
    }
}