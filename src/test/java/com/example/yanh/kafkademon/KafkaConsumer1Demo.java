package com.example.yanh.kafkademon;

/**
 * @author yanh
 * @create 2019/4/4 13:43
 */
public class KafkaConsumer1Demo {

	public static void main(String[] args)
	{
		KafkaConsumer consumerThread = new KafkaConsumer(KafkaProperties.topic);
		consumerThread.start();
	}

}
