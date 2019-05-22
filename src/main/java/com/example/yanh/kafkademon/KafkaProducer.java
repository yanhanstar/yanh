package com.example.yanh.kafkademon;

import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

import java.util.Properties;

/**
 * @author yanh
 * @create 2019/4/3 17:56
 */
public class KafkaProducer extends Thread {

	private final kafka.javaapi.producer.Producer<Integer, String> producer;
	private final String topic;
	private final Properties props = new Properties();

	public KafkaProducer(String topic) {
		props.put("serializer.class", "kafka.serializer.StringEncoder");
		props.put("metadata.broker.list", KafkaProperties.kafkaConnect);
		producer = new kafka.javaapi.producer.Producer<Integer, String>(new ProducerConfig(props));
		this.topic = topic;
	}

	@Override
	public void run() {
		int messageNo = 1;
		while (true) {
			String messageStr = "message_" + messageNo;
			System.out.println("Send: " + messageStr);
			producer.send(new KeyedMessage<>(topic, messageStr));
			messageNo++;
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
