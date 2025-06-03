import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class LeitorSimples {
 public static void main(String[] args) {
     try {
         //ler o que esta no arquivo .txt
         FileReader leitor = new FileReader("frase.txt");
         BufferedReader buffer = new BufferedReader(leitor);
         String linha;
         //ler o que não for nulo, ou seja, irá exibir apenas o texto dentro do .txt
             while ((linha = buffer.readLine()) != null) {
             System.out.println("Frase lida: " + linha);
             }
         buffer.close();
         leitor.close();
    //erro caso, por exemplo, o arquivo não exista 
     } catch (IOException e) {
         System.out.println("Erro ao ler o arquivo.");
         e.printStackTrace();
     }
 }
}