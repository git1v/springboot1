package com.rose.web;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot1Application {
	@Autowired
    MyDataEntityRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(Springboot1Application.class, args);
	}
    @PostConstruct
    public void intialData(){
        repository.save(new MyDataEntity("tuyano","syoda@tuyano"));
        repository.save(new MyDataEntity("hanako","hanako@flower"));
        repository.save(new MyDataEntity("sachiko","sachico@happy"));
        repository.save(new MyDataEntity("taro","taro@yamada"));
        repository.flush();
    }
}
