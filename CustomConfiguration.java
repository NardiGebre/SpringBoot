package com.Nardos.Restaurant;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
 
	@Configuration
	public class CustomConfiguration {
		@Value("${spring.datasource.url}")
		String dburl;
		@Value("${spring.datasource.password}")
		String password;
		@Value("${spring.datasource.username}")
		String username;
		@Value("${spring.datasource.driver-class-name}")
		String drivername;
		
		@Bean
		@ConditionalOnProperty(name = "use.custom.datasource", havingValue= "true")
//	use.custom.override for overriding the springBoot Configuration
		public DataSource datasource () {
			DriverManagerDataSource datasource = new DriverManagerDataSource();
			datasource.setDriverClassName(drivername);
			datasource.setUrl(dburl);
			datasource.setUsername(username);
			datasource.setPassword(password);
			
			return datasource;		
		}
	}


