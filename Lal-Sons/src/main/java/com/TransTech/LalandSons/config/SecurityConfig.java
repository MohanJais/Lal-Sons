package com.TransTech.LalandSons.config;

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
/*
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            // ... other configurations
            .authorizeRequests()
                .antMatchers("/admin/**").hasRole("Admin")
                .antMatchers("/manager/**").hasRole("Manager")
                .antMatchers("/employee/**").hasRole("Employee")
                .antMatchers("/customer/**").hasRole("Customer")
                .antMatchers("/public/**").permitAll()
            .and()
            .formLogin()
            // ... other configurations
            .logout()
            // ... other configurations
            .and()
            .exceptionHandling()
            // ... other configurations
            .and()
            .rememberMe()
            // ... other configurations
            .and()
            .csrf().disable();
    }
}
*/