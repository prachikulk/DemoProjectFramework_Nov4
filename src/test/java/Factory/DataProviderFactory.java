package Factory;

import java.io.IOException;

import DataProvider.ConfigDataProvider;
import DataProvider.ExcelDataProvider;

public class DataProviderFactory {

	public static ConfigDataProvider getConfig(){
		ConfigDataProvider config=new ConfigDataProvider();
		return config;
	}
	
	public static ExcelDataProvider getExcel() throws IOException{
		ExcelDataProvider excel=new ExcelDataProvider();
		return excel;
	}
}
