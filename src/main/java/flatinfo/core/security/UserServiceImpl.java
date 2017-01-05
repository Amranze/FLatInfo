package flatinfo.core.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import flatinfo.core.models.entities.user.UserEntity;
import flatinfo.core.services.UserEntityService;

@Component
public class UserServiceImpl implements UserDetailsService {
	@Autowired
	private UserEntityService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity user = userService.findByAccount(username);
		if(user == null){
			throw new UsernameNotFoundException("There is no user with name/or mail = "+username);
		}
		return new UserEntityDetails(user);
	}
}
