package com.example.yanh.kafkademon;

/**
 * @author yanh
 * @create 2019/4/4 13:43
 */
public class KafkaProducerDemo {

	public static void main(String[] args)
	{
		KafkaProducer producerThread = new KafkaProducer(KafkaProperties.topic);
		producerThread.start();
	}

}
