package flatinfo.core.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import flatinfo.core.models.entities.flat.FlatEntity;
import flatinfo.core.services.util.FlatEntityList;

public interface FlatRepository extends PagingAndSortingRepository<FlatEntity, String>{
	public FlatEntityList findAllFlats(); 
	public FlatEntity findFlat(Long id); 
	public FlatEntity findFlatByAddress(String address); 
	public FlatEntity addFlat(FlatEntity flat); 
}
