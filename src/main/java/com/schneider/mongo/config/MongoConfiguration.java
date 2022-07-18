package com.schneider.mongo.config;

import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@ConfigurationProperties("spring.data.mongodb.uri")
@EnableMongoRepositories(basePackages = { "com.schneider.mongo.repositories" })
public class MongoConfiguration extends MongoAutoConfiguration {

}
