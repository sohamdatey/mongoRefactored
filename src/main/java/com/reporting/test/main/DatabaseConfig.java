package com.reporting.test.main;

import static java.util.Arrays.asList;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import com.mongodb.MongoClientSettings;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.WriteConcern;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.connection.ClusterSettings;
import com.mongodb.connection.ClusterSettings.Builder;


@Configuration
public class DatabaseConfig extends AbstractMongoClientConfiguration {

	@Override
	protected String getDatabaseName() {
		System.out.println("hellllllllllllllllllllllllllllllllllllllllllllllll");
		return "Reporting";
	}
	
	@Bean
	@Override
	public MongoClient mongoClient(){
		System.out.println("hello configuring mongo : soham datey");
		//Builder builder = ClusterSettings.builder().requiredReplicaSetName("zdfvdf");
		
		MongoCredential credential=MongoCredential.createPlainCredential("", getDatabaseName(), "".toCharArray());
		MongoClientSettings mongoClientSettings = MongoClientSettings.builder().applyToClusterSettings(settings  -> {
			settings.hosts(asList(new ServerAddress("localhost",36421))).requiredReplicaSetName("zdfvdf");
  	    })
		
		.credential(credential)
		.writeConcern(WriteConcern.MAJORITY.withWTimeout(20, TimeUnit.SECONDS))
		
		.build();
		
		ClusterSettings clusterSettings = mongoClientSettings.getClusterSettings();
		
		return  MongoClients.create(mongoClientSettings);
	}
	
}
