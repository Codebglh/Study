package com.bg.io;

import org.junit.Test;

import java.io.File;

public class file_infromation {
	@Test
	public void info(){
		File file=new File("src/main/resources/hello.txt");//创建一个文件类
//		System.out.println(file.getName());//获取文件名
//		System.out.println(file.getParent());//获取父级目录
//		System.out.println(file.length());//获取文件大小
//		System.out.println(file.getAbsoluteFile());//获取据对路径
//		System.out.print(file.mkdir());//创建文件夹输入路径即可创建
		System.out.println(file.exists());//文件是否存在
		System.out.println(file.isFile());//是不是文件
		System.out.println(file.isDirectory());//是不是目录
	}
}
