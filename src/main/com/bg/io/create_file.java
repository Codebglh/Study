package com.bg.io;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class create_file {
	@Test
	//方法一
	public void create_1() {
		String path = "src/main/resources/hello.txt";
		File file = new File(path);//创建文件类
		try {
			file.createNewFile();//创建文件类
			System.out.print("文件创建成功");
		} catch (IOException e) {
			System.out.print("文件创建失败");
		}
	}
	
	//方法二
	@Test
	public void create_2() {
		String path = "src/main/resources";
		File file = new File(path,"hello1.txt");//创建文件类
		try {
			file.createNewFile();//创建文件类
			System.out.print("文件创建成功");
		} catch (IOException e) {
			System.out.print("文件创建失败");
		}
	}
	//方法二
	@Test
	public void create_3() {
		String path = "src/main/resources";
		File file = new File(path,"hello1.txt");//创建文件类
		try {
			file.createNewFile();//创建文件类
			System.out.print("文件创建成功");
		} catch (IOException e) {
			System.out.print("文件创建失败");
		}
	}
}
	
