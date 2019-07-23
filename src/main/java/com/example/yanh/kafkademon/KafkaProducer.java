package com.example.yanh.kafkademon;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

import java.util.Properties;

/**
 * @author yanh
 * @create 2019/4/3 17:56
 */
public class KafkaProducer extends Thread {

	private final Producer<Integer, String> producer;
	private final String topic;
	private final Properties props = new Properties();

	KafkaProducer(String topic) {
		props.put("serializer.class", "kafka.serializer.StringEncoder");
		props.put("metadata.broker.list", KafkaProperties.kafkaConnect);
		producer = new Producer<>(new ProducerConfig(props));
		this.topic = topic;
	}

	@Override
	public void run() {
		int messageNo = 1;
		while (true) {
			String messageStr = "message_" + messageNo;
			producer.send(new KeyedMessage<>(topic, messageStr));
			System.out.println("Send: " + messageStr);
			messageNo++;
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
