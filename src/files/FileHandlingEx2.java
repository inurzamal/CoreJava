package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingEx2 {

	public static void main(String[] args) throws IOException {

		File f1 = new File("abc.txt");
		
		FileReader fr = new FileReader(f1);		
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		
		StringBuilder sb = new StringBuilder(); 
		
		while (line != null) {
			sb.append(line);
			line = br.readLine();		
		}
		br.close();
		
		System.out.println(sb);	
		
		//String s = sb.toString();
	}
}
