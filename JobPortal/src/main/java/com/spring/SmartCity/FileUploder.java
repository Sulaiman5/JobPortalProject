package com.spring.SmartCity;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

public class FileUploder {

	
	
    public FileUploder() {
		super();
	}

	@Autowired 
	ServletContext servletContext;
    
	public void saveFile(MultipartFile file, String fileName, String path) throws IOException {
		byte[] bytes  = file.getBytes();
	
		String filePath = servletContext.getRealPath(path);
		File dir = new File(filePath);
		File serverFile = new File(dir.getAbsolutePath()
				+ File.separator + fileName);
		BufferedOutputStream stream = new BufferedOutputStream(
				new FileOutputStream(serverFile));
		stream.write(bytes);
		stream.close();
	}
	
	
}
