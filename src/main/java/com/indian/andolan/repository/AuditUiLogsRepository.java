package com.indian.andolan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indian.andolan.model.AuditUiLogs;

@Repository
public interface AuditUiLogsRepository extends JpaRepository<AuditUiLogs, Long> {

}
