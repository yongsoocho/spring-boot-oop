package org.java.oop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class JpaConfig {

	@Bean
	public DataSource getDataSource() {
		DataSourceBuilder<?> builder = DataSourceBuilder.create();

		builder.username("hi");
		builder.password("123");
		builder.url("123");
		builder.driverClassName("123");

		return builder.build();
	}

}
