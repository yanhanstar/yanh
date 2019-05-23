package com.example.yanh.kafkademon;

/**
 * @author yanh
 * @create 2019/4/3 17:53
 */
public interface KafkaProperties {
	String kafkaConnect = "10.3.1.104:9094";
	String zkConnect = "10.3.1.104:2181";
	String groupId = "yanh";
	String topic = "yanh_test_topic1";
}
