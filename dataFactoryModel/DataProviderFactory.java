package dataFactoryModel;

public class DataProviderFactory {
	
	public static TestDataProvider getProvider(DataSource dataSource, String filepath) {
		switch(dataSource) {
		case EXCEL:
			return new ExcelDataProvider(filepath);
		case FAKER:
			return new FakerDataProvider();
		case HARDCODED:
			return new HardcodedDataProvider();
			default :
				throw new IllegalArgumentException("Invalid Data Source");
			
			
		}
	}

}
