import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import flatinfo.core.repositories.UserRepository;
import flatinfo.core.services.util.UserEntityList;
import flatinfo.rest.exceptions.UserProblemException;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"file:src/main/webapp/WEB-INF/application-context.xml" })
//@ContextConfiguration("classpath:application-context.xml")
public class UserRepositoryTests {
	
	private Logger logger = LoggerFactory.getLogger(UserRepositoryTests.class);

	/*@Autowired
	UserRepository userRepo;
	
	@Test
    public void readsFirstPageCorrectly() {

      UserEntityList users = userRepo.findAllUsers();
      if(users == null)
    	  throw new UserProblemException("There is no users");
      for(int i=0;i<users.getUsers().size();i++)
    	  logger.debug("User "+i+" : "+users.getUsers().get(i).toString());
    }*/
	
	//@Test
	public void test(){
		logger.debug("Just to stop the error");
	}
}
