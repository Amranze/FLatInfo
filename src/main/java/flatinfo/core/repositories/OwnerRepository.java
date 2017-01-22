package flatinfo.core.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import flatinfo.core.models.entities.owner.OwnerEntity;

public interface OwnerRepository extends MongoRepository<OwnerEntity, String>{
	public List<OwnerEntity> findAllOwners(); 
	public OwnerEntity findOwner(Long id); 
	public OwnerEntity findOwnerByName(String name); 
	public OwnerEntity addOwner(OwnerEntity owner); 
}
