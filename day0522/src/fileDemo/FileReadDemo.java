package fileDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) {
		
		try(FileReader fr=new FileReader("D://java/git/Javabasic/testFolder/a.txt")) {
			BufferedReader br=new BufferedReader(fr);
			String data;
			//readLine，回傳包含換行符號的字串，或是null
			while((data=br.readLine())!=null) {
				System.out.print(data);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
