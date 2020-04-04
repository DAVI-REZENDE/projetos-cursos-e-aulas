package com.davi.estacionamento.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnetionFactory {

	
public static DataSource datasource;
	
	public ConnetionFactory() {
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		cpds.setJdbcUrl("jdbc:mysql://localhost/estacionamento?useTimezone=true&serverTimezone=UTC&zeroDateTimeBehavior=convertToNull");
		cpds.setUser("root");
		cpds.setPassword("Info@1234");
		
		cpds.setMaxPoolSize(15);
		
		this.datasource = cpds;
		
	}

	public static Connection getConnection() throws SQLException {
		return datasource.getConnection();
				
		
	}
	
}
