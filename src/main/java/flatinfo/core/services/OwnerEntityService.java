package flatinfo.core.services;

import flatinfo.core.models.entities.flat.FlatEntity;
import flatinfo.core.models.entities.owner.OwnerEntity;
import flatinfo.core.models.entities.user.UserEntity;
import flatinfo.core.services.util.OwnerEntityList;

public interface OwnerEntityService {
	public OwnerEntity findById(Long id);
	public OwnerEntityList findByAddress(String address);
	//Name can be Last Name or First Name
	public OwnerEntity findByName(String name);
	public OwnerEntityList findByUser(UserEntity user);
	public OwnerEntityList findByFlat(FlatEntity flat);
	public OwnerEntityList findAllOwners();
}

