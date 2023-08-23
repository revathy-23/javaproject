package com.fileconcepts.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static <bytes> void main(String[] args) throws IOException {
		
		String location="fileoutputstream.xls";
		String content="learning java,selenium and cucmber";
		
		FileOutputStream stream=new FileOutputStream(location);
		byte[] write=content.getBytes();
		
		
		stream.write(write);
		
		stream.close();
	}

}
