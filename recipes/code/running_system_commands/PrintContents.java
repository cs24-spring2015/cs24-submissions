import java.util.Scanner;
import java.io.File;

public class PrintContents{

	private static Scanner kb = new Scanner(System.in);

	public static void listDirectories(String d, int level){
		File file = new File(d);
		File[] files = file.listFiles();

		if(files != null){
			for(File f : files){
	        	for (int i = 0; i < level; i++) {
                	System.out.print("\t");
                	}
                	if (f.isDirectory()) {
                    	System.out.println("PARENT DIRECTORY: " + f.getName());
                    	listDirectories(f.getAbsolutePath(), level + 1);
                	} 
                	else {
                   		System.out.println(f.getName());
               	 	}
           		}
           	}
	}

	public static void main(String[] args) {

		System.out.print("Please type the directory you want to view the files of: ");
		String directory = kb.next();
		listDirectories(directory, 0);

	}
	
}