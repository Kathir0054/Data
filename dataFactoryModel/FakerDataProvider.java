package dataFactoryModel;

import java.util.HashMap;
import java.util.Map;

import com.github.javafaker.Faker;

public class FakerDataProvider implements TestDataProvider {

	@Override
	public Map<String, String> getData() {
		// TODO Auto-generated method stub

        Faker faker=new Faker();
		Map<String,String>data=new HashMap<>();
		data.put("name", faker.name().fullName());
		data.put("password", faker.internet().password());
		
		return data;
	}
	
	

}

