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

        //Adicionando elementos à fila
        Fila fila = new Fila();

        // Adicionando clientes à fila
        fila.enqueue("Alice", 101, "Consulta");
        fila.enqueue("Bob", 102, "Retorno de Exames");
        fila.enqueue("Carlos", 103, "Consulta");

        // Exibindo a fila atual
        System.out.println("\nEstado atual da fila:");
        fila.displayQueue();

        // Atendendo o próximo cliente
        fila.dequeue();

        // Exibindo a fila após atendimento
        System.out.println("\nEstado da fila após atendimento:");
        fila.displayQueue();

    }
}
