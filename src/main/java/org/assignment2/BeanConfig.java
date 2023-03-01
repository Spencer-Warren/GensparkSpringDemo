package org.assignment2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BeanConfig {
    @Bean
    public Address getAddress() {
        return new Address("Main Street", "New York", "New York", "444444", "USA");
    }

    @Bean
    public Phone getLandline() {
        return new Phone("landline");
    }

    @Bean
    public Phone getMobile() {
        return new Phone("mobile");
    }

    @Bean
    @Autowired
    public Student getStudent(List<Phone> phones, Address address) {
        return new Student(1, "John", phones, address);
    }


}
