package flatinfo.rest.mvc;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

public class PictureUploadController {

	private static final Logger logger = LoggerFactory.getLogger(PictureUploadController.class);
	private static final String IMAGEFOLDER = "\\src\\main\\webapp\\resources\\img";
	private static final String ROOTPATH = System.getProperty("user.dir");
	
	public String uploadFileHandler(String name, MultipartFile file) {
			try {
				byte[] bytes = file.getBytes();
				//String rootPath = System.getProperty("catalina.home");
				File dir = new File(ROOTPATH + File.separator + IMAGEFOLDER + File.separator + 
						"user" + File.separator + "picture");
				if (!dir.exists())
					dir.mkdirs();

				File serverFile = new File(dir.getAbsolutePath()
						+ File.separator + name+ "_" + file.getOriginalFilename());
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();

				logger.info("Server File Location="+ serverFile.getAbsolutePath());
				return name+ "_" + file.getOriginalFilename();
			} catch (Exception e) {
				return e.getMessage();
			}
	}

	/**
	 * Upload multiple file using Spring Controller
	 */
	boolean uploadMultipleFileHandler(String names, MultipartFile[] files) {
		for (int i = 0; i < files.length; i++) {
			MultipartFile file = files[i];
			String name = names+""+i;
			try {
				byte[] bytes = file.getBytes();
				File dir = new File(ROOTPATH + File.separator + "user" + File.separator + "picture");
				if (!dir.exists())
					dir.mkdirs();

				File serverFile = new File(dir.getAbsolutePath() + File.separator + name);
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();

				logger.info("Server File Location="+ serverFile.getAbsolutePath());
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}

}
