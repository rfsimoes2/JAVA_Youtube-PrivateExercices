import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // FileReader = read the contents of a file as a string os characters. One by one
        //              read() returns a int value which contains the bit value
        //              when read() returns -1 there is no more data to be read


        try {
            FileReader fr = new FileReader("C:\\Users\\rfsim\\OneDrive\\Ambiente de Trabalho\\art.txt");

            int data = fr.read();

            while (data !=-1){
//                System.out.println(data);
//                System.out.println(fr.read());
                System.out.print((char)data);
                data = fr.read();
            }
 //           System.out.println(data);
 //           System.out.println(fr.read());
            fr.close();
        }

        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println();
        }
    }
}