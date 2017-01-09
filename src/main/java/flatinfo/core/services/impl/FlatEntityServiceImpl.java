package flatinfo.core.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import flatinfo.core.models.entities.flat.FlatEntity;
import flatinfo.core.models.entities.owner.OwnerEntity;
import flatinfo.core.models.entities.user.UserEntity;
import flatinfo.core.repositories.UserRepository;
import flatinfo.core.services.FlatEntityService;
import flatinfo.core.services.util.FlatEntityList;

@Service
//@Repository
@Transactional
//@EnableMongoRepositories(basePackages = "flatinfo.core.repository")
public class FlatEntityServiceImpl implements FlatEntityService {
	
	

	@Override
	public FlatEntity findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FlatEntity findByAddress(String address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FlatEntityList findByUser(UserEntity user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FlatEntityList findByOwner(OwnerEntity owner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FlatEntityList findAllFlats() {
		// TODO Auto-generated method stub
		return null;
	}

}
