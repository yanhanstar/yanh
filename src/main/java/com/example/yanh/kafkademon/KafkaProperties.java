package com.example.yanh.kafkademon;

/**
 * @author yanh
 * @create 2019/4/3 17:53
 */
public interface KafkaProperties {
	final static String kafkaConnect = "10.3.1.104:9094";
	final static String zkConnect = "10.3.1.104:2181";
	final static String groupId = "yanh";
	final static int kafkaProducerBufferSize = 64 * 1024;
	final static int connectionTimeOut = 20000;
	final static int reconnectInterval = 10000;
	final static String topic = "yanh_test_topic1";
	final static String clientId = "SimpleConsumerDemoClient";
}
