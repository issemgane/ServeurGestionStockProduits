package com.appstude.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter{

	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http
		.httpBasic()
		   .and()
		      .authorizeRequests()
		          .antMatchers("/api/produits/crud/**").hasAnyRole("ADMIN","USER")
		             .antMatchers("/api/user/**").hasAnyRole("ADMIN","USER")
		              .antMatchers("/api/user/crud/**").hasAnyRole("ADMIN").and()
		              //.antMatchers("/api/user/crud/**").hasAnyRole("ADMIN","USER").and()
		                 .csrf().disable().headers().frameOptions().disable();
	}


	@Autowired
	public void globalConfig(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userDetailsService).passwordEncoder(NoOpPasswordEncoder.getInstance());
	}
}
