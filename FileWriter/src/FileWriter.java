import java.io.*;

public class FileWriter {
    public static void main(String[] args) {

        try {
            FileReader f = new FileReader("file.txt");
            BufferedReader fin = new BufferedReader(f);
            System.out.println(fin.readLine());
            fin.close();

            FileWriter writer = new FileWriter("C:\\Users\\keval\\Desktop\\code\\CSC209\\file.txt");
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write("Welcome to javaTpoint.");
            buffer.close();
            System.out.println("Success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
