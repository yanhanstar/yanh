package com.example.yanh.kafkademon;

/**
 * @author yanh
 * @create 2019/4/3 17:53
 */
public interface KafkaProperties {
	String kafkaConnect = "59.110.1.233:9094";
	String zkConnect = "59.110.1.233:2181";
	String groupId = "yanh";
	String topic = "yanh_test_topic1";
}
