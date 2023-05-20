package fileDemo;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		
//		//建立檔案
//		File file01=new File("C://Users//IOP_Mobile//Downloads//myfile.txt");
//		System.out.println(file01.exists());
//		//建立資料夾
//		File dir01=new File("C://testimage");
//		if(!dir01.exists())System.out.println(dir01.mkdir());
//		//確認父資料夾在創建檔案
//		File file02=new File("C://image/myfile.txt");
//		File file02Parent=file02.getParentFile();
//		file02Parent.mkdir();
//		try {
//			file02.createNewFile();
//		} catch (IOException e) {
//			System.out.println("IO錯誤");
//		}
		//更換目錄試試看
		File file03=new File("C://Users/IOP_Mobile/Downloads/myfile.txt");
		File file03Parent=file03.getParentFile();
		if(!file03Parent.exists())
		file03Parent.mkdir();
		try {
			file03.createNewFile();
		} catch (IOException e) {
			System.out.println("IO錯誤");
		}
		
		
	}

}
