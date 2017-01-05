package flatinfo.rest.resources;

import org.springframework.hateoas.ResourceSupport;

import flatinfo.core.models.entities.user.UserEntity;

public class UserEntityResource extends ResourceSupport {
	private UserEntity user;
	private Long rid;
	
	public UserEntity getUser() {
		return user;
	}
	public void setUser(UserEntity user) {
		this.user = user;
	}
	public Long getRid() {
		return rid;
	}
	public void setRid(Long rid) {
		this.rid = rid;
	}
	
}
