
import java.io.File;

public class ListFiles {
    
    public static void main(String[] args) {
        
        // Directory path here
        String path = args[0];
        String type = args[1];
        
        String files;
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
        
        for (int i = 0; i < listOfFiles.length; i++)
        {
            
            if (listOfFiles[i].isFile())
            {
                files = listOfFiles[i].getName();
                if (files.endsWith(type))
                {
                    System.out.println(files);
                }
            }
        }
    }
}