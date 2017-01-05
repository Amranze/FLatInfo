package com.flatinfo.Service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.authentication.rememberme.PersistentRememberMeToken;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import com.flatinfo.Config.Token;
import com.flatinfo.Repository.UserRepository;

public class TokenService implements PersistentTokenRepository  {

	@Autowired
	UserRepository repository;
	
	@Override
	public void createNewToken(PersistentRememberMeToken token) {
        /*repository.save(new Token(null,
                token.getUsername(),
                token.getSeries(),
                token.getTokenValue(),
                token.getDate()));	*/	
	}

	@Override
	public PersistentRememberMeToken getTokenForSeries(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeUserTokens(String username) {
       /* Token token = repository.findByUsername(username);
        if (token != null) {
            repository.delete(token);
        }*/
		
	}

	@Override
	public void updateToken(String arg0, String arg1, Date arg2) {
		// TODO Auto-generated method stub
		
	}

}
