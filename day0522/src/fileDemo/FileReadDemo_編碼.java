package fileDemo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadDemo_編碼 {

	public static void main(String[] args) {
		
		try(FileInputStream fi=new FileInputStream("D://java/git/Javabasic/testFolder/a.txt")) {
			//先給InputStreamReader用正確的編碼開啟，再指派給BufferedReader
			InputStreamReader ist=new InputStreamReader(fi,"MS950");
			BufferedReader br=new BufferedReader(ist);
			String data;
			while((data=br.readLine())!=null) {
				System.out.print(data);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*編碼改寫
		 * File input stream	fis
		 * Input stream reader	isr
		 * Buffer reader		br
		 * 		fis>isr(指定編碼)>br
		 * File output stream	fos
		 * Output stream writer	osw
		 * Buffer writer		bw
		 * 		fos>osw(指定編碼)>bw
		 * */		

	}

}
