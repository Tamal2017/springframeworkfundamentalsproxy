package com.joseph.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.joseph.training")
@EnableTransactionManagement
public class ConfigApp {

  @Bean
  public PlatformTransactionManager getTransactionManager() {
    DataSourceTransactionManager dataSource = new DataSourceTransactionManager();
    dataSource.setDataSource(new EmbeddedDatabaseBuilder().setType(
        EmbeddedDatabaseType.H2).build());
    return dataSource;
  }
}
