package com.indian.andolan.service;

import org.springframework.stereotype.Service;

@Service
public interface AuditUiLogsService<R> extends BaseSerivce<R> {
	public R repository();
}
