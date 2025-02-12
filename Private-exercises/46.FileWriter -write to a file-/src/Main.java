import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("C:\\Users\\rfsim\\OneDrive\\Ambiente de Trabalho\\poem.txt");
            fw.write("Roses are red\nViolets are blue\nSugar is sweet\nAnd so are you.");
            fw.append("\n\nA poem by Sir Edmund Spense 1590");
            fw.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}