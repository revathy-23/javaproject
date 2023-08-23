package com.fileconcepts.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedFileWrite {
	public static void main(String[] args) throws IOException {
		
		String location="bufferedfilewriter.doc";
		String content="learning java is very easy and simple";
		
		FileWriter filewriter=new FileWriter(location);
		
		BufferedWriter buffer=new BufferedWriter(filewriter);
		
		buffer.write(content);
		buffer.close();
		
	}

}
