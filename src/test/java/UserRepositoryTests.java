import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import flatinfo.core.models.entities.user.UserEntity;
import flatinfo.core.repositories.UserRepository;
import flatinfo.core.repositories.impl.UserRepositoryImpl;
import flatinfo.core.services.UserEntityService;
import flatinfo.core.services.impl.UserEntityServiceImpl;
import flatinfo.core.services.util.UserEntityList;
import flatinfo.rest.exceptions.UserProblemException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/application-context.xml" })
//@ContextConfiguration("classpath:application-context.xml")
public class UserRepositoryTests {
	
	private Logger logger = LoggerFactory.getLogger(UserRepositoryTests.class);

	@Autowired
	private UserEntityService userRepo;
	
	@Autowired
	private UserRepositoryImpl userRepo1;
	
	UserEntity user1;

	/*@Before
	public void setUp() {

		userRepo.deleteAll();

		user1 = userRepo.save(new UserEntity(
				1L,
				"firstName",
				"lastName",
				"mail",
				"username",
				"password",
				new Date(),
				23,
				"gender",
				"phone",
				"adresse",
				15487,
				"city",
				"country",
				1L,true,null,null,"",null,null
				));
	}*/
	
	/*
	@Test
    public void readsFirstPageCorrectly() {

      UserEntityList users = userRepo.findAllUsers();
      if(users == null)
    	  throw new UserProblemException("There is no users");
      for(int i=0;i<users.getUsers().size();i++)
    	  logger.debug("User "+i+" : "+users.getUsers().get(i).toString());
    }*/
	
	@Test
	public void test(){
		/*user1 = userRepo.addUser(new UserEntity(
				1L,
				"firstName",
				"lastName",
				"mail",
				"username",
				"password",
				new Date(),
				23,
				"gender",
				"phone",
				"adresse",
				15487,
				"city",
				"country",
				1L,true,null,null,"",null,null
				));
		if(user1 == null){
			logger.debug("Null");
		}*/
		
		logger.debug("Just to stop the error");
		logger.debug("User "+ userRepo1.findAll());
		//logger.debug("User "+ userRepo.findAllUsers());
	}
}
