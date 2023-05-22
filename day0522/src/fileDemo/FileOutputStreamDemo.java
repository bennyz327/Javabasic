package fileDemo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {

		try (FileOutputStream fos=new FileOutputStream("D://java/git/Javabasic/testFolder/fos.txt")){
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			String str="super apple";
			//利用byte陣列寫入
			byte[] bytes=str.getBytes();
			bos.write(bytes);
			bos.flush();	//把記憶體資料沖出
			System.out.println("寫入完畢");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
