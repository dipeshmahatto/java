import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ShowFile {
    public static void main(String[] args)throws IOException {
        File directoryPath = new File("D:\\java");
        File filesList[] = directoryPath.listFiles();
        Scanner sc = null;
        for(File file : filesList){
            System.out.println("File name: "+file.getName());
            System.out.println("File path: "+file.getAbsolutePath());
            System.out.println("Size : "+ file.getTotalSpace());
        }
    }
}
