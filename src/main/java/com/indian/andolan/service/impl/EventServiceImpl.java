package com.indian.andolan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indian.andolan.repository.EventRepository;
import com.indian.andolan.service.EventService;

@Service
public class EventServiceImpl  implements EventService<EventRepository> {	
	
	@Autowired
	private EventRepository repository;

	@Override
	public EventRepository repository() {		
		return repository;
	}

	 
}
