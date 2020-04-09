package com.zq.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieHandler;
import java.net.URI;
import java.util.List;
import java.util.Map;

public class StreamUtil {

	/*
	* 方法1：批量关闭流，参数能传入无限个。(10分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭，并且参数个数不限。
	*/
	public static void closeAll(InputStream file){
	//TODO 实现代码
		BufferedInputStream bis = null;
		try {
			 bis = new BufferedInputStream(file);

		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				bis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(10分)，要求方法内部调用上面第1个方法关闭流(5分)
	*/
	public static String readTextFile(InputStream src) throws IOException{
	byte[] b = null;
		//TODO 实现代码
		int read = src.read(b);
		return "";
				
	}
	/*
	* 方法3：传入文本文件对象，返回该文件内容(10分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	*/
	public static String readTextFile(File txtFile){
	//TODO 实现代码
		CookieHandler s = new CookieHandler() {
			
			@Override
			public void put(URI uri, Map<String, List<String>> responseHeaders) throws IOException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Map<String, List<String>> get(URI uri, Map<String, List<String>> requestHeaders) throws IOException {
				// TODO Auto-generated method stub
				return null;
			}
		};
		return "";
	}
}
