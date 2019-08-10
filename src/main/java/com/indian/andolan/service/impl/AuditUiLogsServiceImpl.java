package com.indian.andolan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indian.andolan.repository.AuditUiLogsRepository;
import com.indian.andolan.service.AuditUiLogsService;

@Service
public class AuditUiLogsServiceImpl implements AuditUiLogsService<AuditUiLogsRepository> {

	@Autowired
	private AuditUiLogsRepository repository;
	
	@Override
	public AuditUiLogsRepository repository() {
		return repository;
	}

}
