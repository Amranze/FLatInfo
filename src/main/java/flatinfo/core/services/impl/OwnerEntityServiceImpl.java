package flatinfo.core.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import flatinfo.core.models.entities.flat.FlatEntity;
import flatinfo.core.models.entities.owner.OwnerEntity;
import flatinfo.core.models.entities.user.UserEntity;
import flatinfo.core.services.OwnerEntityService;
import flatinfo.core.services.util.OwnerEntityList;

@Service
@Transactional
public class OwnerEntityServiceImpl implements OwnerEntityService{

	@Override
	public OwnerEntity findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OwnerEntityList findByAddress(String address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OwnerEntity findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OwnerEntityList findByUser(UserEntity user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OwnerEntityList findByFlat(FlatEntity flat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OwnerEntityList findAllOwners() {
		// TODO Auto-generated method stub
		return null;
	}

}
