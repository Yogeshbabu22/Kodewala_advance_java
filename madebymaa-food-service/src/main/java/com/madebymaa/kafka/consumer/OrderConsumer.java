package com.madebymaa.kafka.consumer;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
	
	public void emailSenderConsumer() {
		Properties prop = new Properties();
		
		prop.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		prop.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "B-Group-1");
		prop.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		prop.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		
		
		KafkaConsumer consumer = new KafkaConsumer(prop);
		consumer.subscribe(Collections.singletonList("order"));

		while (true) {
		    ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(1000));
		    for (ConsumerRecord<String, String> record : records) {
		        System.out.println(record.value());
		    }
		
		
	}
	
	
	}
}

