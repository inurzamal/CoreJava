package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		String s = null;

		StringBuilder sb = new StringBuilder();

		FileReader fr = new FileReader("UNLOCK-ACC-EMAIL-BODY-TEMPLATE.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine(); // reading first line data

		while (line != null) {
			sb.append(line); // appending line data to buffer obj
			line = br.readLine(); // reading next line data
		}
		br.close();
		s = sb.toString();
		
		s = s.replace("{FNAME}", "Nur");
		s = s.replace("{LNAME}", "Zaman");

		System.out.println(s);

	}

}
