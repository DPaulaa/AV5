import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class GravadorDeClientes {
 public static void main(String[] args) {  
     //array de clientes 
     ArrayList<Cliente> clientes = new ArrayList<>();
     clientes.add(new Cliente("Alice", 30));
     clientes.add(new Cliente("Bob", 25));
     clientes.add(new Cliente("Carlos", 40));
     try {
         //criar o arquivo .txt com os arrays antes criados, pulando linha por linha
         FileWriter escritor = new FileWriter("clientes.txt");
         for (Cliente c : clientes) {
         escritor.write(c.toString() + "\n");
         }
         escritor.close();
         System.out.println("Clientes gravados com sucesso!");
     } catch (IOException e) {
         System.out.println("Erro ao gravar clientes.");
         e.printStackTrace();
     }
 }
}
