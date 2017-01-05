package flatinfo.core.services;

import flatinfo.core.models.entities.flat.FlatEntity;
import flatinfo.core.models.entities.owner.OwnerEntity;
import flatinfo.core.models.entities.user.UserEntity;
import flatinfo.core.services.util.UserEntityList;

public interface UserEntityService {
	public UserEntity findById(Long id);
	//Account can be username or mail
	public UserEntity findByAccount(String account);
	public UserEntityList findByFlat(FlatEntity flat);
	public UserEntityList findByFlatOwner(OwnerEntity owner);
	public UserEntityList findByAddress(String address);
	public UserEntityList findAllUsers();
	
	public UserEntity addUser(UserEntity user);
	public UserEntity updateUser(UserEntity user);
	public UserEntity deleteUser(Long id);
	public FlatEntity addFlat(Long id, FlatEntity flat);
}
