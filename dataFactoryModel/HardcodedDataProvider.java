package dataFactoryModel;

import java.util.HashMap;
import java.util.Map;

public class HardcodedDataProvider implements TestDataProvider {

	@Override
	public Map<String, String> getData() {
		// TODO Auto-generated method stub
		Map<String, String>data=new HashMap<>();
		data.put("username", "testuser");
		data.put("password", "admin");
		return data;
	}

}
