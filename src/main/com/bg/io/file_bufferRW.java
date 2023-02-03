package com.bg.io;

import org.junit.Test;

import java.io.*;

public class file_bufferRW {
	@Test
	public void m1() {
		String path = "src/main/resources/hello.txt";
		BufferedReader s = null;
		String line;
		try {
			s = new BufferedReader(new FileReader(path));
			while ((line = s.readLine()) != null) {
				System.out.print(line);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				s.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
	
	@Test
	public void m2() {
		String path = "src/main/resources/hello1.txt";
		BufferedWriter s = null;
		String line;
		try {
			s = new BufferedWriter(new FileWriter(path));
			s.write("hello");
			s.newLine();//换行
			s.write("hello");
			s.flush();
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				s.close();
			} catch (IOException e) {
				System.out.println("关闭失败");
			}
		}
	}
	
	//	上面是字符流----------------------------------------------------------------
	@Test
	public void m3() {
		String path = "src/main/resources/k.png";
		BufferedInputStream s = null;
		byte[] reader = new byte[8];
		int len;
		try {
			s = new BufferedInputStream(new FileInputStream(path));
//			while ((len = s.read()) != -1) {
//				System.out.println((char) len);
//			}
			while ((len = s.read(reader)) != -1) {
				System.out.println(new String(reader, 0, len));
			}
//			while (s.available() > 0) {
//				System.out.println(s.read());
//
//			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if (s != null) {
					s.close();
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
	
	@Test
	public void m4() {
		String path = "src/main/resources/hell.txt";
		BufferedOutputStream s = null;
		
		try {
			s = new BufferedOutputStream(new FileOutputStream(path));
			s.write('h');
			s.flush();
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if (s != null) {
					s.close();
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
}

