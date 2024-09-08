package entities;

public class Fila {
    private NodeFila front; // Aponta para o primeiro elemento da fila
    private NodeFila rear; // Aponta para o último elemento da fila
    private int nextSenha; // Contador para o próximo número de senha

    public Fila() {
        this.front = null;
        this.rear = null;
        this.nextSenha = 1; // Inicia o contador de senhas com 1
    }

    // Método para adicionar um cliente à fila
    public void enqueue(String name, String reason) {
        NodeFila newNode = new NodeFila(name, nextSenha, reason);

        // Se a fila estiver vazia, o novo nó é tanto o início quanto o fim da fila
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            // Caso contrário, adiciona o novo nó ao fim da fila
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Cliente adicionado: " + name + " com senha: " + nextSenha);
        nextSenha++; // Incrementa o contador de senhas para o próximo cliente
    }

    // Método para atender o próximo cliente (remover da frente da fila)
    public NodeFila dequeue() {
        if (front == null) {
            System.out.println("A fila está vazia.");
            return null;
        }

        NodeFila removedNode = front;
        front = front.next;

        // Se a frente da fila ficar vazia após a remoção, ajusta o ponteiro traseiro
        if (front == null) {
            rear = null;
        }

        System.out.println("Cliente atendido: " + removedNode.name + " com senha: " + removedNode.id);
        return removedNode;
    }

    // Método para exibir o estado atual da fila
    public void displayQueue() {
        if (front == null) {
            System.out.println("A fila está vazia.");
            return;
        }

        NodeFila current = front;
        while (current != null) {
            System.out.println("Nome: " + current.name + ", Senha: " + current.id + ", Motivo: " + current.reason);
            current = current.next;
        }
    }
}
