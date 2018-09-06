package com.appstude.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig  extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.csrf().disable().headers().frameOptions().disable().and()
			          .authorizeRequests().antMatchers("/api/**").hasRole("USER").and()
			              .authorizeRequests().antMatchers("/**").hasRole("ADMIN");
	
	
	}
	
	@Autowired
	public void globalConfig(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication()
		    .withUser("user1").password("123").roles("USER").and()
            .withUser("admin").password("123").roles("USER","ADMIN");
		
	}
}
