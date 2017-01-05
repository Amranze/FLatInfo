package flatinfo.core.services.util;

import java.util.ArrayList;
import java.util.List;

import flatinfo.core.models.entities.user.UserEntity;

public class UserEntityList {
	private List<UserEntity> users = new ArrayList<UserEntity>();

	public UserEntityList(List<UserEntity> users) {
		super();
		this.users = users;
	}

	public List<UserEntity> getUsers() {
		return users;
	}

	public void setUsers(List<UserEntity> users) {
		this.users = users;
	}

}
