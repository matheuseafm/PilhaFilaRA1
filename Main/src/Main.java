import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {


        // Adicionando solicitações
        Pilha.push(1, "Solicitação 1", LocalDateTime.now());
        Pilha.push(2, "Solicitação 2", LocalDateTime.now());
        Pilha.push(3, "Solicitação 3", LocalDateTime.now());

        // Exibindo a pilha atual
        System.out.println("\nEstado atual da pilha:");
        Pilha.displayStack();

        // Removendo uma solicitação
        Pilha.pop();

        // Exibindo a pilha após remoção
        System.out.println("\nEstado da pilha após remoção:");
        Pilha.displayStack();
    }
}
