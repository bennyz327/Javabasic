package fileDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		
		try(FileWriter fw=new FileWriter("D://java/git/Javabasic/testFolder/fw.txt")) {
			//比起OutputStream，writer可以直接放字串
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("寫入這串");
			bw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("寫入完成");
		}


	}

}
