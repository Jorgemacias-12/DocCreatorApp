package org.jamz.DocCreatorApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.sql.DataSource;

@SpringBootApplication
public class DocCreatorAppApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(DocCreatorAppApplication.class, args);
        }
        catch(Exception ignore) {}
    }

    @Bean(name="entityManagerFactory")
    public EntityManagerFactory getEntityManagerFactoryBean() {
        String DATABASE_NAME = "DocCreatorApp.odb";
        return Persistence.createEntityManagerFactory(DATABASE_NAME);
    }

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(entityManagerFactory);
        return txManager;
    }

    @Bean
    @ConfigurationProperties("app.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

}
