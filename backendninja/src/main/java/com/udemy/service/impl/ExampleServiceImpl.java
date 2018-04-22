package com.udemy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.udemy.controller.PostController;
import com.udemy.model.Person;
import com.udemy.service.ExampleService;


@SuppressWarnings("unused")
@Service("exampleService")
public class ExampleServiceImpl implements ExampleService{
	
	private static final org.apache.juli.logging.Log LOG = LogFactory.getLog(ExampleServiceImpl.class);

	@Override
	public List<Person> getListPeople() {
			 List<Person> people = new ArrayList<>();
			 people.add(new Person("Tatiana", 25));
			 people.add(new Person("Daniela", 19));
			 people.add(new Person("David", 26));
			 people.add(new Person("Sebastian", 18));
			 LOG.info("HELLO FROM SERVICE");
			 return people;
		
		}
	}