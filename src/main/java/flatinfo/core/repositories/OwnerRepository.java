package flatinfo.core.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import flatinfo.core.models.entities.owner.OwnerEntity;
import flatinfo.core.services.util.OwnerEntityList;

public interface OwnerRepository extends PagingAndSortingRepository<OwnerEntity, String>{
	public OwnerEntityList findAllOwners(); 
	public OwnerEntity findOwner(Long id); 
	public OwnerEntity findOwnerByName(String name); 
	public OwnerEntity addOwner(OwnerEntity owner); 
}
