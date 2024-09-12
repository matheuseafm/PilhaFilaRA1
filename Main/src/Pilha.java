import java.time.LocalDateTime;

public class Pilha {
    private NodePilha top;

    // Construtor
    public Pilha() {
        top = null;
    }

    // Método para adicionar uma nova solicitação na pilha
    public void push(int id, String description, LocalDateTime dateTime) {
        NodePilha newNodePilha = new NodePilha(id, description, dateTime);
        newNodePilha.next = top;
        top = newNodePilha;
        System.out.println("Solicitação adicionada: " + description);
    }

    // Método para remover a solicitação do topo da pilha
    public NodePilha pop() {
        if (top == null) {
            System.out.println("A pilha está vazia.");
            return null;
        }
        NodePilha removedNode = top;
        top = top.next;
        System.out.println("Solicitação removida: " + removedNode.description);
        return removedNode;
    }

    // Método para exibir o estado atual da pilha
    public void displayStack() {
        if (top == null) {
            System.out.println("A pilha está vazia.");
        } else {
            displayStackRecursively(top);
        }
    }
    
    //Adicionado para não utilizar while e sim Recursão
    private void displayStackRecursively(NodePilha top2) {
        if (top2 == null) {
            return; // Condição de parada
        }
        System.out.println(
            "ID: " + top2.id + ", Descrição: " + top2.description + ", Data e Hora: " + top2.dateTime);
        displayStackRecursively(top2.next); // Chama a função recursivamente para o próximo nó
    }

}