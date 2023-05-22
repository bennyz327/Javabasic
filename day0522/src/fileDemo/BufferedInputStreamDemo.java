package fileDemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {

	public static void main(String[] args) {

		try(FileInputStream fis=new FileInputStream("D://java/git/Javabasic/testFolder/buffered.txt")) {
			//讀取進來之後建立一個buffer物件取代他，就可以直接進行BufferedStream，減少串流開關的次數
			BufferedInputStream bis=new BufferedInputStream(fis);
			int size=fis.available();
			int data;
			byte[] datas=new byte[size];
			int index=0;
			//把資料放入byte陣列
			while((data=bis.read())!=-1){
				datas[index]=(byte)data;
				index++;
			}
			String str=new String(datas,"MS950");
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
			

	}

}
