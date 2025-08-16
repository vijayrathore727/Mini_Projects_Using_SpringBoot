package com.example.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        //http.authorizeHttpRequests((requests) -> ((AuthorizeHttpRequestsConfigurer.AuthorizedUrl)requests.anyRequest()).permitAll());
//        http.authorizeHttpRequests((requests) -> ((AuthorizeHttpRequestsConfigurer.AuthorizedUrl)requests
//                .requestMatchers("/myAccount","/myBalance","/myCards","/contact").authenticated()
//                .requestMatchers("/myLoans","/myNotices","/error").permitAll());

        http.authorizeHttpRequests(auth -> auth
                .requestMatchers("/myAccount", "/myBalance", "/myCards", "/contact").authenticated()
                .requestMatchers("/myLoans", "/myNotices", "/error").permitAll()
        );

        http.formLogin(flc->flc.disable());
        http.httpBasic(Customizer.withDefaults());
        return (SecurityFilterChain)http.build();
    }
}
