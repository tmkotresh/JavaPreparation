package IO;

import java.io.*;
import java.util.Scanner;

public class TestFileOperations {
	
	static void writeToFile(){
		String str = "Test";
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Kotresh\\J2EE\\Practice\\IOPractice\\testTwo.txt"));
			bw.write(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args){
		writeToFile();
		FileInputStream inputStream = null;
		Scanner sc = null;
		File folder = new File("D:\\Kotresh\\J2EE\\Practice\\IOPractice");
		File[] files = folder.listFiles();
	
		System.out.println(files.length);
		for(File f : files){
			if(f.isDirectory()){
				System.out.println(f.getName());
				try {
					String str = "Hello";
				    FileOutputStream outputStream = new FileOutputStream(f.getName());
				    byte[] strToBytes = str.getBytes();
				    outputStream.write(strToBytes);
				 
				    outputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
					e.printStackTrace();
				}
			}else{
				System.out.println(f.getName());
				try {
					inputStream = new FileInputStream(f.getAbsolutePath());
					sc = new Scanner(inputStream,"UTF-8");
					while(sc.hasNextLine()){
						System.out.println(sc.nextLine());
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println(e);
				}
			}
			
		}
		
	}

}
