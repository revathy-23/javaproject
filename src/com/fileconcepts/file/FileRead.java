package com.fileconcepts.file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args) throws IOException {
		
		String location="filewriter.txt";
		
		FileReader file=new FileReader(location);
		
		BufferedReader reader=new BufferedReader(file);
		
		String currentLine=reader.readLine();
		
		System.out.println(currentLine);
		
         // while(currentLine=reader.readLine()==null){
        //	  System.out.println(currentLine);
	
		}

		
		
		
		
		
		
	}


