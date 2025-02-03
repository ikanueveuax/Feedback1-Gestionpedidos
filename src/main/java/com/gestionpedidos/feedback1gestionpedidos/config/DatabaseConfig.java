package com.gestionpedidos.feedback1gestionpedidos.config;

import javax.sql.DataSource;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {
    @Bean
    public DataSource dataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/tu_base_de_datos");
        dataSource.setUsername("usuario");
        dataSource.setPassword("contraseña");
        // Configuraciones adicionales de HikariCP
        return dataSource;
    }
}
