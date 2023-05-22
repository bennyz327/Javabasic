package fileDemo;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		
//練習存取文字檔案
		//用TryCatch包裹
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("D://java/git/Javabasic/testFolder/a.txt");
			//透過available()找出文字檔案大小
			int size=fis.available();
			int data;
			byte[] datas=new byte[size];
			int index=0;
			//把資料放入byte陣列
			while((data=fis.read())!=-1){
				datas[index]=(byte)data;
				index++;
			}
			String str=new String(datas,"MS950");	//微軟950編碼頁，是BIG-5的擴充(中英)	//MS932(日文)
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//用TryCatch包裹
			try {
				//關閉stream
				if(fis!=null) {fis.close();}
				System.out.println("連線已關閉");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
