package com.kodewala.kafka;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

public class App {
	public static void main(String[] args) {
		// 1.Configure the consumer(Host, Group Id, Ser/DeSer)
		Properties prop = new Properties();
		prop.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		prop.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "my-group-1");
		prop.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		prop.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());

		// 2.Create Kafka Consume

		KafkaConsumer consumer = new KafkaConsumer(prop);

		// 3.subscribe the Topic....

		consumer.subscribe(Collections.singletonList("email-sender"));

		// 4.poll the consumer/topic
		while (true) {
			ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(1000));

			for (ConsumerRecord<String, String> record : records) {
				System.out.println(record.value());

			}
		}

	}

}
