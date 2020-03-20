package com.chufan.tools;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class ParseJSON {

	public static void main(String[] args) {
		ParseJSON p = new ParseJSON();
		p.GetFileInfo("C:\\Users\\Tony\\AppData\\Roaming\\Leanote\\nedb55\\5e63c307b9c7e4504d000004\\notebooks.db");
	}

	/**
	 * 
	 */
	public  void GetFileInfo(String path) {
		if (path==null)return;
		File f = new File(path);
//		File f = new File("C:\\Users\\Tony\\AppData\\Roaming\\Leanote\\nedb55\\5e63c307b9c7e4504d000004\\cn.txt");
		try {
//			FileReader fr =  new FileReader(f);
			InputStreamReader isr = new InputStreamReader(new FileInputStream(f), "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String s = null;
			JSONObject obj;
			int idx = 0;
			while((s=br.readLine())!=null) {
//				System.out.println(s);
				obj = JSON.parseObject(s);
				if (idx++==0) {
					for (Iterator<String> iterator = obj.keySet().iterator(); iterator.hasNext();) {
						String type = (String) iterator.next();
						System.out.print(type + " ");
					}
					System.out.println();
				}
				String title = (String)obj.get("Title");
				
				System.out.println(new String(title));
			}
			br.close();
			isr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("key1", "One");
		map.put("key2", "Two");
		String mapJson = JSON.toJSONString(map);
		System.out.println(mapJson);
	}
	
	

}
