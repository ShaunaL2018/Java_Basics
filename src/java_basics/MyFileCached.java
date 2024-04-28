package java_basics;

import java.io.File;

public class MyFileCached {

	private static MyFileCached instance = null;
	private File myFile = null;
	
	private MyFileCached() {
		
		setMyFile();
		
	}
	
	public static MyFileCached getInstance() {
		if (instance == null) {
			instance = new MyFileCached();
		}
		
		return instance;
	}
	
	
	private void setMyFile() {
		
		myFile = new File("MyFile.txt");
		
	}
	
	public File getMyFile() {
		return myFile;
	}
}
