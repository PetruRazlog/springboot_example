package net.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

    @Bean
    public EmployeeManager employeeManager() {
        return new EmployeeManagerImpl();
    }

}
