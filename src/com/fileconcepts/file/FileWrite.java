package com.fileconcepts.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	public static void main(String[] args) throws IOException {
		
		//location
		//content
		String location="filewriter.txt";
		String content="learning java";
		
		FileWriter filewriter=new FileWriter(location);
		
		filewriter.write(content);
		filewriter.close();
		
		
		
		
	}

}
