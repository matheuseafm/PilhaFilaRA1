import java.time.LocalDateTime;

public class Pilha {
    private static Node top;

    public Pilha() {
        top = null;
    }

    // Método para adicionar uma nova solicitação na pilha
    public static void push(int id, String description, LocalDateTime dateTime) {
        Node newNode = new Node(id, description, dateTime);
        newNode.next = top;
        top = newNode;
        System.out.println("Solicitação adicionada: " + description);
    }

    // Método para remover a solicitação do topo da pilha
    public static Node pop() {
        if (top == null) {
            System.out.println("A pilha está vazia.");
            return null;
        }
        Node removedNode = top;
        top = top.next;
        System.out.println("Solicitação removida: " + removedNode.description);
        return removedNode;
    }

    // Método para exibir o estado atual da pilha
    public static void displayStack() {
        if (top == null) {
            System.out.println("A pilha está vazia.");
            return;
        }

        Node current = top;
        while (current != null) {
            System.out.println("ID: " + current.id + ", Descrição: " + current.description + ", Data e Hora: " + current.dateTime);
            current = current.next;
        }
    }
}
