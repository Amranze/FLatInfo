package flatinfo.core.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import flatinfo.core.models.entities.flat.FlatEntity;
import flatinfo.core.services.util.FlatEntityList;

public interface FlatRepository extends MongoRepository<FlatEntity, String>{
	public FlatEntityList findAllFlats(); 
	public FlatEntity findFlat(Long id); 
	public FlatEntity findFlatByAddress(String address); 
	public FlatEntity addFlat(FlatEntity flat); 
}
