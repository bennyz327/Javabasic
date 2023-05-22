package threadDemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {

	public static void main(String[] args) {
		try {
			URL url01=new URL("https://i.imgur.com/ikjDo4b_d.webp");
			InputStream openStream01 = url01.openStream();
			BufferedInputStream bis01=new BufferedInputStream(openStream01);
			FileOutputStream fw=new FileOutputStream("D:\\java\\git\\Javabasic\\testFolder\\download.webp");
			BufferedOutputStream bos01=new BufferedOutputStream(fw);
			int data;
			while((data=bis01.read())!=-1) {
				bos01.write(data);
			}
			//output才有需要flush
			bos01.flush();
			bos01.close();
			fw.close();
			openStream01.close();
			System.out.println("OK");
			
		}catch(MalformedURLException e) {
			
		}catch(IOException e){
			
		}

	}
}
