package com.ltx.springboot_provider;

import com.github.tobato.fastdfs.FdfsClientConfig;
import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import java.io.File;
import java.io.FileInputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(FdfsClientConfig.class)
public class SpringbootProviderApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Autowired
	private FastFileStorageClient fastFileStorageClient;

	@Test
	public void upload() throws  Exception{
		File file = new File("F://1.jpg");
		String filename = file.getName();
		String extName = filename.substring(filename.lastIndexOf(".")+1);
		FileInputStream fileInputStream = new FileInputStream(file);
		StorePath storepath = fastFileStorageClient.uploadFile(fileInputStream,file.length(),extName,null);
		System.out.println(storepath.getFullPath());
	}
}
