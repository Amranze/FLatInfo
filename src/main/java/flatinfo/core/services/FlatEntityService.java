package flatinfo.core.services;

import flatinfo.core.models.entities.flat.FlatEntity;
import flatinfo.core.models.entities.owner.OwnerEntity;
import flatinfo.core.models.entities.user.UserEntity;
import flatinfo.core.services.util.FlatEntityList;

public interface FlatEntityService {
	public FlatEntity findById(Long id);
	public FlatEntity findByAddress(String address);
	public FlatEntityList findByUser(UserEntity user);
	public FlatEntityList findByOwner(OwnerEntity owner);
	public FlatEntityList findAllFlats();
	//TODO implements new method for finding by type and so on
}
