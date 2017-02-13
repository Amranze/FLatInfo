package flatinfo.core.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import flatinfo.core.models.entities.flat.ContactInfo;
import flatinfo.core.models.entities.flat.FlatEntity;

public interface FlatRepository extends MongoRepository<FlatEntity, String>{
	public List<FlatEntity> findAllFlats(); 
	public FlatEntity findFlat(Long id); 
	public FlatEntity findFlatByAddress(String address);
	public List<FlatEntity> findFlatByDbObject(ContactInfo flatInfo);
	public FlatEntity addFlat(FlatEntity flat); 
}
