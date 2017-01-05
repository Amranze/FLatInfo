package flatinfo.core.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

@Component
public class AuthFailure extends SimpleUrlAuthenticationFailureHandler {

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {
		// TODO Auto-generated method stub
		super.onAuthenticationFailure(request, response, exception);
		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
	}

	@Override
	public void setDefaultFailureUrl(String defaultFailureUrl) {
		// TODO Auto-generated method stub
		super.setDefaultFailureUrl(defaultFailureUrl);
	}

}
