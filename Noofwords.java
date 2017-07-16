package arun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Noofwords {
public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 int count=0;
	//String s1[] = new String [6];
	String s = br.readLine();
		String[]	s1=  s.split("\\s");
		for(String s3 : s1){
			//System.out.println(s3);
			count++;
			}
	System.out.println(count);
			
}
}
