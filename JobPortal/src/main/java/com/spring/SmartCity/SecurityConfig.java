//package com.spring.SmartCity;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
//import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
//
//import com.spring.service.UserDetailsServiceImpl;
//
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//	
//	    @Autowired
//	    private DataSource dataSource;
//
//		@Autowired
//		UserDetailsServiceImpl userDetailsService;
//		
//		@Bean
//	    public BCryptPasswordEncoder passwordEncoder() {
//	        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//	        return bCryptPasswordEncoder;
//	    }
//		
//		 @Autowired
//		    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//			 auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//		 }
//		
//		
//		  @Override
//		    protected void configure(HttpSecurity http) throws Exception {
//		        http
//		                .authorizeRequests()
//		                .antMatchers("/resources/**","/app-assets/**","/login").permitAll()
//		                .anyRequest().authenticated() 
//		                .and()
//		                .formLogin()
//		                .loginPage("/login")
//		                .usernameParameter("username")// overrides Spring's default
//		                .passwordParameter("password")// overrides Spring's default
//		                .defaultSuccessUrl("/index", true)
//		                .permitAll()
//		                .and()
//		                .logout()
//		                .permitAll()
//		                .and().csrf().disable(); // we'll enable this in a later blog post
//		    }
//		
//
//		  @Bean
//		  public PersistentTokenRepository persistentTokenRepository() {
//		      JdbcTokenRepositoryImpl db = new JdbcTokenRepositoryImpl();
//		      db.setDataSource(this.dataSource);
//		      return db;
//		  }
//		
//}
