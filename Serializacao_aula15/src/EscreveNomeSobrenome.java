import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
public class EscreveNomeSobrenome {
    public static void main(String[]args) throws IOException {
        String nome = "C:\\Users\\felip\\OneDrive\\Área de Trabalho\\JAVA\\AULA 15\\Nome.txt";
        String sobrenome= "C:\\Users\\felip\\OneDrive\\Área de Trabalho\\JAVA\\AULA 15\\Sobrenome.txt";
        String nomeSobrenome= "C:\\Users\\felip\\OneDrive\\Área de Trabalho\\JAVA\\AULA 15\\nomeSobrenome.txt";

        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(nome));
            BufferedReader reader2 = new BufferedReader(new FileReader(sobrenome));

            String nome1= "";
            String sobrenome1 = "";
            String line = reader1.readLine();
            String line2 = reader2.readLine();
            while (line != null) {
                nome1 +=  "\n" + line ;
                line = reader1.readLine();
            }
            reader1.close();
            while (line2 != null) {
               sobrenome1 +=  "\n" + line2 ;
                line2 = reader2.readLine();
            }

            reader2.close();
            String result = nome1 + " " +sobrenome1;
            FileWriter writer = new FileWriter(nomeSobrenome);
            writer.write(result);
            writer.close();
            System.out.println("Arquivos concatenados com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


