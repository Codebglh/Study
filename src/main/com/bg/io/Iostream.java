package com.bg.io;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Iostream {
	/*
	 * 字节流（无损操作）二进制文件，字符流（按字符）文本文件
	 *
	 * 输入流   InputStream     Reader
	 *
	 * 输出流   OutputStream    Writer
	 *
	 */
	@Test
	public void m1() {
		String file = "src/main/resources/s.txt";
//		File file = new File("src/main/resources/s.txt");//创建一个文件
//		try {
//			file.createNewFile();
//		} catch (IOException e) {
//			System.out.println("failed created");
//		}
		FileInputStream stream = null;
		try {
			stream = new FileInputStream(file);
			int reader;
			while ((reader = stream.read()) != -1) {//当没有下一个数据时返回-1故用while循环
				System.out.print((char) reader);
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("connection failed");
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if (stream != null) {
					stream.close();//关闭输入流
				}
				System.out.println("关闭输入流");
			} catch (IOException e) {
				System.out.print("关闭失败");
			}
		}
		
		
	}
	
	@Test
	public void m2() {
		String file = "src/main/resources/s.txt";
//		File file = new File("src/main/resources/s.txt");//创建一个文件
//		try {
//			file.createNewFile();
//		} catch (IOException e) {
//			System.out.println("failed created");
//		}
		byte[] reader = new byte[8];//定义一个字节数组加快读取速度
		int a;
		FileInputStream stream = null;
		try {
			stream = new FileInputStream(file);
			
			while ((a = stream.read(reader)) != -1) {//当没有下一个数据时返回-1故用while循环
				System.out.print(new String(reader, 0, a));
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("connection failed");
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if (stream != null) {
					stream.close();//关闭输入流
				}
				System.out.println("关闭输入流");
			} catch (IOException e) {
				System.out.print("关闭失败");
			}
		}
		
		
	}
	@Test
	public void m3() {
		String file = "src/main/resources/s.txt";
		FileOutputStream stream;
		int written;
		try {
			//创建是覆盖原来的内容在后面加一个true就不会覆盖
			stream = new FileOutputStream(file,true);//输出流
			stream.write('k');//可以写一个字符
			stream.write(file.getBytes());//写入字符串
		} catch (FileNotFoundException e) {
			System.out.println("输出失败");
		} catch (IOException e) {
			System.out.println("输出失败");
		}
	}
}
