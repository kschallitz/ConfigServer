package com.example.demo;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	// Update the cross site response filtering to allow all requests.
        http.csrf().disable().authorizeRequests()
        // Used incorrect port, let's try 8080
        .anyRequest().authenticated().and()
        .httpBasic();
    }
}
