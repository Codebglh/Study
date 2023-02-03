package com.bg.io;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

public class file_Writer {
	@Test
	public void m1() {
		String path = "src/main/resources/s.txt";
		FileWriter writer = null;
		char[] chars = {'s', 's', 's'};
		try {
			writer = new FileWriter(path);
			writer.write("hello");
			writer.write('s');
			writer.write(chars);
			writer.write(chars, 0, 1);
			writer.write(path, 0, 5);
			writer.flush();//将文件写入
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if (writer != null) {
					writer.close();//不关闭就不会写入文件
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
	

