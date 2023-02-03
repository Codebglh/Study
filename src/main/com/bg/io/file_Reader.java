package com.bg.io;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class file_Reader {
	@Test
	public void m1() {
		String path = "src/main/resources/hello.txt";
		FileReader reader = null;
		int chars;
		try {
			reader = new FileReader(path);
			while ((chars = reader.read()) != -1) {
				System.out.print((char)chars);
			}
			
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Test
	public void m2() {
		String path = "src/main/resources/hello.txt";
		FileReader reader = null;
		int chars = 0;
		char[] data = new char[1024];
		try {
			reader = new FileReader(path);
			while ((chars = reader.read(data)) != -1) {
				System.out.print(new String(data,0,chars));
			}
			
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
