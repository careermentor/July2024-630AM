package firstPkg;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;


public class FileHandling
{
	
	public static void readprop() throws Exception
	{
		
		FileReader fr = new FileReader("./Data/data.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		
		System.out.println(prop.get("automation"));
		System.out.println(prop.get("browser"));
		System.out.println(prop.get("url"));
		
	}

	public static void writedata() throws Exception
	{
		File f = new File("./Data/xyz.txt");
		FileWriter fw = new FileWriter(f,true);
		
		fw.write("\nThis is forth line of the data");
		fw.flush();
		fw.close();
	}
	
	public static void readdata() throws Exception
	{
		
		File f = new File("C:\\Users\\Santosh\\Desktop\\abc.txt");
		
		FileReader fr = new FileReader(f);
		
		int r = fr.read();  //84
		
		while(r!=-1)  //84!=-1, 104
		{
			System.out.print((char)r);  //Th
			r=fr.read();
		}
		
				
	}
	
	
	public static void main(String[] args) throws Exception {
		
		FileHandling.readprop();
	}
}
