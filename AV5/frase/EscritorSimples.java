import java.io.FileWriter;
import java.io.IOException;

public class EscritorSimples {
     public static void main(String[] args) {
         //criar um arquivo .txt com uma franse dentro do arquivo
         try {
             FileWriter escritor = new FileWriter("frase.txt");
             escritor.write("A prática leva à perfeição!");
             escritor.close();
             System.out.println("Frase escrita com sucesso!"); //frase de sucesso de processo
        //exceção em que ocorra um erro ao criar um arquivo .txt
         } catch (IOException e) {
             System.out.println("Ocorreu um erro ao escrever o arquivo.");
             e.printStackTrace();
         }
     }
}