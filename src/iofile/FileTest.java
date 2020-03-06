package iofile;

import java.io.File;

public class FileTest {
	
	public void run()
	{
		File baseDir=new File(".");     //whole dir from root
		if(!baseDir.exists())    //Does it exists?
		{
			baseDir.mkdirs(); //If not create the directory
		}
		listDir(baseDir);
	}
	
	public void listDir(File dirFile) {
		if(!dirFile.isDirectory())
			return;    //REject non-directory
		System.out.println("Dir:"+ dirFile.getAbsolutePath());
		//Handle data files
		for(File file: dirFile.listFiles())
		{
			if(file.isDirectory()) continue;    //Skip Directories
			String fTxt=String.format("%1$32s %2$10d", file.getName(),file.length());
			System.out.println(fTxt);
		}
		
		//Handle data files
		for(File file: dirFile.listFiles())
		{
			if(file.isDirectory()) continue;    //Skip data files-keep directories
				listDir(file); // Recursive call the list the folder
		}
	}

	public static void main(String[] args)
	{
		FileTest fileTest=new FileTest();
		fileTest.run();
	}
}
