
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Collections;
import java.util.Vector;

public class CityRandomAccessFile {
    public static void main(String[] args) {
            try {
                //"city_ascii" : 150 bytes
                //latitude : double = 8 bytes
                //longitude : double = 8 bytes
                //country : 50 bytes
                //ISO2 : 2 bytes
                //ISO3 : 3 bytes
                //admin_name : 150 bytes
                //capital : 10 bytes
                //population : int = 4 bytes
                //id : ???
                // 150+8+8+50+2+3+150+10+4 = 385
                // population is at 381th bytes from the beginning of the record.
                RandomAccessFile fPointer = new RandomAccessFile("city.dat","rw");
                byte[] x = new byte[150];
                //fPointer.read(x);
                fPointer.read(x,0,150);
                System.out.println(new String(x));
                fPointer.seek(381);
                System.out.println(fPointer.readInt());
                boolean notFound = true;
                int record =0;
                while (notFound){
                    fPointer.seek(record*385);
                    fPointer.read(x, 0,150);
                    //System.out.println(new String(x));
                    String city = new String(x);
                    city = city.trim();
                    if(city.equalsIgnoreCase("Hanawa")){
                        System.out.println("Hanawa is at the record number"+record+".");
                        fPointer.seek(record*385+381);
                        System.out.println("The population of Hanawa is"+fPointer.readInt()+".");
                        notFound = false;
                    }
                    record++;
                }

                record = 0;
                Vector cityList = new Vector();
                while(record*385 <= fPointer.length()){
                    fPointer.seek(record*385);
                    fPointer.read(x, 0,150);
                    //System.out.println(new String(x));
                    String city = new String(x);
                    city = city.trim();
                    cityList.add(city);
                    record++;
                }
                for(int i=0;i<10;i++){ //testing the vector cityList
                    System.out.print(cityList.get(i)+" ");
                }
                System.out.println();
                Collections.sort(cityList);
                for(int i=0;i<10;i++){
                    System.out.println(cityList.get(i)+" ");
                }
                //to find two identical city name
                int count=0;
                for(int i=0;i<cityList.size()-1;i++){
                    if(cityList.get(i).equals(cityList.get(i+1))){
                        System.out.println(cityList.get(i)+" = "+cityList.get(i+1));
                        count++;
                    }
                }
                System.out.println(count);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }

}
