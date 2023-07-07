import java.io.FileReader;

public class filereader {
    public static void main(String[] args) throws Exception {
        FileReader r=new FileReader("input.txt");
        int i;
        while((i=r.read()) !=-1){
            System.out.print((char)i);
        }

    }

}