package test.applications;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestApp {
	private static Logger logger = LoggerFactory.getLogger(TestApp.class);
	private static final String IMAGEFOLDER = "\\src\\main\\webapp\\resources\\img";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String 		splitedAddress = " France";
		System.out.println(splitedAddress.substring(1));
		String rootPath = System.getProperty("user.dir");
		File dir = new File(rootPath + File.separator + IMAGEFOLDER + File.separator + 
				"user" + File.separator + "picture");
		logger.debug(dir.getPath());
		logger.debug(dir.getAbsolutePath());

	}

}
