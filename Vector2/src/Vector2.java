import javax.management.ValueExp;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Collections;
import java.util.HashMap;
import java.util.Vector;

public class Vector2 {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("file.txt","rw");
            Vector v1 = new Vector();
            while (raf.getFilePointer()<raf.length()){
                //System.out.println(raf.getFilePointer());
                v1.add(raf.readLine());
            }
            //System.out.println(raf.getFilePointer());
            //System.out.println(raf.length());
            HashMap<Object,Integer> map = new HashMap<Object,Integer>();
            int pos = 0;
            for(int i=0;i<v1.size();i++){
                map.put(v1.get(i),pos);
                pos+=10;
            }
            Collections.sort(v1);
            for(int i=0;i<v1.size();i++){
                System.out.print(v1.get(i)+" ");
                System.out.print(map.get(v1.get(i)));
                System.out.println();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
