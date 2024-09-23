package Utils;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import utils.ReadExcel;

public class dataUtils {

	//data provider, indices, parallel, is name mandatory
	@DataProvider(name = "login", indices = {0,1}, parallel = true)
	public String[][] getData() throws IOException {
		String[][] excelData = ReadExcel.getExcelData();
//		String[][] data = new String[2][2];
//		
//		//row 1
//		data[0][0] = "jagadeesh76980@gmail.com";
//		data[0][1] = "Jagan@Code";
//		
//		//row 2
//		data[1][0] = "mmj76980@gmail.com";
//		data[1][1] = "jagan@code";
		
		return excelData;
		
	}
}
