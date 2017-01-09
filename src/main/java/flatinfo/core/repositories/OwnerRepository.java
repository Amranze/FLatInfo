package flatinfo.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import flatinfo.core.models.entities.owner.OwnerEntity;
import flatinfo.core.services.util.OwnerEntityList;

public interface OwnerRepository extends MongoRepository<OwnerEntity, String>{
	public OwnerEntityList findAllOwners(); 
	public OwnerEntity findOwner(Long id); 
	public OwnerEntity findOwnerByName(String name); 
	public OwnerEntity addOwner(OwnerEntity owner); 
}
