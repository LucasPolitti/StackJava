import java.util.Stack;

public class AulaStack{
    public static void main(String[] args) {

        Stack<String> carros = new Stack<>();

        carros.push("HRV");
        carros.push("Golf");
        carros.push("Polo");
        carros.push("Camaro");
        carros.push("Tiggo 3X");

        System.out.println("Topo da fila: " + carros.peek()); //Apresenta o elemento no topo da lista

        System.out.println("Topo da fila: " + carros.pop()); //Apresenta e retira o elemento no topo da lista

        System.out.println(carros);

        System.out.println(carros.empty() ? "Pilha vazia" : "Pilha com elementos");
 

        
    }
}