package com.flatinfo.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.security.web.authentication.rememberme.AbstractRememberMeServices;
import org.springframework.security.web.authentication.rememberme.PersistentTokenBasedRememberMeServices;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	
	
	/*@Bean   
	  public AbstractRememberMeServices rememberMeServices() {
	      PersistentTokenBasedRememberMeServices rememberMeServices =
	          new PersistentTokenBasedRememberMeServices("AppKey",UserRepositoryImpl,persistentTokenRepository());
	      rememberMeServices.setAlwaysRemember(true);
	      //rememberMeServices.setTokenLength(1209600);
	      rememberMeServices.setCookieName("remember-me-posc");
	      rememberMeServices.setTokenValiditySeconds(1209600);
	      return rememberMeServices;
	  }*/
	  
	

	@Bean
	public SavedRequestAwareAuthenticationSuccessHandler savedRequestAwareAuthenticationSuccessHandler() {
		SavedRequestAwareAuthenticationSuccessHandler auth = new SavedRequestAwareAuthenticationSuccessHandler();
		auth.setTargetUrlParameter("targetUrl");
		return auth;
	}
}
