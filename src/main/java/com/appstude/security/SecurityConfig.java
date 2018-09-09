package com.appstude.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		/*http
			.csrf().disable().headers().frameOptions().disable().and()
			          .authorizeRequests().antMatchers("/api/**").hasAnyRole("USER").and()
			              .authorizeRequests().antMatchers("/**").hasAnyRole("ADMIN");
		*/
		
		http
		.httpBasic()
		   .and()
		      .authorizeRequests().antMatchers("/api/produits/**").hasAnyRole("ADMIN","USER")
		           .antMatchers("/api/user/**").hasAnyRole("ADMIN","USER").and()
		            .csrf().disable().headers().frameOptions().disable();
		//.and().formLogin();
	}

	
	/*@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.csrf().disable()
			.authorizeRequests().antMatchers("/api/tickets/**").hasAnyRole("ADMIN","USER").and()
			.authorizeRequests().antMatchers("/api/admin/**").hasAnyRole("ADMIN").and().formLogin();
	}*/
	
	@Autowired
	public void globalConfig(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance())
		      .withUser("user").password("pass").roles("USER").and()
               .withUser("admin").password("123").roles("USER","ADMIN");
		
	}
}
