package serializationtest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.alibaba.fastjson.JSONObject;

public class JSONSer {
	
	public static void main(String[] args) throws IOException {
		People p = new People(1,"owen",0.1);
		System.out.println(JSONObject.toJSON(p));
		FileOutputStream out = new FileOutputStream(new File("json.txt"));
		out.write(JSONObject.toJSONBytes(p));
	}
}
