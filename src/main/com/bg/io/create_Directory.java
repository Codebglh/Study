package com.bg.io;

import org.junit.Test;

import java.io.File;

public class create_Directory {
	@Test
	public void createDirectory(){
		String path = "src/main/resources/ss/s/s/a";
		File dir = new File(path);
		dir.mkdir();//创建文件夹
//		dir.delete();//文件删除
//		dir.mkdirs();//创建多级文件夹
	
	}
}
