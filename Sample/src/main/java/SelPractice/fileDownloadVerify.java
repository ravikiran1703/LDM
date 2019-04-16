package SelPractice;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import org.testng.annotations.Test;
@Test
public class fileDownloadVerify {
public void  VerifyDownload() {
	
	File file = new File("C:\\Users\\muthuravie\\Downloads\\Sample Check-In");
	
	System.out.println("Name: " + file.getName());
	System.out.println("Absolute path: " + file.getAbsolutePath());
	System.out.println("Size: " + file.length());
	System.out.println("Last modified: " + new Date(file.lastModified()));
}
}

