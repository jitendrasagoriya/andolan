package com.indian.andolan.builder;

import java.sql.Timestamp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.indian.andolan.enums.Level;
import com.indian.andolan.model.AuditUiLogs.AuditUiLogsBuilder;

public class AuditUiLogBuilder {

	public static void main(String[] args) {
		try {
			System.out
					.println(new AuditUiLogsBuilder(new Long(1l), new Timestamp(System.currentTimeMillis()), "My first log",Level.INFO)
							.buildJson());
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
