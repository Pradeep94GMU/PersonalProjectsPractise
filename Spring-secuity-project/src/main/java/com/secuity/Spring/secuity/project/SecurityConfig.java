package com.secuity.Spring.secuity.project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {


    @Bean
    public SecurityFilterChain defaultSecurityBasic(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests((req) -> req.anyRequest().authenticated());
        http.httpBasic(Customizer.withDefaults());

        http.sessionManagement(
                session-> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        );

        return http.build();
    }


    @Bean
    public UserDetailsService users(){

        UserDetails user1 = User.withUsername("user1")
                .password("{noop}pass1")
                .roles("USER")
                .build();

        UserDetails user2 = User.withUsername("user2")
                .password("{noop}pass2")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user1, user2);
    }

}
