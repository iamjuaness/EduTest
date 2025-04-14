package com.microservice.user.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

@Configuration
public class DatabaseConnectionTest {

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Bean
    public CommandLineRunner testConnection() {
        return args -> {
            System.out.println("Testing database connection...");
            System.out.println("URL: " + url);
            System.out.println("Username: " + username);

            try {
                Connection connection = DriverManager.getConnection(url, username, password);
                System.out.println("Connection successful!");
                connection.close();
            } catch (Exception e) {
                System.out.println("Connection failed with error: " + e.getMessage());
                e.printStackTrace();
            }
        };
    }
}