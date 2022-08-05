import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Collections;
import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("file.txt","rw");
            Vector v1 = new Vector();
            String n;
            while((n = raf.readLine()) != null){ //read all line
                v1.add(n);
            }
            Collections.sort(v1);

            for(int i=0;i<v1.size(); i++){
                System.out.println(v1.get(i));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
