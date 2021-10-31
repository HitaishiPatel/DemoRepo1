package data;

import utilities.Xls_Reader;

public class DataFile {

		Xls_Reader d = new Xls_Reader("C:\\WeTransfer\\NikulTest.xlsx");
		public String wrongEmail = d.getCellData("Data1", "UserName", 3);
		public String wrongPassword = d.getCellData("Data1", "Password", 2);
		public String emailWithSpecialChar = d.getCellData("Data1","UserName", 4);
		public String globalErr = d.getCellData("Data1", "Global Error", 2);
		public String specialChrErr = d.getCellData("Data1", "Email Error", 5);
		public String EmptyEmailErr = d.getCellData("Data1","Email Error" , 4);
		public String emptyPasswordError = d.getCellData("Data1", "Password Error", 3);
		

}
