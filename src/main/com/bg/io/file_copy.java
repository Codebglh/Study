package com.bg.io;

import org.junit.Test;

import java.io.*;

public class file_copy {
	@Test
	public void m1() {
		String path = "src/main/resources/k.png";
		File file = new File(path);
		FileInputStream stream = null;
		FileOutputStream stream1 = null;
		int len;
		try {
			stream1 = new FileOutputStream("src/main/resources/k1.png");
			
			stream = new FileInputStream(file);
			while ((len = stream.read()) != -1) {
				stream1.write((char) len);//输出流
				
				
				System.out.println((char) len);
			}
		} catch (FileNotFoundException e) {
			System.out.println("read error: " + e.getMessage());
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			if (stream != null) {
				try {
					stream.close();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			if (stream1 != null) {
				try {
					stream1.close();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
	}
	
	@Test
	public void m2() {
		String path = "src/main/resources/k.png";
		File file = new File(path);
		FileInputStream stream = null;
		FileOutputStream stream1 = null;
		byte[] len = new byte[1024];//加快速度
		int a;
		
		try {
			stream1 = new FileOutputStream("src/main/resources/k12.png");
			
			stream = new FileInputStream(file);
			while ((a = stream.read(len)) != -1) {
				stream1.write(len, 0, a);//输出流
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if (stream != null) {
					stream.close();
				}
				if (stream1 != null) {
					stream1.close();
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			
		}
	}
	
	/*
	 * 下面是包装类的字符流的复制
	 *
	 *
	 *
	 * */
	@Test
	public void m3() {
		String path = "src/main/resources/hello.txt";
		String path1 = "src/main/resources/hell.txt";
		String a;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try {
			reader = new BufferedReader(new FileReader(path));
			writer = new BufferedWriter(new FileWriter(path1));
			while ((a = reader.readLine()) != null) {
				writer.write(a);
				writer.newLine();
				writer.flush();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
	
	@Test
	public void m4() {
		String path = "src/main/resources/k.png";
		String path1 = "src/main/resources/21.png";
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		byte[] len = new byte[1024];//加快速
		int a;
		
		
		try {
			in = new BufferedInputStream(new FileInputStream(path));
			out = new BufferedOutputStream(new FileOutputStream(path1));
//			while (in.available() > 0) {
//				out.write(in.read());
//				out.flush();
//
//			}
			while ((a = in.read(len)) != -1) {
				System.out.print(new String(len, 0, a));
				
				out.write(len, 0, a);
				out.flush();
			}
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			
		}
	}
}