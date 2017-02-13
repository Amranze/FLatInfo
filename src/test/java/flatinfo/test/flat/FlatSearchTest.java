package flatinfo.test.flat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import flatinfo.core.models.entities.flat.ContactInfo;
import flatinfo.core.models.entities.flat.FlatAddress;
import flatinfo.core.models.entities.flat.FlatEntity;
import flatinfo.core.repositories.impl.FlatRepositoryImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/application-context.xml" })
public class FlatSearchTest {
	
	private Logger logger = LoggerFactory.getLogger(FlatSearchTest.class);
	private FlatEntity flat;
	private ContactInfo address = new ContactInfo();
	private List<FlatEntity> flats = new ArrayList<FlatEntity>();
	
	@Autowired
	private FlatRepositoryImpl flatRepo;
	
	@Before
	public void setUp() {
		//addFlats();
	}
	
	@Test
	public void searchFlat(){
		address.setAddress(new FlatAddress("Rue Riquet"));
		address.setCity("Paris");
		address.setCountry("France");
		flats = flatRepo.findFlatByDbObject(address);
		if(flats.isEmpty()) 			logger.debug("Is empty");
		for(FlatEntity flat : flats)
			logger.debug(flat.toString());
	}
	
	public void addFlats(){
		ContactInfo contactInfo = new ContactInfo(new FlatAddress("81", "Rue Riquet"), "Paris", "France");
		flat = new FlatEntity(1L,null, contactInfo, true, "Nothing", 751.0, 25.0, "", "", "", new ArrayList<>(), null, null, null);
		flatRepo.save(flat);
		
		contactInfo = new ContactInfo(new FlatAddress("1Bis", "Rue Riquet"), "Paris", "France");
		flat = new FlatEntity(2L,null, contactInfo, true, "Nothing", 751.0, 25.0, "", "", "", new ArrayList<>(), null, null, null);
		flatRepo.save(flat);
		
		contactInfo = new ContactInfo(new FlatAddress("10", "Avenue Abbesses"), "Paris", "France");
		flat = new FlatEntity(3L,null, contactInfo, true, "Nothing", 751.0, 25.0, "", "", "", new ArrayList<>(), null, null, null);
		flatRepo.save(flat);
		
		contactInfo = new ContactInfo(new FlatAddress("3B", "Rue Charles de gaulles"), "Paris", "France");
		flat = new FlatEntity(4L,null, contactInfo, true, "Nothing", 751.0, 25.0, "", "", "", new ArrayList<>(), null, null, null);
		flatRepo.save(flat);
	}
}
