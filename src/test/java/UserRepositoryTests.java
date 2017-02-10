import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import flatinfo.core.models.entities.user.UserEntity;
import flatinfo.core.repositories.impl.UserRepositoryImpl;
import flatinfo.core.services.UserEntityService;

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

	@Before
	public void setUp() {

		//userRepo1.deleteAll();

		/*user1 = userRepo1.save(new UserEntity(
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
				1L,true,null,null,null, "",null,null
				));*/
	}
	
	@Test
	public void test(){
		logger.debug("Just to stop the error");
		List<String> friends = new ArrayList<>();
		friends.add("Amrane");
		friends.add("Simona");
		friends.add("Zineb");
		friends.add("Amine");
		friends.add("MEMEME");
		friends.add("Hamada");
		user1 = new UserEntity(
				1L,
				"AMrane",
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
				1L,true,null,null,null,friends, "",null,null
				);
		userRepo1.findUserAndModify(user1);
		logger.debug(user1.toString());
		//userRepo.updateUser(user1);
		logger.debug("User "+ userRepo1.findAll());
	}
}
