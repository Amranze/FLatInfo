package flatinfo.rest.resources.asm;

import org.springframework.hateoas.Link;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import flatinfo.core.models.entities.user.UserEntity;
import flatinfo.rest.mvc.UserController;
import flatinfo.rest.resources.UserEntityResource;

public class UserEntityResourceAsm extends ResourceAssemblerSupport<UserEntity, UserEntityResource>{

	public UserEntityResourceAsm(){
		super(UserController.class, UserEntityResource.class);
	}
	
	public UserEntityResourceAsm(Class<?> controllerClass, Class<UserEntityResource> resourceType) {
		super(controllerClass, resourceType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public UserEntityResource toResource(UserEntity user) {
		UserEntityResource res = new UserEntityResource();
		Link link = linkTo(methodOn(UserController.class).getUser(user.getId())).withSelfRel();
		//or this way to generate the link but it needs requestMapping in the controller
		//Link link = linkTo(UserController.class).slash(user.getId()).withSelfRel();
		res.setUser(user);
		res.add(link.withSelfRel());
		return res;
	}

}
