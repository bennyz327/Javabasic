package fileDemo;

import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) {
		
		try(FileReader fr=new FileReader("D://java/git/Javabasic/testFolder/a.txt")) {
			int data;
			while((data=fr.read())!=-1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
