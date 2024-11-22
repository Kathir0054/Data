package dataFactoryModel;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelDataProvider implements TestDataProvider {

	
	public String filepath;
	public ExcelDataProvider(String filepath) {
		this.filepath=filepath;
	
	}
	@Override
	public Map<String, String> getData() {
		// TODO Auto-generated method stub
		Map<String,String>data= new HashMap<>();
		try(Workbook workbook =WorkbookFactory.create(new FileInputStream(filepath))){
			Sheet sheet= workbook.getSheetAt(0);
			Row headerRow =sheet.getRow(0);
			Row dataRow =sheet.getRow(1);
			for (int i=0; i<headerRow.getLastCellNum();i++) {
				String header=headerRow.getCell(i).getStringCellValue();
				String value = dataRow.getCell(i).getStringCellValue();
				data.put(header, value);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}

}

