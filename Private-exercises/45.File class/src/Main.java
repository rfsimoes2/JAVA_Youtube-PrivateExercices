import java.io.File;

public class Main {
    public static void main(String[] args) {

        //file = An abstract representation of a file and directory pathnames


        File file = new File("C:\\Users\\rfsim\\OneDrive\\Ambiente de Trabalho\\Novo Documento de Texto.txt");

        if(file.exists()){
            System.out.println("File exists!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getName());
            System.out.println("Is this a file? "+ file.isFile());
            System.out.println("Is this a folder? "+ file.isDirectory());
        } else{
            System.out.println("File does not exist!");
        }
    }
}