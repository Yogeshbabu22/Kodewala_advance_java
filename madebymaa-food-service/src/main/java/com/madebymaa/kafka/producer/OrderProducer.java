package com.madebymaa.kafka.producer;

import java.util.Properties;

import com.madebymaa.controller.OrderController;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;


@Service
public class OrderProducer {


	public void emailSender(String message){
		Properties props = new Properties();
		props.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		props.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		props.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

		KafkaProducer<String, String> producer = new KafkaProducer<>(props);

		ProducerRecord<String, String> record =
		        new ProducerRecord<>("email-sender", message);

		producer.send(record);
		producer.close();

	}
	


   
    
}
