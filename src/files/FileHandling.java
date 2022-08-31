package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws IOException {

		File f1 = new File("abc.txt");  // create a file in class path
		FileWriter fw = new FileWriter(f1);  // File Writer	
		
		fw.write("Hi Folks..");  // Writing into File
		fw.close();
		
		
		Scanner sc = new Scanner(f1);
		
		StringBuilder sb = new StringBuilder(); 
		
		while (sc.hasNextLine()) {
			sb.append(sc.nextLine());
		}
		System.out.println(sb);
		
		sc.close();
	}
}
